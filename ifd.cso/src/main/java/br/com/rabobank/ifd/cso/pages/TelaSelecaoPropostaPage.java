package br.com.rabobank.ifd.cso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class TelaSelecaoPropostaPage {

	protected WebDriver driver;

	public TelaSelecaoPropostaPage(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(this.driver, 20);
		PageFactory.initElements(factory, this);
	}

	@FindBy(id = "tipoPesquisa")
	protected WebElement cmpPesquisa;

	@FindBy(xpath = "//*[@id=\"filtroNumber\"] | //*[@id=\"filtroString\"] | //*[@id=\"filtro\"] | //*[@id=\"institutionalcode\"]" )
	//@FindBy(id = "filtroNumber | filtroString")
	protected WebElement cmpFiltro;

	@FindBy(id = "buscar")
	protected WebElement btnBuscar;

	@FindBy(className = "ng-star-inserted")
	protected WebElement lblLista;

	
}
//*[@id=\"login\"]