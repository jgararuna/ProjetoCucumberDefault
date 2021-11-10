package br.com.rabobank.ifd.cso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import br.com.rabobank.ifd.cso.utils.ScrollUtils;

public class TelaInicialPage {

	private WebDriver driver;
	private ScrollUtils scroll;

	public TelaInicialPage(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(this.driver, 15);
		PageFactory.initElements(factory, this);
		scroll = new ScrollUtils(driver);
	}

	@FindBy(xpath = "//*[@id=\"login\"]")
	private WebElement cmpLogin;

	@FindBy(xpath = "//*[@id=\"senha\"]")
	private WebElement cmpSenha;

	@FindBy(xpath = "//*[@id=\"entrar\"]")
	private WebElement btnEntrar;

	@FindBy(xpath = "//*[@id=\"informacoes_patrimoniais\"]")
	private WebElement btnInfPatrimoniais;

	@FindBy(xpath = "//*[@id=\"pills-properties-tab\"]")
	private WebElement btnImoveisRurais;

	@FindBy(xpath = "//*[@id=\"nao_proprios\"]")
	private WebElement btnNaoProprios;

	@FindBy(xpath = "//*[@id=\"icone_lixeira\"]")
	private WebElement btnIconeLixeira;
	
	@FindBy(xpath = "//*[@id=\"deletar\"]")
	private WebElement btnDeletar;
	
	@FindBy(xpath = "//*[@id=\"cancelar\"]")
	private WebElement btnCancelar;
	
	@FindBy(xpath = "//*[@id=\"fechar_deletar\"]")
	private WebElement btnFecharDeletar;

	// métodos

	public void logarNoSiteIFD() throws InterruptedException {

		cmpLogin.sendKeys("rabobank");
		cmpSenha.sendKeys("rabobank1");

		btnEntrar.click();
		Thread.sleep(3000);
	}

	public void clicarInformacoesPatrimoniais() throws InterruptedException{
		btnInfPatrimoniais.click();
	}

	public void clicarAbaImoveisRurais() throws InterruptedException {
		Thread.sleep(4000);
		btnImoveisRurais.click();
	}
	
	public void clicarNaoProprios() {
		scroll.scrollPosicao(100);
		btnNaoProprios.click();
	}

	public void clicarIconeLixeira() throws InterruptedException {
		Thread.sleep(4000);
		scroll.scrollPosicao(100);
		btnIconeLixeira.click();
	}

	public void clicarDeletar() {
		btnDeletar.click();
	}

	
	public void clicarCancelar() {
		btnCancelar.click();
	}
	
	public void fecharJanelaDeletar() {
		btnFecharDeletar.click();
	}
}
