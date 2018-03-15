package com.aravind.ws.manager;

import java.util.List;

import com.aravind.ws.dao.LanguageDAO;
import com.aravind.ws.dao.LanguageDAOImpl;
import com.aravind.ws.model.Language;

public class LanguageManagerImpl implements LanguageManager {

	private LanguageDAO languageDAO = new LanguageDAOImpl();
	
	
	public LanguageDAO getLanguageDAO() {
		return languageDAO;
	}


	public void setLanguageDAO(LanguageDAO languageDAO) {
		this.languageDAO = languageDAO;
	}


	@Override
	public List<Language> getLanguages() {
		return languageDAO.getLanguages();
	}

}
