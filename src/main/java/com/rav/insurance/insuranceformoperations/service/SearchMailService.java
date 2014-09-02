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
import com.rav.insurance.insuranceformoperations.bean.MessageInfo;
import com.rav.insurance.insuranceformoperations.dao.InsuranceFormDAO;
import com.rav.insurance.insuranceformoperations.model.MailInfo;
import com.rav.insurance.insuranceformoperations.model.SearchMailRequest;
import com.rav.insurance.insuranceformoperations.model.SearchMailResponse;
import com.rav.insurance.log.bean.RequestResponseLoggingBean;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.util.CommonValidations;
import com.rav.insurance.util.RequestResponseLoggingDAO;

public class SearchMailService extends ServiceAbstract {
	private String FOLDER_NAME = "C:\\Documents and Settings\\developer\\Desktop\\ReadMail\\";

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		SearchMailResponse response = null;
		SearchMailRequest request = (SearchMailRequest) model;
		try {
			validateRequest(request);
			InsuranceFormDAO dao = new InsuranceFormDAO();

			List<MessageInfo> list = dao.searchMail(request.getFormId());
			List<MailInfo> mails = new ArrayList<MailInfo>();
			for (MessageInfo mi : list) {
				int index = mi.getSubject().trim().indexOf(request.getFormId());
				
				if(mi.getSubject().contains(request.getFormId()+" ") || index + request.getFormId().length() == mi.getSubject().trim().length()){
					MailInfo mail = new MailInfo();
					mail.setFrom(mi.getFrom1());
					mail.setMailBody(getMessage(FOLDER_NAME + mi.getId()));
					mail.setSentdDate(mi.getSentDate());
					mail.setSubject(mi.getSubject());
					mail.setTo(mi.getRecepients());
					mails.add(mail);
				}
				
			}
			response = new SearchMailResponse();
			response.setMailList(mails);
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
			bean.setRequestType("SEARCH_MAIL");
			
			RequestResponseLoggingDAO.log(bean);
			
			response = new SearchMailResponse();
			response.setStatus(CommonConstants.ERROR);
			response.setErrorMessage(e.getMessage());
		}
		return response;
	}

	@Override
	public void validateRequest(Object dto) throws Exception {
		SearchMailRequest request = (SearchMailRequest) dto;

		if (CommonValidations.isStringEmpty(request.getFormId())) {
			throw new Exception("Empty form Id");
		}

	}

	@Override
	public Object createDTO(Object model, WebServiceContext wsContext) {
		// TODO Auto-generated method stub
		return null;
	}

	public static String getMessage(String fileName) throws IOException {
		String message = "";
		File f = new File(fileName);
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
			throw e;
		} catch (IOException e) {
			throw e;
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					throw e;
				}
			}
		}
		return message;
	}

}
