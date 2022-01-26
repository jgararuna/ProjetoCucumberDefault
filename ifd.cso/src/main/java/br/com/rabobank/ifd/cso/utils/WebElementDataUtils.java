package br.com.rabobank.ifd.cso.utils;

import org.openqa.selenium.WebElement;

public class WebElementDataUtils {
	
	public String getTextFromWebElement(WebElement element) {
		
		String text = element.getText();
		return text;

	}

}
