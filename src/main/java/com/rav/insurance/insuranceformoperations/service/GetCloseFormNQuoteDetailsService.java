package com.rav.insurance.insuranceformoperations.service;

import javax.xml.ws.WebServiceContext;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.dao.InsuranceFormDAO;
import com.rav.insurance.insuranceformoperations.model.GetCloseFormNQuoteDetailsResponse;
import com.rav.insurance.insuranceformoperations.model.SearchMailRequest;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.util.CommonValidations;

public class GetCloseFormNQuoteDetailsService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		GetCloseFormNQuoteDetailsResponse response = null;
		SearchMailRequest request = (SearchMailRequest) model;
		try {
			validateRequest(request);
			response = new InsuranceFormDAO().getCloseFormNQuoteDetails(request
					.getFormId());
			response.setStatus(CommonConstants.SUCCESS);
		} catch (Exception e) {
			response = new GetCloseFormNQuoteDetailsResponse();
			response.setStatus(CommonConstants.ERROR);
			response.setErrorMessage(e.getMessage());
		}
		return null;
	}

	@Override
	public void validateRequest(Object dto) throws Exception {
		SearchMailRequest request = (SearchMailRequest) dto;
		if (CommonValidations.isStringEmpty(request.getFormId())) {
			throw new Exception("Empty form id");
		}

	}

	@Override
	public Object createDTO(Object model, WebServiceContext wsContext) {
		// TODO Auto-generated method stub
		return null;
	}

}
