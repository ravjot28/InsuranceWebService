package com.rav.insurance.useroperations.model;

import com.rav.insurance.model.CommonResponseAttributes;

public class InsuranceLoginResponse extends CommonResponseAttributes {

	private String userEmailAddress;
	private String userFullName;
	private String loggedInUserEmailAddress;
	private String role;

	public String getUserEmailAddress() {
		return userEmailAddress;
	}

	public void setUserEmailAddress(String userEmailAddress) {
		this.userEmailAddress = userEmailAddress;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLoggedInUserEmailAddress() {
		return loggedInUserEmailAddress;
	}

	public void setLoggedInUserEmailAddress(String loggedInUserEmailAddress) {
		this.loggedInUserEmailAddress = loggedInUserEmailAddress;
	}

}
