package com.rav.insurance.service;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

public abstract class ServiceAbstract implements IService {

	public String getIPAddress(WebServiceContext wsContext) {
		MessageContext mc = wsContext.getMessageContext();
		HttpServletRequest req = (HttpServletRequest) mc
				.get(MessageContext.SERVLET_REQUEST);
		return req.getRemoteAddr();
	}
	
}
