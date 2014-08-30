package com.rav.insurance.useroperations.model;

import java.util.Date;

import com.rav.insurance.model.CommonResponseAttributes;

public class InsuranceLoginResponse extends CommonResponseAttributes {

	private String userEmailAddress;
	private String userFullName;
	private String loggedInUserEmailAddress;
	private String role;
	private Date currentDate;
	private String branch;

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

	public Date getCurrentDate() {
		return currentDate;
	}

	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

}
