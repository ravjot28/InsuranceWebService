package com.rav.insurance.insuranceformoperations.model;

import com.rav.insurance.model.CommonRequestAttributes;

public class AssignMarketerRequest extends CommonRequestAttributes {

	private String formId;
	private String marketerUserId;

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getMarketerUserId() {
		return marketerUserId;
	}

	public void setMarketerUserId(String marketerUserId) {
		this.marketerUserId = marketerUserId;
	}

}
