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
	
	//@FindBy(xpath = "//*[@id=\"login\"]")
	@FindBy(id = "i0116")
	protected WebElement cmpLogin;
	
	@FindBy(id = "idSIButton9")
	protected WebElement btnAvancar;
	
	@FindBy(id = "aadRedirectCancel")
	protected WebElement btnCancelar;

	//@FindBy(xpath = "//*[@id=\"senha\"]")
	@FindBy(id = "passwordInput")
	protected WebElement cmpSenha;

	@FindBy(id = "submitButton")
	protected WebElement btnSignin;
	
	@FindBy(id = "idSIButton9")
	protected WebElement btnSim;
	
	@FindBy(id = "idSIButton9")
	protected WebElement btnContinuar;
	
	@FindBy(id = "entrar")
	protected WebElement btnConcordo;
	
	@FindBy(id = "informacoes_patrimoniais")
	protected WebElement btnInfPatrimoniais;

}
