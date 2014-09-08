package com.rav.insurance.insuranceformoperations.webservice;

import javax.annotation.Resource;
import javax.jws.WebService;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.soap.MTOM;

import com.rav.insurance.insuranceformoperations.model.AssignMarketerRequest;
import com.rav.insurance.insuranceformoperations.model.CloseFormRequest;
import com.rav.insurance.insuranceformoperations.model.DownloadProposalBinderRequest;
import com.rav.insurance.insuranceformoperations.model.DownloadProposalBinderResponse;
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
import com.rav.insurance.insuranceformoperations.model.UploadProposalBinderRequest;
import com.rav.insurance.insuranceformoperations.service.AssignMarketerService;
import com.rav.insurance.insuranceformoperations.service.CloseFormService;
import com.rav.insurance.insuranceformoperations.service.DownloadProposalBinderService;
import com.rav.insurance.insuranceformoperations.service.EditFormSubmission;
import com.rav.insurance.insuranceformoperations.service.GetCloseFormNQuoteDetailsService;
import com.rav.insurance.insuranceformoperations.service.GetEmailAddressService;
import com.rav.insurance.insuranceformoperations.service.GetFormListSerivce;
import com.rav.insurance.insuranceformoperations.service.GetFormService;
import com.rav.insurance.insuranceformoperations.service.PostFormMailService;
import com.rav.insurance.insuranceformoperations.service.QuoteDetailsService;
import com.rav.insurance.insuranceformoperations.service.SearchMailService;
import com.rav.insurance.insuranceformoperations.service.SendFormMailToUnderWriterService;
import com.rav.insurance.insuranceformoperations.service.SubmitFormService;
import com.rav.insurance.insuranceformoperations.service.UploadProposalBinderService;
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

	@Override
	public CommonResponseAttributes editForm(EditFormSubmissionRequest request)
			throws Exception {
		service = new EditFormSubmission();
		return (CommonResponseAttributes) service.processRequest(request,
				wsContext);
	}

	@Override
	public CommonResponseAttributes sendMailToUnderWriter(
			FormMailToUnderWriterRequest request) throws Exception {
		service = new SendFormMailToUnderWriterService();
		return (CommonResponseAttributes) service.processRequest(request,
				wsContext);
	}

	@Override
	public SearchMailResponse searchMail(SearchMailRequest request)
			throws Exception {
		service = new SearchMailService();
		return (SearchMailResponse) service.processRequest(request, wsContext);
	}

	@Override
	public CommonResponseAttributes closeForm(CloseFormRequest request)
			throws Exception {
		service = new CloseFormService();
		return (CommonResponseAttributes) service.processRequest(request,
				wsContext);
	}

	@Override
	public CommonResponseAttributes quoteDetails(QuoteDetailsRequest request)
			throws Exception {
		service = new QuoteDetailsService();
		return (CommonResponseAttributes) service.processRequest(request,
				wsContext);

	}

	@Override
	public GetCloseFormNQuoteDetailsResponse getCloseFormNQuoteDetails(
			SearchMailRequest request) throws Exception {
		service = new GetCloseFormNQuoteDetailsService();
		return (GetCloseFormNQuoteDetailsResponse) service.processRequest(
				request, wsContext);

	}

	@Override
	public CommonResponseAttributes uploadProposalBinder(
			UploadProposalBinderRequest request) throws Exception {
		service = new UploadProposalBinderService();
		return (CommonResponseAttributes) service.processRequest(request,
				wsContext);
	}

	@Override
	public DownloadProposalBinderResponse downloadProposalBinder(
			DownloadProposalBinderRequest request) throws Exception {
		service = new DownloadProposalBinderService();
		return (DownloadProposalBinderResponse) service.processRequest(request,
				wsContext);
	}

	@Override
	public String getEmailAddress(String formId) throws Exception {
		service = new GetEmailAddressService();
		return (String) service.processRequest(formId, wsContext);
	}

}
