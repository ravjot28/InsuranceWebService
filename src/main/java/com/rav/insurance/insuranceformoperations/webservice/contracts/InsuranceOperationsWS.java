package com.rav.insurance.insuranceformoperations.webservice.contracts;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.rav.insurance.insuranceformoperations.model.InsuranceFormSubmitRequest;
import com.rav.insurance.model.CommonResponseAttributes;

@WebService(name = "InsuranceOperationsService")
public interface InsuranceOperationsWS {

	@WebMethod(operationName = "FormSubmission")
	@WebResult(name = "FormSubmissionResponse")
	public CommonResponseAttributes submitForm(
			@WebParam(name = "FormSubmissionRequest") InsuranceFormSubmitRequest request)
			throws Exception;

}