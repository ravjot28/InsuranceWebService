package com.rav.insurance.insuranceformoperations.service;

import javax.xml.ws.WebServiceContext;

import org.dozer.DozerBeanMapper;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.bean.InsuranceFormBean;
import com.rav.insurance.insuranceformoperations.dao.InsuranceFormDAO;
import com.rav.insurance.insuranceformoperations.model.InsuranceFormSubmitRequest;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.service.ServiceAbstract;

public class SubmitFormService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		CommonResponseAttributes response = null;
		try {
			int formId = new InsuranceFormDAO()
					.submitForm(getBean((InsuranceFormSubmitRequest) model));
			if (formId == -1)
				throw new Exception("Error in inserting the form");
			response = new CommonResponseAttributes();
			response.setStatus(CommonConstants.SUCCESS);
		} catch (Exception e) {
			response = new CommonResponseAttributes();
			response.setStatus(CommonConstants.ERROR);
			response.setErrorMessage(e.getMessage());
			response.setErrorCode("-2001");
			e.printStackTrace();
		}
		return response;
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
