package com.aravind.ws;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class Language {
	
	public List<String> getLanguageList()
	{
		List<String> languageList = new ArrayList<String>();
		languageList.add("Tamil");
		languageList.add("English");
		languageList.add("Hindi");
		return languageList;
	} 

}
