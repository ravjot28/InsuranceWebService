package com.rav.insurance.insuranceformoperations.bean;

import java.io.Serializable;
import java.util.Date;

public class MessageNew implements Serializable {
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	public String getFrom1() {
		return from1;
	}
	public void setFrom1(String from1) {
		this.from1 = from1;
	}
	public String getRecepients() {
		return recepients;
	}
	public void setRecepients(String recepients) {
		this.recepients = recepients;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	private Date sentDate;
	private Date receivedDate;
	private String from1;
	private String recepients;
	private String subject;
}
