package br.com.rabobank.ifd.cso.object;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.NotActiveException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rabobank.ifd.cso.managers.FileReaderManager;
import br.com.rabobank.ifd.cso.pages.TelaLoginPage;
import br.com.rabobank.ifd.cso.utils.TempoEsperaUtils;

public class TelaLoginObject extends TelaLoginPage{
	
	private TempoEsperaUtils espera = new TempoEsperaUtils(driver);

	public TelaLoginObject(WebDriver driver) {
		super(driver);
	}
	
	// métodos

	public void logarNoSiteIFD() throws InterruptedException {
		
//		espera.verificarElementoExiste(10, cmpLogin);
//		//cmpLogin.sendKeys("joao.araruna");
//		btnAvancar.click();
//		confirmAlert();
//		//cmpSenha.sendKeys("rabobank1");
//		btnEntrar.click();

	}
	
	public void verificarSiteCarregado() throws InterruptedException {
		
		espera.verificarElementoExiste(10, cmpLogin);

	}
	
	public void informarDados() throws InterruptedException, AWTException {
		
		
		espera.verificarElementoExiste(10, cmpLogin);
		cmpLogin.sendKeys(FileReaderManager.getInstance().getConfigReader().getUsuario());
		btnAvancar.click();
		espera.waitExplicito(5);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		espera.verificarElementoExiste(10, cmpSenha);
		cmpSenha.sendKeys(FileReaderManager.getInstance().getConfigReader().getSenha());
//		JavascriptExecutor js = (JavascriptExecutor)driver;
////		String ready = (String)js.executeScript("return document.readyState");
////		System.out.println(ready);
//		while(js.executeScript("return document.readyState").equals("complete")) {
//			System.out.println("aqui");
//		}
////		new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd ->
////        ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
////		
//		System.out.println("saiu");

	}
	
	public void executarPassosParaEntrada() throws InterruptedException {
		
		espera.verificarElementoExiste(10, btnSignin);
		btnSignin.click();
		espera.verificarElementoExiste(10, btnSim);
		btnSim.click();
		espera.verificarElementoExiste(10, btnContinuar);
		btnContinuar.click();	

	}
	
	public void concordarTermos() {
		
		espera.verificarElementoExiste(10, btnConcordo);
		espera.verificarLoadDesaparecer(10);
		btnConcordo.click();
		
	}
	
	public void verificarSucessoLogin() throws InterruptedException {
		
		espera.verificarElementoExiste(10, btnInfPatrimoniais);

	}

}
