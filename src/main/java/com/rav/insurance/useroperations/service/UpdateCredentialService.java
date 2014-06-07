package com.rav.insurance.useroperations.service;

import java.util.StringTokenizer;

import javax.xml.ws.WebServiceContext;

import RavBase64.Base64Decoder;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.security.SaltAlgorithmImpl;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.useroperations.constants.UserOperationsConstants;
import com.rav.insurance.useroperations.dao.UserOperationsDAO;
import com.rav.insurance.useroperations.dto.UpdateCredentialDTO;
import com.rav.insurance.useroperations.model.InsuranceUpdateCredentialRequest;
import com.rav.insurance.util.CommonValidations;

public class UpdateCredentialService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		CommonResponseAttributes response = null;

		if (model != null && model instanceof InsuranceUpdateCredentialRequest) {
			UpdateCredentialDTO dto = (UpdateCredentialDTO) createDTO(model,
					wsContext);
			try {
				validateRequest(dto);
				if (!CommonValidations.isStringEmpty(dto.getCode())) {
					Base64Decoder decoder = new Base64Decoder(dto.getCode());
					StringTokenizer token = new StringTokenizer(decoder.get(),
							"%");
					dto.setUserId(token.nextToken());
				}
				try {
					UserOperationsDAO dao = new UserOperationsDAO();
					if (dao.findUserName(dto.getUserId(), null)) {
						dao.updatePassword(dto.getUserId(), SaltAlgorithmImpl
								.getInstance().createHash(dto.getPassword()));

						response = new CommonResponseAttributes();
						response.setStatus(CommonConstants.SUCCESS);
					} else {
						throw new Exception("User is not registered");
					}
				} catch (Exception e) {
					response = new CommonResponseAttributes();
					response.setErrorCode("-200");
					response.setStatus(CommonConstants.ERROR);
					response.setErrorMessage(e.getMessage());
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
		UpdateCredentialDTO obj = (UpdateCredentialDTO) dto;
		if (!CommonValidations.isStringEmpty(obj.getNewPassword())) {
			if ((!CommonValidations.isStringEmpty(obj.getPassword()))
					|| (!CommonValidations.isStringEmpty(obj.getCode()))) {
				if (CommonValidations.isStringEmpty(obj.getUserId())
						|| (!CommonValidations.isStringEmpty(obj.getCode()))) {
					throw new Exception("Invalid User Name");
				}
			} else {
				throw new Exception("Invalid Password");
			}
		} else {
			throw new Exception("Invalid New Password");
		}

	}

	@Override
	public Object createDTO(Object model, WebServiceContext wsContext) {
		UpdateCredentialDTO dto = new UpdateCredentialDTO();
		dto.setIpAddress(getIPAddress(wsContext));
		dto.setRequestType(UserOperationsConstants.UPDATE_CREDENTIAL_REQUEST_TYPE);

		dto.setUserId(((InsuranceUpdateCredentialRequest) model).getUserId());
		dto.setPassword(((InsuranceUpdateCredentialRequest) model)
				.getPassword());
		dto.setNewPassword(((InsuranceUpdateCredentialRequest) model)
				.getNewPassword());
		dto.setCode(((InsuranceUpdateCredentialRequest) model).getCode());
		return dto;
	}

}
