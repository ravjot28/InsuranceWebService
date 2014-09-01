package com.rav.insurance.insuranceformoperations.service;

import java.util.Calendar;

import javax.xml.ws.WebServiceContext;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.dao.InsuranceFormDAO;
import com.rav.insurance.insuranceformoperations.model.AssignMarketerRequest;
import com.rav.insurance.log.bean.RequestResponseLoggingBean;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.util.CommonValidations;
import com.rav.insurance.util.RequestResponseLoggingDAO;

public class AssignMarketerService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		CommonResponseAttributes response = null;
		try {
			String formId = ((AssignMarketerRequest) model).getFormId();
			String marketerUserName = ((AssignMarketerRequest) model)
					.getMarketerUserId();

			if (!CommonValidations.isStringEmpty(formId)
					&& !CommonValidations.isStringEmpty(marketerUserName)) {
				int id = -1;
				try {
					id = Integer.parseInt(formId.replaceAll("UCCIG", ""));
					if (id <= 0)
						throw new Exception("Invalid form Id");

					if (new InsuranceFormDAO().assignMarketer(id,
							marketerUserName)) {
						response = new CommonResponseAttributes();
						response.setStatus(CommonConstants.SUCCESS);

					}

				} catch (Exception e) {
					throw new Exception("Invalid form Id");
				}

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
			bean.setLoggedInUser(((AssignMarketerRequest) model).getUserId());
			bean.setRequestType("ASSIGN_MARKETER");
			
			RequestResponseLoggingDAO.log(bean);
			
			
			response = new CommonResponseAttributes();
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
