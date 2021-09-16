package br.com.rabobank.ifd.cso.managers;

import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.pages.TelaInicialPage;

public class PageObjectManager {

	
	private WebDriver driver;
	private TelaInicialPage telaInicialPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public TelaInicialPage getTelaInicialPage() {
		return (telaInicialPage == null) ? telaInicialPage = new TelaInicialPage(driver) : telaInicialPage;
		
		
	}
	
//	public TelaLoginPage getTelaLoginPage() {
//		return (telaLoginPage == null) ? telaLoginPage = new TelaLoginPage(driver) : telaLoginPage;
//		
//		
//	}
//	public TelaFichaCadastralPage telaFichaCadastralPage() {
//		return (telaFichaCadastralPage == null) ? telaFichaCadastralPage = new TelaFichaCadastralPage(driver) : telaFichaCadastralPage;
//		
//		
//	}
//	

}
