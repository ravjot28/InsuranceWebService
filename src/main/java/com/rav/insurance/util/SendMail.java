package com.rav.insurance.util;

import java.io.UnsupportedEncodingException;
import java.security.Security;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import com.sun.net.ssl.internal.ssl.Provider;

/** * * @author Rav */
public class SendMail implements Runnable {
	private String SMTP_HOST_NAME;
	private String SMTP_PORT;
	private String debug;
	private String auth;
	private String MsgTxt = null;
	private String Subject = null;
	private String From = null;
	private String pwd = null;
	private String[] too;
	private String[] attachements;
	private Thread th;

	public static void main(String as[]) {
		String[] a = { "C:\\Documents and Settings\\developer\\Desktop\\MailRead\\main.mf" };
		String[] to = { "harmansingh1699@gmail.com" };
		new SendMail("Asdsad", "ererr", a, to).send();
	}

	public SendMail(String hostName, String portNmber, String debug,
			String auth, String from, String password, String sub, String msg,
			String[] attachments, String[] to) {
		this.SMTP_HOST_NAME = hostName;
		this.SMTP_PORT = portNmber;
		this.debug = debug;
		this.auth = auth;
		this.MsgTxt = msg;
		this.Subject = sub;
		this.From = from;
		this.pwd = password;
		this.too = to;
		this.attachements = attachments;
	}

	public SendMail(String from, String password, String sub, String msg,
			String[] attachments, String[] to) {
		this.SMTP_HOST_NAME = "192.168.105.10";
		this.SMTP_PORT = "143";
		this.debug = Boolean.toString(true);
		this.auth = Boolean.toString(true);
		this.MsgTxt = msg;
		this.Subject = sub;
		this.From = from;
		this.pwd = password;
		this.too = to;
		this.attachements = attachments;
	}

	public SendMail(String sub, String msg, String[] to) {
		this(sub, msg, null, to);
	}

	public SendMail(String sub, String msg, String[] attachments, String[] to) {
		this.SMTP_HOST_NAME = "192.168.105.10";
		this.SMTP_PORT = "143";
		this.debug = Boolean.toString(true);
		this.auth = Boolean.toString(true);
		this.MsgTxt = msg;
		this.Subject = sub;
		this.From = "hsingh@uccig.com";
		this.pwd = "Password!23";
		this.too = to;
		this.attachements = attachments;
	}

	public void send() {
		th = new Thread(this);
		th.start();
	}

	private void sendSSLMessage(String[] recipients, String subject,
			String message, String from, String pwd, String[] attachement)
			throws MessagingException, UnsupportedEncodingException {
		boolean debug = true;
		Properties props = new Properties();
		props.put("mail.smtp.host", "192.168.105.10");
		props.put("mail.smtp.auth", "false");
		props.put("mail.debug", "true");

		Session session = Session.getInstance(props, new MyAuth());
		session.setDebug(debug);
		MimeMessage msg = new MimeMessage(session);
		InternetAddress addressFrom = new InternetAddress(from, "UCCIG");
		msg.setFrom(addressFrom);
		InternetAddress[] addressTo = new InternetAddress[recipients.length];
		for (int i = 0; i < recipients.length; i++) {
			addressTo[i] = new InternetAddress(recipients[i]);
		}
		InternetAddress[] addressCC = new InternetAddress[1];
		addressCC[0] = new InternetAddress("hsingh@uccig.com");
		msg.setRecipients(Message.RecipientType.BCC, addressTo);
		msg.setRecipients(Message.RecipientType.CC, addressCC);
		msg.setSubject(subject);
		MimeBodyPart mbp1 = new MimeBodyPart();
		mbp1.setText(message);
		Multipart mp = new MimeMultipart();
		mp.addBodyPart(mbp1);
		if (attachement != null && attachement.length > 0) {
			MimeBodyPart[] attachment = new MimeBodyPart[attachement.length];
			for (int i = 0; i < attachement.length; i++) {
				attachment[i] = new MimeBodyPart();
				FileDataSource fds = new FileDataSource(attachement[i]);
				attachment[i].setDataHandler(new DataHandler(fds));
				attachment[i].setFileName(fds.getName());
			}
			for (int j = 0; j < attachement.length; j++) {
				mp.addBodyPart(attachment[j]);
			}
		}
		msg.setContent(mp);
		Transport.send(msg);
	}

	@Override
	public void run() {

		try {
			sendSSLMessage(this.too, this.Subject, this.MsgTxt, this.From,
					this.pwd, this.attachements);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	class MyAuth extends Authenticator {
		protected PasswordAuthentication getPasswordAuthentication() {
			return new PasswordAuthentication(From, pwd);
		}
	}
}