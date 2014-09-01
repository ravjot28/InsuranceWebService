package com.rav.insurance.insuranceformoperations.model;

import com.rav.insurance.model.CommonRequestAttributes;

public class CloseFormRequest extends CommonRequestAttributes {

	private String formId;
	private String businessWithUs;
	private String company;
	private double quote;

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

	public String getBusinessWithUs() {
		return businessWithUs;
	}

	public void setBusinessWithUs(String businessWithUs) {
		this.businessWithUs = businessWithUs;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getQuote() {
		return quote;
	}

	public void setQuote(double quote) {
		this.quote = quote;
	}

}
