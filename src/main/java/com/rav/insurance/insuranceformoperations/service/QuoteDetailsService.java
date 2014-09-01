package com.rav.insurance.insuranceformoperations.service;

import javax.xml.ws.WebServiceContext;

import org.dozer.DozerBeanMapper;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.bean.QuoteDetailsBean;
import com.rav.insurance.insuranceformoperations.dao.InsuranceFormDAO;
import com.rav.insurance.insuranceformoperations.model.QuoteDetailsRequest;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.service.ServiceAbstract;

public class QuoteDetailsService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		QuoteDetailsRequest request = (QuoteDetailsRequest) model;
		CommonResponseAttributes response = null;
		try {
			DozerBeanMapper mapper = new DozerBeanMapper();
			QuoteDetailsBean bean = new QuoteDetailsBean();
			mapper.map(request, bean);
			bean.setFormId(request.getFormId());
			InsuranceFormDAO dao = new InsuranceFormDAO();
			dao.insertQuoteDetails(bean);
		} catch (Exception e) {
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
