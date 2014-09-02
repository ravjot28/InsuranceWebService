package com.rav.insurance.insuranceformoperations.model;

import com.rav.insurance.model.CommonRequestAttributes;

public class GetInsuranceFormListRequest extends CommonRequestAttributes {
	private String producerId;
	private String marketerId;
	private String status;
	private String businessName;
	private int formId;
	private int month;

	public String getProducerId() {
		return producerId;
	}

	public void setProducerId(String producerId) {
		this.producerId = producerId;
	}

	public String getMarketerId() {
		return marketerId;
	}

	public void setMarketerId(String marketerId) {
		this.marketerId = marketerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBusinessName() {
		return businessName;
	}

	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	public int getFormId() {
		return formId;
	}

	public void setFormId(int formId) {
		this.formId = formId;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

}
