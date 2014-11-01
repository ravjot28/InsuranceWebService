package com.rav.insurance.insuranceformoperations.service;

import java.io.File;

import javax.xml.ws.WebServiceContext;

import com.rav.insurance.constants.CommonConstants;
import com.rav.insurance.insuranceformoperations.model.DownloadProposalBinderRequest;
import com.rav.insurance.insuranceformoperations.model.DownloadProposalBinderResponse;
import com.rav.insurance.service.ServiceAbstract;
import com.rav.insurance.util.WriteByteArray;

public class DownloadProposalBinderService extends ServiceAbstract {

	@Override
	public Object processRequest(Object model, WebServiceContext wsContext) {
		DownloadProposalBinderRequest request = (DownloadProposalBinderRequest) model;
		DownloadProposalBinderResponse response = new DownloadProposalBinderResponse();
		try {
			if (request.isBinder()) {
				if(new File("Binder" + "/" + request.getFormId() + ".docx").exists())
				{
					response.setBinder(WriteByteArray.getByteFromFile(new File("Binder" + "/" + request.getFormId() + ".docx")));
				}
				else if (new File("Binder" + "/" + request.getFormId() + ".doc").exists())
				{
					response.setBinder(WriteByteArray.getByteFromFile(new File("Binder" + "/" + request.getFormId() + ".doc")));
					}
				}
			if (request.isProposal()) {
				if(new File("Proposal" + "/" + request.getFormId() + ".docx").exists())
				{
					response.setProposal(WriteByteArray.getByteFromFile(new File("Proposal" + "/" + request.getFormId() + ".docx")));
				}
				else if (new File(
						"Proposal" + "/" + request.getFormId() + ".doc").exists())
				{
					response.setProposal(WriteByteArray.getByteFromFile(new File("Proposal" + "/" + request.getFormId() + ".doc")));
				}
			}
			response.setStatus(CommonConstants.SUCCESS);
		} catch (Exception e) {
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
