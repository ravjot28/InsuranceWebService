package com.rav.insurance.insuranceformoperations.model;

import java.util.Date;

import com.rav.insurance.model.CommonRequestAttributes;

public class SearchQuotesRequest extends CommonRequestAttributes {

	private Date creationDate;
	private String marketerId;
	private String companyName;

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getMarketerId() {
		return marketerId;
	}

	public void setMarketerId(String marketerId) {
		this.marketerId = marketerId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

}
