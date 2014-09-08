package com.rav.insurance.insuranceformoperations.model;

import com.rav.insurance.model.CommonResponseAttributes;

public class DownloadProposalBinderResponse extends CommonResponseAttributes {

	private byte[] binder;
	private byte[] proposal;

	public byte[] getBinder() {
		return binder;
	}

	public void setBinder(byte[] binder) {
		this.binder = binder;
	}

	public byte[] getProposal() {
		return proposal;
	}

	public void setProposal(byte[] proposal) {
		this.proposal = proposal;
	}

}
