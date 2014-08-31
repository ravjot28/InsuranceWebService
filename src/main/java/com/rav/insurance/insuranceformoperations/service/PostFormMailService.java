package com.rav.insurance.insuranceformoperations.service;

import javax.xml.ws.WebServiceContext;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.model.PostFormMailRequest;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.util.CommonValidations;

public class PostFormMailService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		CommonResponseAttributes response = null;
		PostFormMailRequest request = (PostFormMailRequest) model;
		try {
			validateRequest(request);
			
		} catch (Exception e) {
			response = new CommonResponseAttributes();
			response.setStatus(CommonConstants.ERROR);
			response.setErrorMessage(e.getMessage());
		}
		return response;
	}

	@Override
	public void validateRequest(Object dto) throws Exception {
		PostFormMailRequest request = (PostFormMailRequest) dto;
		if (CommonValidations.isValidEmailAddress(request.getFrom())) {
			if (!CommonValidations.isStringEmpty(request.getFormId())) {
				if (!CommonValidations.isStringEmpty(request.getRecpients())) {
					if (!CommonValidations.isStringEmpty(request.getSubject())) {
						if (request.getSendDate() != null) {
							if (request.getMessage() == null) {
								throw new Exception("Empty message");
							}
						} else {
							throw new Exception("Empty send date");
						}
					} else {
						throw new Exception("Empty subject");
					}
				} else {
					throw new Exception("Empty recpients");
				}
			} else {
				throw new Exception("Empty form Id");
			}
		} else {
			throw new Exception("Invalid email address");
		}

	}

	@Override
	public Object createDTO(Object model, WebServiceContext wsContext) {
		// TODO Auto-generated method stub
		return null;
	}

}
