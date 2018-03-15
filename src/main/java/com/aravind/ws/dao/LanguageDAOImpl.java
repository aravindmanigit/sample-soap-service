package com.aravind.ws.dao;

import java.util.ArrayList;
import java.util.List;

import com.aravind.ws.enumeration.LanguageEnum;
import com.aravind.ws.model.Language;

public class LanguageDAOImpl implements LanguageDAO {

	public List<Language> getLanguages() {
		List<Language> languages = new ArrayList<>();
		languages.add(new Language(LanguageEnum.English.toString()));
		languages.add(new Language(LanguageEnum.Tamil.toString()));
		languages.add(new Language(LanguageEnum.Hindi.toString()));
		return languages;
	}

}
