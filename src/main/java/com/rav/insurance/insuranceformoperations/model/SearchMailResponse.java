package com.rav.insurance.insuranceformoperations.model;

import java.util.List;

import com.rav.insurance.model.CommonResponseAttributes;

public class SearchMailResponse extends CommonResponseAttributes {

	private List<MailInfo> mailList;

	public List<MailInfo> getMailList() {
		return mailList;
	}

	public void setMailList(List<MailInfo> mailList) {
		this.mailList = mailList;
	}

}
