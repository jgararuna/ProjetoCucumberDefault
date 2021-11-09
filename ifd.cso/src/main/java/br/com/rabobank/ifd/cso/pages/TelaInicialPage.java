package br.com.rabobank.ifd.cso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TelaInicialPage {

	private WebDriverWait wait;
	private WebDriver driver;

	public TelaInicialPage(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(this.driver, 15);
		PageFactory.initElements(factory, this);
	}

	@FindBy(xpath = "//*[@id=\"login\"]")
	private WebElement cmpLogin;

	@FindBy(xpath = "//*[@id=\"senha\"]")
	private WebElement cmpSenha;

	@FindBy(xpath = "/html/body/div[1]/div[2]/div/mat-dialog-container/app-dialog/div/button")
	private WebElement btnEntrar;

	@FindBy(xpath = "//*[@id=\"informacoes_patrimoniais\"]")
	private WebElement btnInfPatrimoniais;

	@FindBy(xpath = "//*[id=\"pills-properties-tab\"]")
	private WebElement btnImoveisRurais;

	@FindBy(xpath = "//*[@btn=\"nao_proprios\"]")
	private WebElement btnNaoProprios;

	// métodos

	public void logarNoSiteIFD() throws InterruptedException {

		cmpLogin.sendKeys("Rabobank");
		cmpSenha.sendKeys("Rabobank1");
		btnEntrar.click();
	}

	public void clicarInformacoesPatrimoniais() throws InterruptedException {
		Thread.sleep(500000);
		btnInfPatrimoniais.click();

	}

	public void clicarAbaImoveisRurais() {
		btnImoveisRurais.click();

	}

	public void clicarNaoProprios() {
		btnNaoProprios.click();
	}

}
