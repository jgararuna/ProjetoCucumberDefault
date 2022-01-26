package br.com.rabobank.ifd.cso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class TelaLoginPage {
	
	protected WebDriver driver;
	
	public TelaLoginPage(WebDriver driver) {
		
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(this.driver, 20);
		PageFactory.initElements(factory, this);
		
	}
	
	@FindBy(xpath = "//*[@id=\"login\"]")
	protected WebElement cmpLogin;

	@FindBy(xpath = "//*[@id=\"senha\"]")
	protected WebElement cmpSenha;

	@FindBy(xpath = "//*[@id=\"entrar\"]")
	protected WebElement btnEntrar;
	
	@FindBy(xpath = "//*[@id=\"informacoes_patrimoniais\"]")
	protected WebElement btnInfPatrimoniais;

}
