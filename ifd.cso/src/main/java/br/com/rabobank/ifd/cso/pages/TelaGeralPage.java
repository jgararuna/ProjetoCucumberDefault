package br.com.rabobank.ifd.cso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class TelaGeralPage {
	
	protected WebDriver driver;
	
	public TelaGeralPage(WebDriver driver) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(this.driver, 20);
		PageFactory.initElements(factory, this);
		
	}
	
	//@FindBy(id = "informacoes_patrimoniais")
	@FindBy(xpath = "/html/body/app-root/app-nav/div[1]/a[3]")
	protected WebElement btnInfPatrimoniais;
	
	@FindBy(xpath = "/html/body/app-root/app-nav/div[1]")
	protected WebElement menuLateral;	

}
