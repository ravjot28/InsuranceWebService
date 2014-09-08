package com.rav.insurance.insuranceformoperations.model;

import com.rav.insurance.model.CommonRequestAttributes;

public class DownloadProposalBinderRequest extends CommonRequestAttributes {

	private boolean proposal;
	private boolean binder;
	private String formId;

	public boolean isProposal() {
		return proposal;
	}

	public void setProposal(boolean proposal) {
		this.proposal = proposal;
	}

	public boolean isBinder() {
		return binder;
	}

	public void setBinder(boolean binder) {
		this.binder = binder;
	}

	public String getFormId() {
		return formId;
	}

	public void setFormId(String formId) {
		this.formId = formId;
	}

}
