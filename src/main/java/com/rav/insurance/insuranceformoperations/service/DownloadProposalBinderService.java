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
				response.setBinder(WriteByteArray.getByteFromFile(new File(
						"Binder" + "/" + request.getFormId() + ".docx")));
			}

			if (request.isProposal()) {
				response.setBinder(WriteByteArray.getByteFromFile(new File(
						"Proposal" + "/" + request.getFormId() + ".docx")));
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
