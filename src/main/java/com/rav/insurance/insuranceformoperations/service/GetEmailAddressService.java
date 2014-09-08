package com.rav.insurance.insuranceformoperations.service;

import javax.xml.ws.WebServiceContext;

import com.rav.insurance.insuranceformoperations.dao.InsuranceFormDAO;
import com.rav.insurance.service.ServiceAbstract;

public class GetEmailAddressService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		String emailAddress= null;
		try {
			emailAddress = new InsuranceFormDAO().getEmailAddress((String) model);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emailAddress;
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
