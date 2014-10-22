package com.rav.insurance.insuranceformoperations.service;

import java.io.File;
import java.util.Calendar;

import javax.xml.ws.WebServiceContext;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.dao.InsuranceFormDAO;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormRequest;
import com.rav.insurance.insuranceformoperations.model.GetInsuranceFormResponse;
import com.rav.insurance.log.bean.RequestResponseLoggingBean;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.util.CommonValidations;
import com.rav.insurance.util.RequestResponseLoggingDAO;
import com.rav.insurance.util.WriteByteArray;

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

				File f = new File("UCCIG" + id);

				if (f.isDirectory() && f.exists()) {
					File[] files = f.listFiles();
					int i = 0;
					for (File file : files) {
						System.out.println(file.getAbsolutePath());
						byte[] bytes = WriteByteArray.getByteFromFile(file);
						switch (i) {
						case 0:
							response.setFile1(bytes);
							response.setFile1Name(file.getName());
							break;
						case 1:
							response.setFile2(bytes);
							response.setFile2Name(file.getName());
							break;
						case 2:
							response.setFile3(bytes);
							response.setFile3Name(file.getName());
							break;
						case 3:
							response.setFile4(bytes);
							response.setFile4Name(file.getName());
							break;
						case 4:
							response.setFile5(bytes);
							response.setFile5Name(file.getName());
							break;
						case 5:
							response.setFile6(bytes);
							response.setFile6Name(file.getName());
							break;
						case 6:
							response.setFile7(bytes);
							response.setFile7Name(file.getName());
							break;
						case 7:
							response.setFile8(bytes);
							response.setFile8Name(file.getName());
							break;
						case 8:
							response.setFile9(bytes);
							response.setFile9Name(file.getName());
							break;
						case 9:
							response.setFile10(bytes);
							response.setFile10Name(file.getName());
							break;
						}
						i++;
						
					}

				}

			} else {
				throw new Exception("Empty form Id");
			}
			response.setStatus(CommonConstants.SUCCESS);
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
			bean.setLoggedInUser(((GetInsuranceFormRequest) model).getUserId());
			bean.setRequestType("GET_FORM");
			
			RequestResponseLoggingDAO.log(bean);
			
			
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
