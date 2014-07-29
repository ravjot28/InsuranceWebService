package com.rav.insurance.useroperations.model;

import java.util.List;

import com.rav.insurance.insuranceformoperations.bean.InsuranceFormBean;
import com.rav.insurance.model.CommonResponseAttributes;

public class InsuranceLoginResponse extends CommonResponseAttributes {

	private String userEmailAddress;
	private String userFullName;
	private String role;
	private List<InsuranceFormBean> formList;

	public List<InsuranceFormBean> getFormList() {
		return formList;
	}

	public void setFormList(List<InsuranceFormBean> formList) {
		this.formList = formList;
	}

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

}
