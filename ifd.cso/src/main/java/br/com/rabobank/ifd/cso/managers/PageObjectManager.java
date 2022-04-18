package br.com.rabobank.ifd.cso.managers;

import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.object.TelaBensMoveisImoveisObject;
import br.com.rabobank.ifd.cso.object.TelaGeralObject;
import br.com.rabobank.ifd.cso.object.TelaImoveisRuraisObject;
import br.com.rabobank.ifd.cso.object.TelaLoginObject;
//import br.com.rabobank.ifd.cso.object.TelaSemoventesObject;

public class PageObjectManager {

	
	private WebDriver driver;
	//protected WebDriver driver;
	//private TelaImoveisRuraisPage telaImoveisRuraisPage;
	//Métodos comuns
	private TelaLoginObject telaLoginObject;
	private TelaGeralObject telaGeralObject;
	
	//private TelaSemoventesPage telaSemoventesPage;
	private TelaBensMoveisImoveisObject telaBensMoveisObject;

//	private TelaImoveisRuraisPage telaImoveisRuraisPage;
	private TelaImoveisRuraisObject telaImoveisRuraisObject;
	//private TelaSemoventesObject telaSemoventesObject;
//	private TelaSemoventesPage telaSemoventesPage;
	
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

//	public TelaSemoventesPage getTelaSemoventePage() {
//		return (telaSemoventesPage == null) ? telaSemoventesPage = new TelaSemoventesPage(driver) : telaSemoventesPage;
//	}
	
//	public TelaSemoventesObject getTelaSemoventesObject() {
//		return (telaSemoventesObject == null) ? telaSemoventesObject = new TelaSemoventesObject(driver) : telaSemoventesObject;			
//	}
	
	public TelaImoveisRuraisObject getTelaImoveisRuraisObject() {
		return (telaImoveisRuraisObject == null) ? telaImoveisRuraisObject = new TelaImoveisRuraisObject(driver) : telaImoveisRuraisObject;			
	}
	
	public TelaBensMoveisImoveisObject getTelaBensMoveisObject() {
		return (telaBensMoveisObject == null) ? telaBensMoveisObject = new TelaBensMoveisImoveisObject(driver) : telaBensMoveisObject;
	}
}
