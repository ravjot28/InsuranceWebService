package com.rav.insurance.insuranceformoperations.service;

import java.util.List;

import javax.xml.ws.WebServiceContext;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.dao.InsuranceFormDAO;
import com.rav.insurance.insuranceformoperations.model.AbstractFormInfo;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormListRequest;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormListResponse;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.util.CommonValidations;

public class GetFormListSerivce extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		GetInsuranceFormListResponse response = null;
		try {
			String role = ((GetInsuranceFormListRequest) model).getRole();
			String userName = ((GetInsuranceFormListRequest) model).getUserId();
			if (!CommonValidations.isStringEmpty(role)
					&& !CommonValidations.isStringEmpty(userName)) {

				List<AbstractFormInfo> list = new InsuranceFormDAO().getFormList(role, userName);
				
				for(AbstractFormInfo form:list)
					form.setFormId("UCCIG"+form.getFormId());
				response = new GetInsuranceFormListResponse();
				response.setFormList(list);
			} else {
				throw new Exception("Empty userName and/or role");
			}
			response.setStatus(CommonConstants.SUCCESS);
		} catch (Exception e) {
			response = new GetInsuranceFormListResponse();
			response.setStatus(CommonConstants.ERROR);
			response.setErrorMessage(e.getMessage());
			response.setErrorCode("-2001");
			e.printStackTrace();
		}
		return response;
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
