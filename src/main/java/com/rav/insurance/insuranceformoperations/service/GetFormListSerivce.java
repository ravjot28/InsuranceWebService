package com.rav.insurance.insuranceformoperations.service;

import java.util.Calendar;
import java.util.List;

import javax.xml.ws.WebServiceContext;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.dao.InsuranceFormDAO;
import com.rav.insurance.insuranceformoperations.model.AbstractFormInfo;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormListRequest;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormListResponse;
import com.rav.insurance.log.bean.RequestResponseLoggingBean;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.util.RequestResponseLoggingDAO;

public class GetFormListSerivce extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		GetInsuranceFormListResponse response = null;
		try {
			String role = ((GetInsuranceFormListRequest) model).getRole();
			String userName = ((GetInsuranceFormListRequest) model).getUserId();
			String status = ((GetInsuranceFormListRequest) model).getStatus();
			String businessName = ((GetInsuranceFormListRequest) model)
					.getBusinessName();
			int formId = ((GetInsuranceFormListRequest) model).getFormId();
			int month = ((GetInsuranceFormListRequest) model).getMonth();

			List<AbstractFormInfo> list = new InsuranceFormDAO().getFormList(
					role, userName, status, businessName, formId, month);

			for (AbstractFormInfo form : list)
				form.setFormId("UCCIG" + form.getFormId());
			response = new GetInsuranceFormListResponse();
			response.setFormList(list);

			response.setStatus(CommonConstants.SUCCESS);
		} catch (Exception e) {
			RequestResponseLoggingBean bean = new RequestResponseLoggingBean();
			StackTraceElement[] stack = e.getStackTrace();
			String theTrace = "";
			for (StackTraceElement line : stack) {
				theTrace += "\n" + line.toString();
			}
			bean.setDate(Calendar.getInstance().getTime());
			bean.setException(theTrace);
			bean.setLoggedInUser(((GetInsuranceFormListRequest) model)
					.getUserId());
			bean.setRequestType("GET_FORM_LIST");

			RequestResponseLoggingDAO.log(bean);

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
