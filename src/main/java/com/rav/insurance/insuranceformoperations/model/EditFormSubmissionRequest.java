package com.rav.insurance.insuranceformoperations.model;

public class EditFormSubmissionRequest extends GetInsuranceFormResponse {
	private String loggedInUserEmailAddress;
	private String userId;

	public String getLoggedInUserEmailAddress() {
		return loggedInUserEmailAddress;
	}

	public void setLoggedInUserEmailAddress(String loggedInUserEmailAddress) {
		this.loggedInUserEmailAddress = loggedInUserEmailAddress;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
