package com.rav.insurance.useroperations.model;

import com.rav.insurance.model.CommonRequestAttributes;

public class InsuranceUpdateCredentialRequest extends CommonRequestAttributes {

	private String newPassword;
	private String password;
	private String code;

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
