package br.com.rabobank.ifd.cso.managers;

import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.pages.TelaImoveisRuraisPage;

public class PageObjectManager {

	
	private WebDriver driver;
	private TelaImoveisRuraisPage telaImoveisRuraisPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public TelaImoveisRuraisPage getTelaImoveisRuraisPage() {
		return (telaImoveisRuraisPage == null) ? telaImoveisRuraisPage = new TelaImoveisRuraisPage(driver) : telaImoveisRuraisPage;			
	}
}
