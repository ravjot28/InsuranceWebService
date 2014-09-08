package com.rav.insurance.insuranceformoperations.model;

import com.rav.insurance.model.CommonRequestAttributes;

public class UploadProposalBinderRequest extends CommonRequestAttributes {

	private byte[] proposal;
	private byte[] binder;
	private String formId;

	public byte[] getProposal() {
		return proposal;
	}

	public void setProposal(byte[] proposal) {
		this.proposal = proposal;
	}

	public byte[] getBinder() {
		return binder;
	}

	public void setBinder(byte[] binder) {
		this.binder = binder;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

}
