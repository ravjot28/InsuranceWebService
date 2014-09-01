package com.rav.insurance.insuranceformoperations.webservice.contracts;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.rav.insurance.insuranceformoperations.model.AssignMarketerRequest;
import com.rav.insurance.insuranceformoperations.model.CloseFormRequest;
import com.rav.insurance.insuranceformoperations.model.EditFormSubmissionRequest;
import com.rav.insurance.insuranceformoperations.model.FormMailToUnderWriterRequest;
import com.rav.insurance.insuranceformoperations.model.GetCloseFormNQuoteDetailsResponse;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormListRequest;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormListResponse;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormRequest;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormResponse;
import com.rav.insurance.insuranceformoperations.model.InsuranceFormSubmitRequest;
import com.rav.insurance.insuranceformoperations.model.InsuranceFormSubmitResponse;
import com.rav.insurance.insuranceformoperations.model.PostFormMailRequest;
import com.rav.insurance.insuranceformoperations.model.QuoteDetailsRequest;
import com.rav.insurance.insuranceformoperations.model.SearchMailRequest;
import com.rav.insurance.insuranceformoperations.model.SearchMailResponse;
import com.rav.insurance.model.CommonResponseAttributes;

@WebService(name = "InsuranceOperationsService")
public interface InsuranceOperationsWS {

	@WebMethod(operationName = "FormSubmission")
	@WebResult(name = "FormSubmissionResponse")
	public InsuranceFormSubmitResponse submitForm(
			@WebParam(name = "FormSubmissionRequest") InsuranceFormSubmitRequest request)
			throws Exception;

	@WebMethod(operationName = "GetFormList")
	@WebResult(name = "GetFormListResponse")
	public GetInsuranceFormListResponse getFormList(
			@WebParam(name = "FormSubmissionRequest") GetInsuranceFormListRequest request)
			throws Exception;

	@WebMethod(operationName = "GetForm")
	@WebResult(name = "GetFormResponse")
	public GetInsuranceFormResponse getForm(
			@WebParam(name = "GetFormRequest") GetInsuranceFormRequest request)
			throws Exception;

	@WebMethod(operationName = "AssignMarketer")
	@WebResult(name = "AssignMarketerResponse")
	public CommonResponseAttributes assignMarketer(
			@WebParam(name = "AssignMarketerRequest") AssignMarketerRequest request)
			throws Exception;

	@WebMethod(operationName = "RegisterPostFormMail")
	@WebResult(name = "RegisterPostFormMailResponse")
	public CommonResponseAttributes postFormMail(
			@WebParam(name = "RegisterPostFormMailRequest") PostFormMailRequest request)
			throws Exception;

	@WebMethod(operationName = "EditFormSubmission")
	@WebResult(name = "EditFormSubmissionResponse")
	public CommonResponseAttributes editForm(
			@WebParam(name = "EditFormSubmissionRequest") EditFormSubmissionRequest request)
			throws Exception;

	@WebMethod(operationName = "SendMailToUnderWriter")
	@WebResult(name = "SendMailToUnderWriterResponse")
	public CommonResponseAttributes sendMailToUnderWriter(
			@WebParam(name = "SendMailToUnderWriterRequest") FormMailToUnderWriterRequest request)
			throws Exception;

	@WebMethod(operationName = "SearchMail")
	@WebResult(name = "SearchMailResponse")
	public SearchMailResponse searchMail(
			@WebParam(name = "SearchMailRequest") SearchMailRequest request)
			throws Exception;

	@WebMethod(operationName = "CloseForm")
	@WebResult(name = "CloseFormResponse")
	public CommonResponseAttributes closeForm(
			@WebParam(name = "CloseFormRequest") CloseFormRequest request)
			throws Exception;

	@WebMethod(operationName = "QuoteDetails")
	@WebResult(name = "QuoteDetailsResponse")
	public CommonResponseAttributes quoteDetails(
			@WebParam(name = "QuoteDetailsRequest") QuoteDetailsRequest request)
			throws Exception;
	
	@WebMethod(operationName = "GetCloseFormNQuoteDetails")
	@WebResult(name = "GetCloseFormNQuoteDetailsResponse")
	public GetCloseFormNQuoteDetailsResponse getCloseFormNQuoteDetails(
			@WebParam(name = "GetCloseFormNQuoteDetailsRequest") SearchMailRequest request)
			throws Exception;

}