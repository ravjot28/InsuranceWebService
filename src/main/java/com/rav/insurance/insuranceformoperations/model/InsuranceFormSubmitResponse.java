package com.rav.insurance.insuranceformoperations.model;

import com.rav.insurance.model.CommonResponseAttributes;

public class InsuranceFormSubmitResponse extends CommonResponseAttributes {
	private String formId;

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

}
