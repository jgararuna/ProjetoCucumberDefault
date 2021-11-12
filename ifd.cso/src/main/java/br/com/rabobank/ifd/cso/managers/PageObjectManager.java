package br.com.rabobank.ifd.cso.managers;

import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.pages.TelaImoveisRuraisPage;

public class PageObjectManager {

	
	private WebDriver driver;
	private TelaImoveisRuraisPage telaInicialPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public TelaImoveisRuraisPage getTelaInicialPage() {
		return (telaInicialPage == null) ? telaInicialPage = new TelaImoveisRuraisPage(driver) : telaInicialPage;
				
	}

}
