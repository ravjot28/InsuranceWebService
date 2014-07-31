package com.rav.insurance.insuranceformoperations.model;

import com.rav.insurance.model.CommonRequestAttributes;

public class GetInsuranceFormListRequest extends CommonRequestAttributes {
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
