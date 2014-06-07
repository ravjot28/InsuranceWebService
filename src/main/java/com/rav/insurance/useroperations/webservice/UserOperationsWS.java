package com.rav.insurance.useroperations.webservice;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;

import com.rav.insurance.model.CommonRequestAttributes;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.useroperations.model.InsuranceLoginRequest;
import com.rav.insurance.useroperations.model.InsuranceLoginResponse;
import com.rav.insurance.useroperations.model.InsuranceRegistrationRequest;
import com.rav.insurance.useroperations.model.InsuranceUpdateCredentialRequest;
import com.rav.insurance.useroperations.service.ForgotCredentialService;
import com.rav.insurance.useroperations.service.LoginService;
import com.rav.insurance.useroperations.service.RegistrationService;
import com.rav.insurance.useroperations.service.UpdateCredentialService;
import com.rav.insurance.useroperations.webservice.contracts.IUserOperationsWS;

@WebService(endpointInterface = "com.rav.insurance.useroperations.webservice.contracts.IUserOperationsWS", serviceName = "UserOperationsService", portName = "UserOperationsPort")
public class UserOperationsWS implements IUserOperationsWS {

	@Resource
	WebServiceContext wsContext;

	private ServiceAbstract service;
	
	@Override
	public CommonResponseAttributes registerUser(
			InsuranceRegistrationRequest request) throws Exception {
		service = new RegistrationService();
		return (CommonResponseAttributes) service.processRequest(request, wsContext);
	}

	@Override
	public InsuranceLoginResponse loginUser(InsuranceLoginRequest request)
			throws Exception {
		service = new LoginService();
		return (InsuranceLoginResponse) service.processRequest(request, wsContext);
	}

	@Override
	public CommonResponseAttributes forgotPassword(
			CommonRequestAttributes request) throws Exception {
		service = new ForgotCredentialService();
		return (CommonResponseAttributes) service.processRequest(request, wsContext);
	}

	@Override
	public CommonResponseAttributes updatePassword(
			InsuranceUpdateCredentialRequest request) throws Exception {
		service = new UpdateCredentialService();
		return (CommonResponseAttributes) service.processRequest(request, wsContext);
	}

}
