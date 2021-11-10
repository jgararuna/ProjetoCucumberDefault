package br.com.rabobank.ifd.cso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rabobank.ifd.cso.utils.ScrollUtils;

public class TelaInicialPage {

	private WebDriver driver;
	private ScrollUtils scroll;
	private WebDriverWait wait;

	public TelaInicialPage(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(this.driver, 20);
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
	
	public void clicarNaoProprios() throws InterruptedException {
		scroll.scrollPosicao(200);
		btnNaoProprios.click();
		Thread.sleep(2000);
	}

	public void clicarIconeLixeira() throws InterruptedException {
		scroll.scrollPosicao(200);
		Thread.sleep(4000);
		btnIconeLixeira.click();
		Thread.sleep(4000);
		
	}

	public void clicarDeletar() throws InterruptedException {
		Thread.sleep(2000);
		btnDeletar.click();
		Thread.sleep(6000);
	}

	
	public void clicarCancelar() throws InterruptedException {
		Thread.sleep(2000);
		btnCancelar.click();
		Thread.sleep(2000);
	}
	
	public void fecharJanelaDeletar() throws InterruptedException {
		Thread.sleep(2000);
		btnFecharDeletar.click();
		Thread.sleep(2000);
	}
}
