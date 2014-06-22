package com.rav.insurance.insuranceformoperations.webservice;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import com.rav.insurance.insuranceformoperations.model.InsuranceFormSubmitRequest;
import com.rav.insurance.insuranceformoperations.service.SubmitFormService;
import com.rav.insurance.insuranceformoperations.webservice.contracts.InsuranceOperationsWS;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.service.ServiceAbstract;

@WebService(endpointInterface = "com.rav.insurance.insuranceformoperations.webservice.contracts.InsuranceOperationsWS", serviceName = "InsuranceOperationsService", portName = "InsuranceOperationsPort")
public class InsuranceOperationsWebService implements InsuranceOperationsWS {
	@Resource
	WebServiceContext wsContext;

	private ServiceAbstract service;

	@Override
	public CommonResponseAttributes submitForm(
			InsuranceFormSubmitRequest request) throws Exception {
		service = new SubmitFormService();
		return (CommonResponseAttributes) service.processRequest(request, wsContext);
	}

}
