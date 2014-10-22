package com.rav.insurance.useroperations.service;

import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import java.util.Random;

import javax.crypto.NoSuchPaddingException;
import javax.xml.ws.WebServiceContext;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import RavBase64.Base64Encoder;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.log.bean.RequestResponseLoggingBean;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.useroperations.bean.UserBean;
import com.rav.insurance.useroperations.constants.UserOperationsConstants;
import com.rav.insurance.useroperations.dao.UserOperationsDAO;
import com.rav.insurance.useroperations.dto.ForgotCredentialDTO;
import com.rav.insurance.useroperations.model.InsuranceForgotCredentialRequest;
import com.rav.insurance.util.CommonValidations;
import com.rav.insurance.util.RequestResponseLoggingDAO;
import com.rav.insurance.util.SendMail;

public class ForgotCredentialService extends ServiceAbstract {

	@Override
	public void validateRequest(Object dto) throws Exception {
		ForgotCredentialDTO obj = (ForgotCredentialDTO) dto;

		if (!CommonValidations.isValidEmailAddress(obj.getEmailAddress())) {

			throw new Exception("Invalid Email Address");
		}

	}

	@Override
	public Object createDTO(Object model, WebServiceContext wsContext) {
		ForgotCredentialDTO dto = new ForgotCredentialDTO();
		dto.setIpAddress(getIPAddress(wsContext));
		dto.setRequestType(UserOperationsConstants.FORGOT_CREDENTIAL_REQUEST_TYPE);

		dto.setEmailAddress(((InsuranceForgotCredentialRequest) model)
				.getEmailAddress());
		return dto;

	}

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		CommonResponseAttributes response = null;

		if (model != null && model instanceof InsuranceForgotCredentialRequest) {
			ForgotCredentialDTO dto = (ForgotCredentialDTO) createDTO(model,
					wsContext);
			try {
				validateRequest(dto);

				try {
					UserOperationsDAO dao = new UserOperationsDAO();
					UserBean bean = dao
							.getUserBean(null, dto.getEmailAddress(),false);

					if (bean != null) {
						Base64Encoder encoder = new Base64Encoder(
								bean.getUserName() + "%"
										+ new Random().nextInt());
						sendMailNotification(bean.getEmailAddress(),bean.getUserName(),
								bean.getFullName()
										, encoder.get());
						response = new CommonResponseAttributes();
						response.setStatus(CommonConstants.SUCCESS);
						
					} else {
						throw new Exception("User is not registered");
					}
				} catch (Exception e) {
					
					RequestResponseLoggingBean bean = new RequestResponseLoggingBean();
					StackTraceElement[] stack = e.getStackTrace();
					String theTrace = "";
					for(StackTraceElement line : stack)
					{
					   theTrace += "\n"+line.toString();
					}
					bean.setDate(Calendar.getInstance().getTime());
					bean.setException(theTrace);
					bean.setLoggedInUser(((ForgotCredentialDTO) model).getUserId());
					bean.setRequestType("FORGOT_CREDENTIAL");
					
					RequestResponseLoggingDAO.log(bean);
					response = new CommonResponseAttributes();
					response.setErrorCode("-200");
					response.setStatus(CommonConstants.ERROR);
					response.setErrorMessage(e.getMessage());
				}

			} catch (Exception e) {
				RequestResponseLoggingBean bean = new RequestResponseLoggingBean();
				StackTraceElement[] stack = e.getStackTrace();
				String theTrace = "";
				for(StackTraceElement line : stack)
				{
				   theTrace += "\n"+line.toString();
				}
				bean.setDate(Calendar.getInstance().getTime());
				bean.setException(theTrace);
				bean.setLoggedInUser(((ForgotCredentialDTO) model).getUserId());
				bean.setRequestType("FORGOT_CREDENTIAL");
				
				RequestResponseLoggingDAO.log(bean);
				response = new CommonResponseAttributes();
				response.setErrorCode("-200");
				response.setStatus(CommonConstants.ERROR);
				response.setErrorMessage(e.getMessage());
			}
		} else {
			response = new CommonResponseAttributes();
			response.setErrorCode("-200");
			response.setStatus(CommonConstants.ERROR);
			response.setErrorMessage("The request is empty");
		}

		return response;

	}

	private void sendMailNotification(String emailAddress,String userName, String fullName,
			String code) throws NoSuchAlgorithmException,
			NoSuchPaddingException, Exception {
		StringTemplateGroup emailTemplateGroup = new StringTemplateGroup(
				UserOperationsConstants.EMAIL_VERIFICATION_GROUP,
				UserOperationsConstants.EMAIL_TEMPLATE_FOLDER_LOCATION);
		StringTemplate loginEmail = emailTemplateGroup
				.getInstanceOf(UserOperationsConstants.FORGOT_CREDENTIAL_TEMPLATE_FILE);
		loginEmail.setAttribute(
				UserOperationsConstants.FORGOT_CREDENTIAL_CODE_PLACE_HOLDER,
				code);
		
		loginEmail.setAttribute(
				UserOperationsConstants.EMAIL_TEMPLATE_FULLNAME_PLACE_HOLDER,
				fullName);
		
		loginEmail.setAttribute(
				"userName",
				userName);

		loginEmail.setAttribute(
				UserOperationsConstants.EMAIL_TEMPLATE_FROM_PLACE_HOLDER,
				UserOperationsConstants.ORG_NAME);
		String message = loginEmail.toString();

		String to[] = { emailAddress };

		SendMail sm = new SendMail(
				UserOperationsConstants.FORGOT_CREDENTIAL_SUBJECT, message, to);
		sm.send();
	}
}
