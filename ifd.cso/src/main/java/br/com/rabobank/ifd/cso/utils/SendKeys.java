package br.com.rabobank.ifd.cso.utils;

import org.openqa.selenium.WebElement;

public class SendKeys {
	
	
	public void clearAndSendKeys(WebElement element, String text) {
		
		element.clear();
		element.sendKeys(text);
		
	}

}
