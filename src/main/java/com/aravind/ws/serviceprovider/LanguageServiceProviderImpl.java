package com.aravind.ws.serviceprovider;

import java.util.List;

import com.aravind.ws.manager.LanguageManager;
import com.aravind.ws.manager.LanguageManagerImpl;
import com.aravind.ws.model.Language;

public class LanguageServiceProviderImpl implements LanguageServiceProvider {

	private LanguageManager languageManager = new LanguageManagerImpl();
	
	
	public LanguageManager getLanguageManager() {
		return languageManager;
	}


	public void setLanguageManager(LanguageManager languageManager) {
		this.languageManager = languageManager;
	}


	@Override
	public List<Language> getLanguages() {
		return languageManager.getLanguages();
	}

}
