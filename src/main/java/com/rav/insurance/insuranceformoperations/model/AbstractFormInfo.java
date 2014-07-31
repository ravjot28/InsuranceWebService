package com.rav.insurance.insuranceformoperations.model;

public class AbstractFormInfo {
	private String formId;
	private String producerId;
	private String marketerId;
	private String status;

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

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

}
