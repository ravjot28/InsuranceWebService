package com.rav.insurance.useroperations.model;

import com.rav.insurance.model.CommonResponseAttributes;


public class InsuranceLoginResponse extends CommonResponseAttributes {

	private String userEmailAddress;
	private String userMobileNumber;
	private String userInterests;
	private String userFullName;
	private String userAlternativeEmailAddress;

	public String getUserEmailAddress() {
		return userEmailAddress;
	}

	public void setUserEmailAddress(String userEmailAddress) {
		this.userEmailAddress = userEmailAddress;
	}

	public String getUserMobileNumber() {
		return userMobileNumber;
	}

	public void setUserMobileNumber(String userMobileNumber) {
		this.userMobileNumber = userMobileNumber;
	}

	public String getUserInterests() {
		return userInterests;
	}

	public void setUserInterests(String userInterests) {
		this.userInterests = userInterests;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserAlternativeEmailAddress() {
		return userAlternativeEmailAddress;
	}

	public void setUserAlternativeEmailAddress(
			String userAlternativeEmailAddress) {
		this.userAlternativeEmailAddress = userAlternativeEmailAddress;
	}

}
