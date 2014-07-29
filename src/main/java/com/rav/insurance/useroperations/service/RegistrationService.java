package com.rav.insurance.useroperations.service;

import java.security.NoSuchAlgorithmException;
import java.util.Date;

import javax.crypto.NoSuchPaddingException;
import javax.xml.ws.WebServiceContext;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.security.SaltAlgorithmImpl;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.useroperations.bean.UserBean;
import com.rav.insurance.useroperations.constants.UserOperationsConstants;
import com.rav.insurance.useroperations.dao.UserOperationsDAO;
import com.rav.insurance.useroperations.dto.RegistrationDTO;
import com.rav.insurance.useroperations.model.InsuranceRegistrationRequest;
import com.rav.insurance.util.CommonValidations;
import com.rav.insurance.util.SendMail;

public class RegistrationService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		CommonResponseAttributes response = null;
		if (model != null && model instanceof InsuranceRegistrationRequest) {
			RegistrationDTO dto = (RegistrationDTO) createDTO(model, wsContext);
			try {
				validateRequest(dto);
				UserOperationsDAO dao = new UserOperationsDAO();
				if (!dao.findUserName(dto.getUserId(),dto.getEmailAddress())) {
					try {
						dto.setPassword(SaltAlgorithmImpl.getInstance()
								.createHash(dto.getPassword()));
					} catch (Exception e) {
						throw new Exception("Password not correctly encrypted");
					}
					UserBean bean = getBean(dto);
					try {
						dao.registerUser(bean);
						response = new CommonResponseAttributes();
						response.setStatus(CommonConstants.SUCCESS);
						sendMailNotification(
								dto.getEmailAddress(),
								dto.getTitle() + " " + dto.getFirstName() + " "
										+ dto.getMiddleName() + " "
										+ dto.getLastName());
					} catch (Exception e) {
						throw new Exception("Not able to register the user");
					}
				} else {
					throw new Exception("The user id already exists");
				}

			} catch (Exception e) {
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

	@Override
	public void validateRequest(Object dto) throws Exception {
		RegistrationDTO obj = (RegistrationDTO) dto;

		if (CommonValidations.isValidEmailAddress(obj.getEmailAddress())) {
			if (!(CommonValidations.isStringEmpty(obj.getFirstName()) && CommonValidations
					.isStringEmpty(obj.getLastName()))) {
				if (!CommonValidations.isStringEmpty(obj.getRole())) {
					if (!CommonValidations.isStringEmpty(obj.getPassword())) {
						if (CommonValidations.isStringEmpty(obj.getUserId())) {
							throw new Exception("Invalid User Id");
						}
					} else {
						throw new Exception("Invalid Password");
					}
				} else {
					throw new Exception("Invalid Role");
				}
			} else {
				throw new Exception("Invalid User Name");
			}
		} else {
			throw new Exception("Invalid Email Address");
		}

	}

	@Override
	public Object createDTO(Object model, WebServiceContext wsContext) {
		RegistrationDTO dto = new RegistrationDTO();
		dto.setIpAddress(getIPAddress(wsContext));
		dto.setRequestType(UserOperationsConstants.REGISTRATION_REQUEST_TYPE);

		dto.setTitle(((InsuranceRegistrationRequest) model).getTitle());
		dto.setFirstName(((InsuranceRegistrationRequest) model).getFirstName());
		dto.setMiddleName(((InsuranceRegistrationRequest) model)
				.getMiddleName());
		dto.setLastName(((InsuranceRegistrationRequest) model).getLastName());
		dto.setUserId(((InsuranceRegistrationRequest) model).getUserId());

		dto.setPassword(((InsuranceRegistrationRequest) model).getPassword());
		dto.setEmailAddress(((InsuranceRegistrationRequest) model)
				.getEmailAddress());
		dto.setRole(((InsuranceRegistrationRequest) model).getRole());
		return dto;
	}

	public UserBean getBean(RegistrationDTO dto) {
		UserBean bean = new UserBean();
		bean.setActive(CommonConstants.ACTIVE);
		bean.setCreationDate(new Date());
		bean.setEmailAddress(dto.getEmailAddress());
		bean.setFirstName(dto.getFirstName());
		bean.setLastName(dto.getLastName());
		bean.setMiddleName(dto.getMiddleName());
		bean.setPassword(dto.getPassword());
		bean.setTitle(dto.getTitle());
		bean.setUserName(dto.getUserId());
		return bean;
	}

	private void sendMailNotification(String emailAddress, String fullName)
			throws NoSuchAlgorithmException, NoSuchPaddingException, Exception {
		StringTemplateGroup emailTemplateGroup = new StringTemplateGroup(
				UserOperationsConstants.EMAIL_VERIFICATION_GROUP,
				UserOperationsConstants.EMAIL_TEMPLATE_FOLDER_LOCATION);
		StringTemplate loginEmail = emailTemplateGroup
				.getInstanceOf(UserOperationsConstants.EMAIL_VERIFICATION_TEMPLATE_FILE);
		loginEmail.setAttribute(
				UserOperationsConstants.EMAIL_TEMPLATE_FULLNAME_PLACE_HOLDER,
				fullName);
		loginEmail.setAttribute(
				UserOperationsConstants.EMAIL_TEMPLATE_FROM_PLACE_HOLDER,
				UserOperationsConstants.ORG_NAME);
		loginEmail.setAttribute(
				UserOperationsConstants.EMAIL_TEMPLATE_FROM_PLACE_HOLDER,
				UserOperationsConstants.ORG_NAME);
		String message = loginEmail.toString();

		String to[] = { emailAddress };

		SendMail sm = new SendMail(UserOperationsConstants.WELCOME_SUBJECT,
				message, to);
		sm.send();
	}

}
