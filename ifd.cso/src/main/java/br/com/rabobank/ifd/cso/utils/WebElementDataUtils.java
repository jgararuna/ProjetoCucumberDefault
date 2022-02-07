package br.com.rabobank.ifd.cso.utils;

import org.openqa.selenium.WebElement;

public class WebElementDataUtils {
	
	public String getTextFromWebElement(WebElement element) {
		
		String text = element.getText();
		return text;

	}
	
	public int getMaxlengthElement(WebElement element) {
		
		int length = 0;
		
		try {
			length = Integer.valueOf(element.getAttribute("maxlength"));
		} catch (NumberFormatException e) {
			length = element.getAttribute("mask").length();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
		return length;
		
	}

}
