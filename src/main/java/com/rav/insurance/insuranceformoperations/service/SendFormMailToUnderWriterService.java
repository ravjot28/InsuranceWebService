package com.rav.insurance.insuranceformoperations.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.xml.ws.WebServiceContext;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.dao.InsuranceFormDAO;
import com.rav.insurance.insuranceformoperations.model.FormMailToUnderWriterRequest;
import com.rav.insurance.log.bean.RequestResponseLoggingBean;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.util.RequestResponseLoggingDAO;
import com.rav.insurance.util.SendMail;
import com.rav.insurance.util.WriteByteArray;

public class SendFormMailToUnderWriterService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		FormMailToUnderWriterRequest request = (FormMailToUnderWriterRequest) model;
		CommonResponseAttributes response = null;
		try {
			String[] a=null;
			if(new File(request.getFormId() + "\\" + request.getFormId()
					+ ".zip").exists()){
				a = new String[1];
				a[0] = request.getFormId() + "\\" + request.getFormId()+ ".zip" ;
			}else{
				List<String> list = new ArrayList<String>();
				if(new File(request.getFormId() + "\\" + "Clientprofile.html" ).exists()){
					list.add(request.getFormId() + "\\" + "Clientprofile.html" );
				}
				int fileNumber =1;
				while(true){
					if(new File(request.getFormId() + "\\" + "Clientprofile"+fileNumber+".html" ).exists()){
						list.add(request.getFormId() + "\\" + "Clientprofile"+fileNumber+".html") ;
					}else{
						break;
					}
					fileNumber++;
				}
				if(new File(request.getFormId() + "\\" + "Autoprofile.html" ).exists()){
					list.add(request.getFormId() + "\\" + "Autoprofile.html" );
				}
				
				a = (String[]) list.toArray();
			}

			String[] to = request.getRecpients().split(",");
			File dir = new File("Mails");
			if (!dir.exists())
				dir.mkdir();
			WriteByteArray.writeByteArray("Mails\\" + request.getFormId(),
					request.getMessage());
			// new SendMail(request.getFrom(), null, request.getSubject(),
			// getMessage(request.getFormId()), a, to).send();
			System.out.println("Get from"+request.getFrom());
			new SendMail(request.getFrom(),"",request.getSubject(), getMessage(request.getFormId()),
					a, to).send();

			response = new CommonResponseAttributes();
			response.setStatus(CommonConstants.SUCCESS);
			
			new InsuranceFormDAO().insertMailRepo(request.getFormId(), request.getRecpients());
			
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
			bean.setLoggedInUser(request.getUserId());
			bean.setRequestType("SEND_FORM_MAIL_TO_UNDER_WRITER");
			
			RequestResponseLoggingDAO.log(bean);
			
			
			response = new CommonResponseAttributes();
			response.setStatus(CommonConstants.ERROR);
			response.setErrorMessage(e.getMessage());
			response.setErrorCode("-100");
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

	public static String getMessage(String fileName) {
		String message = "";
		File dir = new File("Mails");
		if (!dir.exists())
			dir.mkdir();
		File f = new File("Mails\\" + fileName);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new InputStreamReader(
					new FileInputStream(f)));
			String line = reader.readLine();
			while (line != null) {
				message += "\n" + line;
				line = reader.readLine();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return message;
	}

}