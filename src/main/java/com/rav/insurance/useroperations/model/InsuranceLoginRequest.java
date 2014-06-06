package com.rav.insurance.useroperations.model;

import com.rav.insurance.model.CommonRequestAttributes;


public class InsuranceLoginRequest extends CommonRequestAttributes {

	private String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
