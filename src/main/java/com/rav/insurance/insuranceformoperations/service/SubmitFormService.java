package com.rav.insurance.insuranceformoperations.service;

import javax.xml.ws.WebServiceContext;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.dozer.DozerBeanMapper;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.bean.InsuranceFormBean;
import com.rav.insurance.insuranceformoperations.dao.InsuranceFormDAO;
import com.rav.insurance.insuranceformoperations.model.InsuranceFormSubmitRequest;
import com.rav.insurance.insuranceformoperations.model.InsuranceFormSubmitResponse;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.util.CommonValidations;
import com.rav.insurance.util.SendMail;
import com.rav.insurance.util.WriteByteArray;

public class SubmitFormService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		InsuranceFormSubmitResponse response = null;
		try {
			int formId = new InsuranceFormDAO()
					.submitForm(getBean((InsuranceFormSubmitRequest) model));
			if (formId == -1)
				throw new Exception("Error in inserting the form");

			InsuranceFormSubmitRequest obj = (InsuranceFormSubmitRequest) model;
			if (!CommonValidations.isStringEmpty(obj.getFile1Name())) {
				WriteByteArray.writeByteArray(
						"UCCIG" + formId + "/" + obj.getFile1Name(),
						obj.getFile1());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile2Name())) {
				WriteByteArray.writeByteArray(
						"UCCIG" + formId + "/" + obj.getFile2Name(),
						obj.getFile2());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile3Name())) {
				WriteByteArray.writeByteArray(
						"UCCIG" + formId + "/" + obj.getFile3Name(),
						obj.getFile3());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile4Name())) {
				WriteByteArray.writeByteArray(
						"UCCIG" + formId + "/" + obj.getFile4Name(),
						obj.getFile4());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile5Name())) {
				WriteByteArray.writeByteArray(
						"UCCIG" + formId + "/" + obj.getFile5Name(),
						obj.getFile5());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile6Name())) {
				WriteByteArray.writeByteArray(
						"UCCIG" + formId + "/" + obj.getFile6Name(),
						obj.getFile6());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile7Name())) {
				WriteByteArray.writeByteArray(
						"UCCIG" + formId + "/" + obj.getFile7Name(),
						obj.getFile7());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile8Name())) {
				WriteByteArray.writeByteArray(
						"UCCIG" + formId + "/" + obj.getFile8Name(),
						obj.getFile8());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile9Name())) {
				WriteByteArray.writeByteArray(
						"UCCIG" + formId + "/" + obj.getFile9Name(),
						obj.getFile9());
			}

			if (!CommonValidations.isStringEmpty(obj.getFile10Name())) {
				WriteByteArray.writeByteArray(
						"UCCIG" + formId + "/" + obj.getFile10Name(),
						obj.getFile10());
			}

			response = new InsuranceFormSubmitResponse();
			response.setStatus(CommonConstants.SUCCESS);
			response.setFormId("UCCIG" + formId);
			sendMail("UCCIG" + formId,
					((InsuranceFormSubmitRequest) model)
							.getLoggedInUserEmailAddress(),
					((InsuranceFormSubmitRequest) model).getUserId());
		} catch (Exception e) {
			response = new InsuranceFormSubmitResponse();
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

	private InsuranceFormBean getBean(InsuranceFormSubmitRequest request) {
		InsuranceFormBean bean = new InsuranceFormBean();
		DozerBeanMapper mapper = new DozerBeanMapper();
		mapper.map(request, bean);
		bean.setStatus("NEW");
		return bean;
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
