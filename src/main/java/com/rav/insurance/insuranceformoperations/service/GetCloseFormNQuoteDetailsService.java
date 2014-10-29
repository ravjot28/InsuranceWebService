package com.rav.insurance.insuranceformoperations.service;

import java.util.Calendar;

import javax.xml.ws.WebServiceContext;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.dao.InsuranceFormDAO;
import com.rav.insurance.insuranceformoperations.model.GetCloseFormNQuoteDetailsResponse;
import com.rav.insurance.insuranceformoperations.model.SearchMailRequest;
import com.rav.insurance.log.bean.RequestResponseLoggingBean;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.util.CommonValidations;
import com.rav.insurance.util.RequestResponseLoggingDAO;

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
			RequestResponseLoggingBean bean = new RequestResponseLoggingBean();
			StackTraceElement[] stack = e.getStackTrace();
			String theTrace = "";
			for(StackTraceElement line : stack)
			{
			   theTrace += "\n"+line.toString();
			}
			bean.setDate(Calendar.getInstance().getTime());
			bean.setException(theTrace);
			bean.setLoggedInUser(request.getUserId());
			bean.setRequestType("GET_CLOSE_QUERY_FORM_DETAILS");
			
			RequestResponseLoggingDAO.log(bean);
			
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
