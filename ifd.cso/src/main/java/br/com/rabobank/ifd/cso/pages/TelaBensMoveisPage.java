package br.com.rabobank.ifd.cso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class TelaBensMoveisPage {
	
	protected WebDriver driver;

	public TelaBensMoveisPage(WebDriver driver) {
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

	@FindBy(xpath = "//*[@id=\"pills-assets-tab\"]")
	protected WebElement btnAbaBensMoveisImoveis;
	
	@FindBy(id = "btn_adicionar_bens_moveis")
	protected WebElement btnAdd;
	
	@FindBy(id = "descrcaoItem")
	protected WebElement desc;
	
	@FindBy(xpath = "//*[@id=\"icone_lixeira\"]")
	protected WebElement btnLixeira;
	
	@FindBy(xpath = "/html/body/modal-container")
	protected WebElement popup;
	
	@FindBy(xpath = "//*[@id=\"deletar\"]")
	protected WebElement btnDeletar;
	
	@FindBy(xpath = "//*[@id=\"pills-assets\"]/app-assets-properties/div/div[2]/app-assets-properties-list/div[2]/table/tbody")
	protected WebElement listaBensMoveis;
	
	@FindBy(xpath = "//*[@id=\"pills-assets\"]/app-assets-properties/div/div[2]/app-assets-properties-list/div[2]/table/tbody/tr[1]/td[1]/div")
	protected WebElement itemSelecionadoParaExclusao;
	
	@FindBy(id = "moveis")
	protected WebElement btnMoveis;
	
}
