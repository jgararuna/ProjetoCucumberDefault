package br.com.rabobank.ifd.cso.object;

import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.pages.TelaLoginPage;
import br.com.rabobank.ifd.cso.utils.TempoEsperaUtils;

public class TelaLoginObject extends TelaLoginPage{
	
	private TempoEsperaUtils espera = new TempoEsperaUtils(driver);

	public TelaLoginObject(WebDriver driver) {
		super(driver);
	}
	
	// métodos

	public void logarNoSiteIFD() throws InterruptedException {
		
		cmpLogin.sendKeys("rabobank");
		cmpSenha.sendKeys("rabobank1");
		btnEntrar.click();

	}
	
	public void verificarSiteCarreado() throws InterruptedException {
		
		espera.verificarElementoExiste(10, cmpLogin);

	}
	
	public void informarDados() throws InterruptedException {
		
		cmpLogin.sendKeys("rabobank");
		cmpSenha.sendKeys("rabobank1");

	}
	
	public void acionarEntrar() throws InterruptedException {
		
		btnEntrar.click();

	}
	
	public void verificarSucessoLogin() throws InterruptedException {
		
		espera.verificarElementoExiste(10, btnInfPatrimoniais);

	}
	
	

}
