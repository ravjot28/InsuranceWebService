package com.rav.insurance.insuranceformoperations.service;

import javax.xml.ws.WebServiceContext;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.dao.InsuranceFormDAO;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormRequest;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormResponse;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.util.CommonValidations;

public class GetFormService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		GetInsuranceFormResponse response = null;
		try {
			String formId = ((GetInsuranceFormRequest) model).getFormId();
			if (!CommonValidations.isStringEmpty(formId)) {
				int id = -1;
				try {
					id = Integer.parseInt(formId.replaceAll("UCCIG", ""));
					if (id <= 0)
						throw new Exception("Invalid form Id");

				} catch (Exception e) {
					throw new Exception("Invalid form Id");
				}
				response = new InsuranceFormDAO().getForm(id);
				response.setFormId(formId);

			} else {
				throw new Exception("Empty form Id");
			}
			response.setStatus(CommonConstants.SUCCESS);
		} catch (Exception e) {
			response = new GetInsuranceFormResponse();
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
