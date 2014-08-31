package com.rav.insurance.insuranceformoperations.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.xml.ws.WebServiceContext;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.model.FormMailToUnderWriterRequest;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.util.SendMail;
import com.rav.insurance.util.WriteByteArray;

public class SendFormMailToUnderWriterService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		FormMailToUnderWriterRequest request = (FormMailToUnderWriterRequest) model;
		CommonResponseAttributes response = null;
		try {
			String[] a = { request.getFormId() + "\\" + request.getFormId()
					+ ".zip" };

			String[] to = request.getRecpients().split(",");
			File dir = new File("Mails");
			if (!dir.exists())
				dir.mkdir();
			WriteByteArray.writeByteArray("Mails\\" + request.getFormId(),
					request.getMessage());
			// new SendMail(request.getFrom(), null, request.getSubject(),
			// getMessage(request.getFormId()), a, to).send();

			new SendMail(request.getSubject(), getMessage(request.getFormId()),
					a, to).send();

			response = new CommonResponseAttributes();
			response.setStatus(CommonConstants.SUCCESS);
		} catch (Exception e) {
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
