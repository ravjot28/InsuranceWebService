package com.rav.insurance.insuranceformoperations.webservice;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.soap.MTOM;

import com.rav.insurance.insuranceformoperations.model.AssignMarketerRequest;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormListRequest;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormListResponse;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormRequest;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormResponse;
import com.rav.insurance.insuranceformoperations.model.InsuranceFormSubmitRequest;
import com.rav.insurance.insuranceformoperations.model.InsuranceFormSubmitResponse;
import com.rav.insurance.insuranceformoperations.model.PostFormMailRequest;
import com.rav.insurance.insuranceformoperations.service.AssignMarketerService;
import com.rav.insurance.insuranceformoperations.service.GetFormListSerivce;
import com.rav.insurance.insuranceformoperations.service.GetFormService;
import com.rav.insurance.insuranceformoperations.service.PostFormMailService;
import com.rav.insurance.insuranceformoperations.service.SubmitFormService;
import com.rav.insurance.insuranceformoperations.webservice.contracts.InsuranceOperationsWS;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.service.ServiceAbstract;

@MTOM
@WebService(endpointInterface = "com.rav.insurance.insuranceformoperations.webservice.contracts.InsuranceOperationsWS", serviceName = "InsuranceOperationsService", portName = "InsuranceOperationsPort")
public class InsuranceOperationsWebService implements InsuranceOperationsWS {
	@Resource
	WebServiceContext wsContext;

	private ServiceAbstract service;

	@Override
	public InsuranceFormSubmitResponse submitForm(
			InsuranceFormSubmitRequest request) throws Exception {
		service = new SubmitFormService();
		return (InsuranceFormSubmitResponse) service.processRequest(request,
				wsContext);
	}

	@Override
	public GetInsuranceFormListResponse getFormList(
			GetInsuranceFormListRequest request) throws Exception {
		service = new GetFormListSerivce();
		return (GetInsuranceFormListResponse) service.processRequest(request,
				wsContext);
	}

	@Override
	public GetInsuranceFormResponse getForm(GetInsuranceFormRequest request)
			throws Exception {
		service = new GetFormService();
		return (GetInsuranceFormResponse) service.processRequest(request,
				wsContext);
	}

	@Override
	public CommonResponseAttributes assignMarketer(AssignMarketerRequest request)
			throws Exception {
		service = new AssignMarketerService();
		return (CommonResponseAttributes) service.processRequest(request,
				wsContext);
	}

	@Override
	public CommonResponseAttributes postFormMail(PostFormMailRequest request)
			throws Exception {
		service = new PostFormMailService();
		return (CommonResponseAttributes) service.processRequest(request,
				wsContext);
	}

}
