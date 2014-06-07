package com.rav.insurance.service;

import javax.xml.ws.WebServiceContext;

public interface IService {

	public Object processRequest(Object model,WebServiceContext wsContext);

	public void validateRequest(Object dto) throws Exception;
	
	public Object createDTO(Object model,WebServiceContext wsContext);
}
