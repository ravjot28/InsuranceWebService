package com.rav.insurance.insuranceformoperations.service;

import javax.xml.ws.WebServiceContext;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.dao.InsuranceFormDAO;
import com.rav.insurance.insuranceformoperations.model.EditFormSubmissionRequest;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.util.CommonValidations;
import com.rav.insurance.util.SendMail;
import com.rav.insurance.util.WriteByteArray;

public class EditFormSubmission extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		CommonResponseAttributes response = null;
		try {
			InsuranceFormDAO dao = new InsuranceFormDAO();
			dao.updateForm(((EditFormSubmissionRequest) model));
			String formId = ((EditFormSubmissionRequest) model).getFormId();

			EditFormSubmissionRequest obj = (EditFormSubmissionRequest) model;
			if (!CommonValidations.isStringEmpty(obj.getFile1Name())) {
				WriteByteArray.writeByteArray(
						 formId + "/" + obj.getFile1Name(),
						obj.getFile1());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile2Name())) {
				WriteByteArray.writeByteArray(
						 formId + "/" + obj.getFile2Name(),
						obj.getFile2());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile3Name())) {
				WriteByteArray.writeByteArray(
						 formId + "/" + obj.getFile3Name(),
						obj.getFile3());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile4Name())) {
				WriteByteArray.writeByteArray(
						 formId + "/" + obj.getFile4Name(),
						obj.getFile4());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile5Name())) {
				WriteByteArray.writeByteArray(
						 formId + "/" + obj.getFile5Name(),
						obj.getFile5());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile6Name())) {
				WriteByteArray.writeByteArray(
						 formId + "/" + obj.getFile6Name(),
						obj.getFile6());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile7Name())) {
				WriteByteArray.writeByteArray(
						 formId + "/" + obj.getFile7Name(),
						obj.getFile7());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile8Name())) {
				WriteByteArray.writeByteArray(
						 formId + "/" + obj.getFile8Name(),
						obj.getFile8());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile9Name())) {
				WriteByteArray.writeByteArray(
						 formId + "/" + obj.getFile9Name(),
						obj.getFile9());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile10Name())) {
				WriteByteArray.writeByteArray(
						 formId + "/" + obj.getFile10Name(),
						obj.getFile10());
			}

			response = new CommonResponseAttributes();
			response.setStatus(CommonConstants.SUCCESS);
			sendMail( formId,
					((EditFormSubmissionRequest) model)
							.getLoggedInUserEmailAddress(),
					((EditFormSubmissionRequest) model).getUserId());
		} catch (Exception e) {
			response = new CommonResponseAttributes();
			response.setStatus(CommonConstants.ERROR);
			response.setErrorMessage(e.getMessage());
			response.setErrorCode("-2001");
			e.printStackTrace();
		}
		return response;
	}

	private void sendMail(String formId, String emailAddress, String fullName) {

		StringTemplateGroup emailTemplateGroup = new StringTemplateGroup(
				"welcomeloginemail group", System.getProperty("emailTemplates"));
		StringTemplate submitFormMail = emailTemplateGroup
				.getInstanceOf("welcomeLoginEmail");
		submitFormMail.setAttribute("fullName", fullName);
		submitFormMail.setAttribute("formId", formId);
		submitFormMail.setAttribute("from", "UCCIG");
		String message = submitFormMail.toString();

		String to[] = { emailAddress };

		SendMail sm = new SendMail(formId + " Form submitted", message, to);
		sm.send();
	}

	

	@Override
	public void validateRequest(Object dto) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public Object createDTO(Object model, WebServiceContext wsContext) {
		// TODO Auto-generated method stub
		return null;
	}

}
