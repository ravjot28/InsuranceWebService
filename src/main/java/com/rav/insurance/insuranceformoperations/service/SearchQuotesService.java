package com.rav.insurance.insuranceformoperations.service;

import java.util.List;

import javax.xml.ws.WebServiceContext;

import com.rav.insurance.insuranceformoperations.dao.InsuranceFormDAO;
import com.rav.insurance.insuranceformoperations.model.QuoteDetailsRequest;
import com.rav.insurance.insuranceformoperations.model.SearchQuotesRequest;
import com.rav.insurance.insuranceformoperations.model.SearchQuotesResponse;
import com.rav.insurance.service.ServiceAbstract;

public class SearchQuotesService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		try {
			InsuranceFormDAO dao = new InsuranceFormDAO();
			List<QuoteDetailsRequest> finalList = dao.getQuoteDetails(
					((SearchQuotesRequest) model).getCreationDate(),
					((SearchQuotesRequest) model).getCompanyName(),
					((SearchQuotesRequest) model).getMarketerId());
			SearchQuotesResponse response = new SearchQuotesResponse();
			response.setList(finalList);
			return response;
		} catch (Exception e) {
		}
		return null;
	}

	@Override
	public void validateRequest(Object dto) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Object createDTO(Object model, WebServiceContext wsContext) {
		// TODO Auto-generated method stub
		return null;
	}

}
