package com.rav.insurance.insuranceformoperations.bean;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "DELAY_MAILS")
public class DelayMails {
	@Id
	@GeneratedValue(generator = "messageID_seq1", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(allocationSize = 1, initialValue = 1001, sequenceName = "messageID_seq1", name = "messageID_seq1")
	private Long id;
	private Date sentDate;
	private String from1;
	private String recepients;
	private String subject;
	private String formId;
	@Transient
	private String message;

	public Date getSentDate() {
		return sentDate;
	}

	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}
}