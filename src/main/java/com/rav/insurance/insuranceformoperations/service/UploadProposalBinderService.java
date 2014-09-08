package com.rav.insurance.insuranceformoperations.service;

import java.io.File;

import javax.xml.ws.WebServiceContext;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.model.UploadProposalBinderRequest;
import com.rav.insurance.model.CommonResponseAttributes;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.util.WriteByteArray;

public class UploadProposalBinderService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		UploadProposalBinderRequest request = (UploadProposalBinderRequest) model;
		CommonResponseAttributes response = null;
		try {
			if(request.getBinder()!=null){
				File dir = new File("Binder");
				if(!dir.exists())
					dir.mkdir();
				
				WriteByteArray.writeByteArray(
						"Binder" + "/" +request.getFormId()+".docx",
						request.getBinder());
			}
			
			if(request.getProposal()!=null){
				File dir = new File("Proposal");
				if(!dir.exists())
					dir.mkdir();
				
				WriteByteArray.writeByteArray(
						"Proposal" + "/" +request.getFormId()+".docx",
						request.getProposal());
			}
			
			response = new CommonResponseAttributes();
			response.setStatus(CommonConstants.SUCCESS);
			
			
		} catch (Exception e) {
			response = new CommonResponseAttributes();
			response.setStatus(CommonConstants.ERROR);
			response.setErrorMessage(e.getMessage());
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
