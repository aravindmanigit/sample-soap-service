package com.aravind.ws;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class LanguageTest {

	@Test
	public void getLanguageList() {
		Language languageService = new Language();
		assertNotNull(languageService.getLanguageList());
		assertThat(languageService.getLanguageList().size(), is(3));
	}

}
