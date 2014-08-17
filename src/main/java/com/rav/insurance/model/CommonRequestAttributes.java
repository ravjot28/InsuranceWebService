package com.rav.insurance.model;

public class CommonRequestAttributes {
	private String userId;
	private String loggedInUserEmailAddress;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLoggedInUserEmailAddress() {
		return loggedInUserEmailAddress;
	}

	public void setLoggedInUserEmailAddress(String loggedInUserEmailAddress) {
		this.loggedInUserEmailAddress = loggedInUserEmailAddress;
	}

}
