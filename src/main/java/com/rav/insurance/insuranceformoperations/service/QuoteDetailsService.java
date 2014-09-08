package com.rav.insurance.insuranceformoperations.service;

import java.util.Calendar;

import javax.xml.ws.WebServiceContext;

import org.dozer.DozerBeanMapper;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.bean.QuoteDetailsBean;
import com.rav.insurance.insuranceformoperations.dao.InsuranceFormDAO;
import com.rav.insurance.insuranceformoperations.model.QuoteDetailsRequest;
import com.rav.insurance.log.bean.RequestResponseLoggingBean;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.util.RequestResponseLoggingDAO;

public class QuoteDetailsService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		QuoteDetailsRequest request = (QuoteDetailsRequest) model;
		CommonResponseAttributes response = null;
		try {
			DozerBeanMapper mapper = new DozerBeanMapper();
			QuoteDetailsBean bean = new QuoteDetailsBean();
			mapper.map(request, bean);
			bean.setFormId(request.getApplicationid());
			InsuranceFormDAO dao = new InsuranceFormDAO();
			dao.insertQuoteDetails(bean);
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
			bean.setRequestType("QUOTE_DETAILS");
			
			RequestResponseLoggingDAO.log(bean);
			
			response = new CommonResponseAttributes();
			response.setStatus(CommonConstants.ERROR);
			response.setErrorMessage(e.getMessage());
		}
		return response;
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
