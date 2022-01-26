package br.com.rabobank.ifd.cso.managers;

import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.object.TelaBensMoveisObject;
import br.com.rabobank.ifd.cso.object.TelaGeralObject;
import br.com.rabobank.ifd.cso.object.TelaImoveisRuraisObject;
import br.com.rabobank.ifd.cso.object.TelaLoginObject;
import br.com.rabobank.ifd.cso.pages.TelaImoveisRuraisPage;
import br.com.rabobank.ifd.cso.pages.TelaLoginPage;
import br.com.rabobank.ifd.cso.pages.TelaSemoventesPage;

public class PageObjectManager {

	
	private WebDriver driver;
	//protected WebDriver driver;
	//private TelaImoveisRuraisPage telaImoveisRuraisPage;
	//Métodos comuns
	private TelaLoginObject telaLoginObject;
	private TelaGeralObject telaGeralObject;
	
	private TelaImoveisRuraisObject telaImoveisRuraisObject;
	private TelaSemoventesPage telaSemoventesPage;
	private TelaBensMoveisObject telaBensMoveisObject;

	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
//	public TelaImoveisRuraisPage getTelaImoveisRuraisPage() {
//		return (telaImoveisRuraisPage == null) ? telaImoveisRuraisPage = new TelaImoveisRuraisPage(driver) : telaImoveisRuraisPage;			
//	}
	
	public TelaLoginObject getTelaLoginObject() {
		return (telaLoginObject == null) ? telaLoginObject = new TelaLoginObject(driver) : telaLoginObject;
	}
	
	public TelaGeralObject getTelaGeralObject() {
		return (telaGeralObject == null) ? telaGeralObject = new TelaGeralObject(driver) : telaGeralObject;
	}

	public TelaSemoventesPage getTelaSemoventePage() {
		return (telaSemoventesPage == null) ? telaSemoventesPage = new TelaSemoventesPage(driver) : telaSemoventesPage;
	}
	
	public TelaImoveisRuraisObject getTelaImoveisRuraisObject() {
		return (telaImoveisRuraisObject == null) ? telaImoveisRuraisObject = new TelaImoveisRuraisObject(driver) : telaImoveisRuraisObject;			
	}
	
	public TelaBensMoveisObject getTelaBensMoveisObject() {
		return (telaBensMoveisObject == null) ? telaBensMoveisObject = new TelaBensMoveisObject(driver) : telaBensMoveisObject;
	}
}
