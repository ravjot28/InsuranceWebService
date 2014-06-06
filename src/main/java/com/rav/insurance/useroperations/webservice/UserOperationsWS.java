package com.rav.insurance.useroperations.webservice;

import javax.jws.WebService;

import com.rav.insurance.useroperations.model.InsuranceForgotCredentialRequest;
import com.rav.insurance.useroperations.model.InsuranceForgotCredentialResponse;
import com.rav.insurance.useroperations.model.InsuranceLoginRequest;
import com.rav.insurance.useroperations.model.InsuranceLoginResponse;
import com.rav.insurance.useroperations.model.InsuranceRegistrationRequesst;
import com.rav.insurance.useroperations.model.InsuranceRegistrationResponse;
import com.rav.insurance.useroperations.model.InsuranceUpdatePasswordRequest;
import com.rav.insurance.useroperations.model.InsuranceUpdatePasswordResponse;
import com.rav.insurance.useroperations.webserivce.contracts.IUserOperations;

@WebService(endpointInterface = "com.rav.insurance.useroperations.webserivce.contracts.IUserOperations", serviceName = "UserOperationsService", portName = "UserOperationsPort")
public class UserOperationsWS implements IUserOperations{

	@Override
	public InsuranceRegistrationResponse registerUser(
			InsuranceRegistrationRequesst request) throws Exception {
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
	public InsuranceForgotCredentialResponse forgotCredentials(
			InsuranceForgotCredentialRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InsuranceUpdatePasswordResponse updatePassword(
			InsuranceUpdatePasswordRequest request) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
