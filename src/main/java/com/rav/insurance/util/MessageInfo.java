package com.rav.insurance.util;

import java.util.Date;

public class MessageInfo {

	private Date sentDate;
	private Date receivedDate;
	private String from;
	private String recepients;
	private String message;
	private String subject;

	public Date getSentDate() {
		return sentDate;
	}

	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}

	public Date getReceivedDate() {
		return receivedDate;
	}

	public void setReceivedDate(Date receivedDate) {
		this.receivedDate = receivedDate;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getRecepients() {
		return recepients;
	}

	public void setRecepients(String recepients) {
		this.recepients = recepients;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

}
