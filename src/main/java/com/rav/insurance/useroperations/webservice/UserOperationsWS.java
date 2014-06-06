package com.rav.insurance.useroperations.webservice;

import javax.jws.WebService;

import com.rav.insurance.model.CommonRequestAttributes;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.useroperations.model.InsuranceLoginRequest;
import com.rav.insurance.useroperations.model.InsuranceLoginResponse;
import com.rav.insurance.useroperations.model.InsuranceRegistrationRequest;
import com.rav.insurance.useroperations.model.InsuranceRegistrationResponse;
import com.rav.insurance.useroperations.model.InsuranceUpdateCredentialRequest;
import com.rav.insurance.useroperations.webservice.contracts.IUserOperationsWS;

@WebService(endpointInterface = "com.rav.insurance.useroperations.webservice.contracts.IUserOperationsWS", serviceName = "UserOperationsService", portName = "UserOperationsPort")
public class UserOperationsWS implements IUserOperationsWS {

	@Override
	public InsuranceRegistrationResponse registerUser(
			InsuranceRegistrationRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InsuranceLoginResponse loginUser(InsuranceLoginRequest request)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommonResponseAttributes forgotPassword(
			CommonRequestAttributes request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommonResponseAttributes updatePassword(
			InsuranceUpdateCredentialRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
