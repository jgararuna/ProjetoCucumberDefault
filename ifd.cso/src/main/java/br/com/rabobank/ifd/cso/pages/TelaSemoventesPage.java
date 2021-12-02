package br.com.rabobank.ifd.cso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import br.com.rabobank.ifd.cso.utils.ScrollUtils;
import br.com.rabobank.ifd.cso.utils.TempoEsperaUtils;

public class TelaSemoventesPage {
	
	private WebDriver driver;
	private ScrollUtils scroll;
	private TempoEsperaUtils espera;

	public TelaSemoventesPage(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(this.driver, 20);
		PageFactory.initElements(factory, this);
		scroll = new ScrollUtils(driver);
		espera = new TempoEsperaUtils();
	}
	
	
	@FindBy(id = "pills-livestock-tab")
	private WebElement btnAbaSemoventes;
	
	@FindBy(xpath = "//*[@id=\"icone_lixeira\"]")
	private WebElement btnIconeLixeira;

	@FindBy(xpath = "//*[@id=\"deletar\"]")
	private WebElement btnDeletar;

	@FindBy(xpath = "//*[@id=\"cancelar\"]")
	private WebElement btnCancelar;

//	@FindBy(xpath = "//*[@id=\"fechar_deletar\"]")
	@FindBy(id = "fechar")
	private WebElement btnFecharDeletar;

}
