package com.rav.insurance.useroperations.dto;

import com.rav.insurance.dto.CommonDTO;

public class ForgotCredentialDTO extends CommonDTO {

	private String emailAddress;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
