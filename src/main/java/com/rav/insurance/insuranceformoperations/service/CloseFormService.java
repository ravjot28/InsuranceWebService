package com.rav.insurance.insuranceformoperations.service;

import java.util.Calendar;

import javax.xml.ws.WebServiceContext;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.bean.CloseFormBean;
import com.rav.insurance.insuranceformoperations.dao.InsuranceFormDAO;
import com.rav.insurance.insuranceformoperations.model.CloseFormRequest;
import com.rav.insurance.log.bean.RequestResponseLoggingBean;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.util.CommonValidations;
import com.rav.insurance.util.RequestResponseLoggingDAO;

public class CloseFormService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		CommonResponseAttributes response = null;
		CloseFormRequest request = (CloseFormRequest) model;
		try {
			validateRequest(request);
			CloseFormBean bean = new CloseFormBean();
			bean.setBusinessWithUs(request.getBusinessWithUs());
			bean.setCompany(request.getCompany());
			bean.setQuote(request.getQuote());
			bean.setFormId(request.getFormId());
			InsuranceFormDAO dao = new InsuranceFormDAO();
			
			dao.insertCloseFormInformation(bean);
			response = new CommonResponseAttributes();
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
			bean.setRequestType("CLOSE_FORM");
			
			RequestResponseLoggingDAO.log(bean);
			
			response = new CommonResponseAttributes();
			response.setStatus(CommonConstants.ERROR);
			response.setErrorMessage(e.getMessage());
		}
		return response;
	}

	@Override
	public void validateRequest(Object dto) throws Exception {
		CloseFormRequest request = (CloseFormRequest) dto;
		if (!CommonValidations.isStringEmpty(request.getBusinessWithUs())) {
			if (!CommonValidations.isStringEmpty(request.getCompany())) {
				if (!CommonValidations.isStringEmpty(request.getFormId())) {
					if (request.getQuote() <= 0) {
						throw new Exception("Invalid Quote");
					}
				} else {
					throw new Exception("Empty Form ID");
				}
			} else {
				throw new Exception("Empty Company Name");
			}
		} else {
			throw new Exception("Empty Business with Us");
		}
	}

	@Override
	public Object createDTO(Object model, WebServiceContext wsContext) {
		// TODO Auto-generated method stub
		return null;
	}

}
