package br.com.rabobank.ifd.cso.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ByIdOrName;

public class ListWebElementUtils {
	
//	private TestContextUtils testContext;
//
//	public ListWebElementUtils(TestContextUtils context) {
//		testContext = context;
//	}
	
//	private WebDriver driver;
//
//	public ListWebElementUtils(WebDriver driver) {
//		this.driver = driver;
//	}

	public int listChildOfWebElement(WebElement element) {
		
		List<WebElement> elementList = element.findElements(By.xpath("./child::*"));
		return elementList.size();
		
	}
	
//	public <T> List<T> listOfWebElementsSameId(String id){
//		
//	    List<WebElement> list = driver.findElements(By.id(id));
//	    for (WebElement e  : list) {
//	        System.out.println(e.getText());
//	    }
//	    
//		return (List<T>) list;
//		
//	}
	

}
