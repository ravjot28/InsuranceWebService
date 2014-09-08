package com.rav.insurance.insuranceformoperations.model;

import java.util.List;

import com.rav.insurance.model.CommonResponseAttributes;

public class SearchQuotesResponse extends CommonResponseAttributes {
	private List<QuoteDetailsRequest> list;

	public List<QuoteDetailsRequest> getList() {
		return list;
	}

	public void setList(List<QuoteDetailsRequest> list) {
		this.list = list;
	}
	
	
}
