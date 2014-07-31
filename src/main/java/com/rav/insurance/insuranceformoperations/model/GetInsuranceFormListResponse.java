package com.rav.insurance.insuranceformoperations.model;

import java.util.List;

import com.rav.insurance.model.CommonResponseAttributes;

public class GetInsuranceFormListResponse extends CommonResponseAttributes {
	List<AbstractFormInfo> formList;

	public List<AbstractFormInfo> getFormList() {
		return formList;
	}

	public void setFormList(List<AbstractFormInfo> formList) {
		this.formList = formList;
	}
	
	
}
