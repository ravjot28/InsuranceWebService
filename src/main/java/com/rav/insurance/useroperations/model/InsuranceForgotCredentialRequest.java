package com.rav.insurance.useroperations.model;

import com.rav.insurance.model.CommonRequestAttributes;

public class InsuranceForgotCredentialRequest extends CommonRequestAttributes {

	private String emailAddress;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
