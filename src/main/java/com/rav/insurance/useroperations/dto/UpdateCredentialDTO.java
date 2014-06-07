package com.rav.insurance.useroperations.dto;

import com.rav.insurance.dto.CommonDTO;

public class UpdateCredentialDTO extends CommonDTO {
	private String newPassword;
	private String code;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

}
