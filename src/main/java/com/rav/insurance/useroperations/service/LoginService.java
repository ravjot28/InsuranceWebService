package com.rav.insurance.useroperations.service;

import javax.xml.ws.WebServiceContext;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.security.SaltAlgorithmImpl;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.useroperations.bean.UserBean;
import com.rav.insurance.useroperations.constants.UserOperationsConstants;
import com.rav.insurance.useroperations.dao.UserOperationsDAO;
import com.rav.insurance.useroperations.dto.LoginDTO;
import com.rav.insurance.useroperations.model.InsuranceLoginRequest;
import com.rav.insurance.useroperations.model.InsuranceLoginResponse;
import com.rav.insurance.util.CommonValidations;

public class LoginService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		InsuranceLoginResponse response = null;

		if (model != null && model instanceof InsuranceLoginRequest) {
			LoginDTO dto = (LoginDTO) createDTO(model, wsContext);
			try {
				validateRequest(dto);

				try {
					UserOperationsDAO dao = new UserOperationsDAO();
					UserBean bean = dao
							.getUserBean(dto.getUserId(), null, true);

					if (bean != null) {
						if (SaltAlgorithmImpl.getInstance().validateStrings(
								dto.getPassword(), bean.getPassword())) {
							response = new InsuranceLoginResponse();
							response.setStatus(CommonConstants.SUCCESS);
							response.setRole(bean.getRole());
							response.setUserEmailAddress(bean.getEmailAddress());
							response.setUserFullName(bean.getTitle() + " "
									+ bean.getFirstName() + " "
									+ bean.getMiddleName() + " "
									+ bean.getLastName());
						} else {
							throw new Exception("Incorrect Password");
						}
					} else {
						throw new Exception("User is not registered");
					}
				} catch (Exception e) {
					response = new InsuranceLoginResponse();
					response.setErrorCode("-200");
					response.setStatus(CommonConstants.ERROR);
					response.setErrorMessage(e.getMessage());
				}

			} catch (Exception e) {
				response = new InsuranceLoginResponse();
				response.setErrorCode("-200");
				response.setStatus(CommonConstants.ERROR);
				response.setErrorMessage(e.getMessage());
			}
		} else {
			response = new InsuranceLoginResponse();
			response.setErrorCode("-200");
			response.setStatus(CommonConstants.ERROR);
			response.setErrorMessage("The request is empty");
		}

		return response;
	}

	@Override
	public void validateRequest(Object dto) throws Exception {
		LoginDTO obj = (LoginDTO) dto;

		if (!CommonValidations.isStringEmpty(obj.getPassword())) {
			if (CommonValidations.isStringEmpty(obj.getUserId())) {
				throw new Exception("Invalid User Name");
			}
		} else {
			throw new Exception("Invalid Password");
		}

	}

	@Override
	public Object createDTO(Object model, WebServiceContext wsContext) {
		LoginDTO dto = new LoginDTO();
		dto.setIpAddress(getIPAddress(wsContext));
		dto.setRequestType(UserOperationsConstants.LOGIN_REQUEST_TYPE);

		dto.setUserId(((InsuranceLoginRequest) model).getUserId());
		dto.setPassword(((InsuranceLoginRequest) model).getPassword());
		return dto;
	}

}
