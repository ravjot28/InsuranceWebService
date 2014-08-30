package com.rav.insurance.useroperations.dto;

import com.rav.insurance.dto.CommonDTO;

public class RegistrationDTO extends CommonDTO {

	private String title;
	private String fullName;
	private String emailAddress;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
