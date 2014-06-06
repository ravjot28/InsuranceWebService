package com.rav.insurance.useroperations.webserivce.contracts;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.rav.insurance.useroperations.model.InsuranceForgotCredentialRequest;
import com.rav.insurance.useroperations.model.InsuranceForgotCredentialResponse;
import com.rav.insurance.useroperations.model.InsuranceLoginRequest;
import com.rav.insurance.useroperations.model.InsuranceLoginResponse;
import com.rav.insurance.useroperations.model.InsuranceRegistrationRequesst;
import com.rav.insurance.useroperations.model.InsuranceRegistrationResponse;
import com.rav.insurance.useroperations.model.InsuranceUpdatePasswordRequest;
import com.rav.insurance.useroperations.model.InsuranceUpdatePasswordResponse;

@WebService(name = "UserOperationsService")
public interface IUserOperations {

	@WebMethod(operationName = "RegisterUser")
	@WebResult(name = "RegistrationResponse")
	public InsuranceRegistrationResponse registerUser(
			@WebParam(name = "RegistrationRequest") InsuranceRegistrationRequesst request)
			throws Exception;

	@WebMethod(operationName = "LoginUser")
	@WebResult(name = "LoginResponse")
	public InsuranceLoginResponse loginUser(
			@WebParam(name = "LoginRequest") InsuranceLoginRequest request)
			throws Exception;

	@WebMethod(operationName = "ForgotCredential")
	@WebResult(name = "ForgotCredentialResponse")
	public InsuranceForgotCredentialResponse forgotCredentials(
			@WebParam(name = "ForgotCredentialRequest") InsuranceForgotCredentialRequest request)
			throws Exception;

	@WebMethod(operationName = "UpdatePassword")
	@WebResult(name = "UpdatePasswordResponse")
	public InsuranceUpdatePasswordResponse updatePassword(
			@WebParam(name = "UpdatePasswordRequest") InsuranceUpdatePasswordRequest request)
			throws Exception;

}