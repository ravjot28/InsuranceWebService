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
import com.rav.insurance.util.SendMail;

public class SubmitFormService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		InsuranceFormSubmitResponse response = null;
		try {
			int formId = new InsuranceFormDAO()
					.submitForm(getBean((InsuranceFormSubmitRequest) model));
			if (formId == -1)
				throw new Exception("Error in inserting the form");
			response = new InsuranceFormSubmitResponse();
			response.setStatus(CommonConstants.SUCCESS);
			response.setFormId("UCCIG" + formId);
			sendMail("UCCIG"+formId, ((InsuranceFormSubmitRequest) model).getLoggedInUserEmailAddress(), ((InsuranceFormSubmitRequest) model).getUserId());
		} catch (Exception e) {
			response = new InsuranceFormSubmitResponse();
			response.setStatus(CommonConstants.ERROR);
			response.setErrorMessage(e.getMessage());
			response.setErrorCode("-2001");
			e.printStackTrace();
		}
		return response;
	}

	private void sendMail(String formId, String emailAddress,String fullName) {

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
