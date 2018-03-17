package com.aravind.ws.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.aravind.ws.model.Language;
import com.aravind.ws.serviceprovider.LanguageServiceProvider;
import com.aravind.ws.serviceprovider.LanguageServiceProviderImpl;

@WebService(serviceName="testService", name="AravindService", 
			targetNamespace="http://soap.ws.aravind.com/LanguageService")
public class LanguageService {
	
	private LanguageServiceProvider languageServiceProvider = new LanguageServiceProviderImpl();
	
	@WebMethod(exclude=true)
	public LanguageServiceProvider getLanguageServiceProvider() {
		return languageServiceProvider;
	}

	@WebMethod(exclude=true)
	public void setLanguageServiceProvider(LanguageServiceProvider languageServiceProvider) {
		this.languageServiceProvider = languageServiceProvider;
	}


	@WebMethod(operationName="fetchLanguages", action="fetch_languages")
	public List<String> getLanguageList()
	{
		return null;
	}

}
