package br.com.rabobank.ifd.cso.utils;

import br.com.rabobank.ifd.cso.managers.DriverManager;
import br.com.rabobank.ifd.cso.managers.PageObjectManager;

public class TestContextUtils {

	private DriverManager webDriverManager;
	private PageObjectManager pageObjectManager;

	public TestContextUtils() {
		webDriverManager = new DriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.createDriver());
	}

	public DriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}
