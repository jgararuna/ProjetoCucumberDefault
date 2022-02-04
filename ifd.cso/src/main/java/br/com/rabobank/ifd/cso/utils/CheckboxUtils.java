package br.com.rabobank.ifd.cso.utils;

import org.openqa.selenium.WebElement;

public class CheckboxUtils {
	
	public void marcarCheckbox(WebElement checkbox) {
		if(!checkbox.isSelected()) {
			checkbox.click();			
		}
	}

}
