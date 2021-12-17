package br.com.rabobank.ifd.cso.managers;

import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.object.TelaImoveisRuraisObject;
import br.com.rabobank.ifd.cso.pages.TelaImoveisRuraisPage;
import br.com.rabobank.ifd.cso.pages.TelaSemoventesPage;

public class PageObjectManager {

	
	private WebDriver driver;
	//protected WebDriver driver;
	private TelaImoveisRuraisPage telaImoveisRuraisPage;
	private TelaImoveisRuraisObject telaImoveisRuraisObject;
	private TelaSemoventesPage telaSemoventesPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
//	public TelaImoveisRuraisPage getTelaImoveisRuraisPage() {
//		return (telaImoveisRuraisPage == null) ? telaImoveisRuraisPage = new TelaImoveisRuraisPage(driver) : telaImoveisRuraisPage;			
//	}

	public TelaSemoventesPage getTelaSemoventePage() {
		return (telaSemoventesPage == null) ? telaSemoventesPage = new TelaSemoventesPage(driver) : telaSemoventesPage;
	}
	
	public TelaImoveisRuraisObject getTelaImoveisRuraisObject() {
		return (telaImoveisRuraisObject == null) ? telaImoveisRuraisObject = new TelaImoveisRuraisObject(driver) : telaImoveisRuraisObject;			
	}
}
