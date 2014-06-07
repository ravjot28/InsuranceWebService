package com.rav.insurance.useroperations.webservice.contracts;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.rav.insurance.model.CommonRequestAttributes;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.useroperations.model.InsuranceLoginRequest;
import com.rav.insurance.useroperations.model.InsuranceLoginResponse;
import com.rav.insurance.useroperations.model.InsuranceRegistrationRequest;
import com.rav.insurance.useroperations.model.InsuranceUpdateCredentialRequest;

@WebService(name = "UserOperationsService")
public interface IUserOperationsWS {

	@WebMethod(operationName = "RegisterUser")
	@WebResult(name = "RegistrationResponse")
	public CommonResponseAttributes registerUser(
			@WebParam(name = "RegistrationRequest") InsuranceRegistrationRequest request)
			throws Exception;

	@WebMethod(operationName = "LoginUser")
	@WebResult(name = "LoginResponse")
	public InsuranceLoginResponse loginUser(
			@WebParam(name = "LoginRequest") InsuranceLoginRequest request)
			throws Exception;

	@WebMethod(operationName = "ForgotPassword")
	@WebResult(name = "ForgotPasswordResponse")
	public CommonResponseAttributes forgotPassword(
			@WebParam(name = "ForgotPasswordRequest") CommonRequestAttributes request)
			throws Exception;

	@WebMethod(operationName = "UpdatePassword")
	@WebResult(name = "UpdatePasswordResponse")
	public CommonResponseAttributes updatePassword(
			@WebParam(name = "UpdatePasswordRequest") InsuranceUpdateCredentialRequest request)
			throws Exception;

}