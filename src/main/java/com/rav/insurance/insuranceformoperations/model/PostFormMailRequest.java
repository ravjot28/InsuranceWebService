package com.rav.insurance.insuranceformoperations.model;

import java.util.Date;

import com.rav.insurance.model.CommonRequestAttributes;

public class PostFormMailRequest extends CommonRequestAttributes {

	private String from;
	private String recpients;
	private String subject;
	private byte[] message;
	private String formId;
	private Date sendDate;

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getRecpients() {
		return recpients;
	}

	public void setRecpients(String recpients) {
		this.recpients = recpients;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public byte[] getMessage() {
		return message;
	}

	public void setMessage(byte[] message) {
		this.message = message;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

}
