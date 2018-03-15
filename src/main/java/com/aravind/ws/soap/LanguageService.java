package com.aravind.ws.soap;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.aravind.ws.model.Language;
import com.aravind.ws.serviceprovider.LanguageServiceProvider;
import com.aravind.ws.serviceprovider.LanguageServiceProviderImpl;

@WebService
public class LanguageService {
	
	private LanguageServiceProvider languageServiceProvider = new LanguageServiceProviderImpl();
	
	@WebMethod
	public List<Language> getLanguageList()
	{
		return languageServiceProvider.getLanguages();
	}

}
