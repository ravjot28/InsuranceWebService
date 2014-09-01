package com.rav.insurance.insuranceformoperations.model;

import java.util.Date;

public class MailInfo {

	private String from;
	private String to;
	private String subject;
	private String mailBody;
	private Date sentdDate;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMailBody() {
		return mailBody;
	}

	public void setMailBody(String mailBody) {
		this.mailBody = mailBody;
	}

	public Date getSentdDate() {
		return sentdDate;
	}

	public void setSentdDate(Date sentdDate) {
		this.sentdDate = sentdDate;
	}

}
