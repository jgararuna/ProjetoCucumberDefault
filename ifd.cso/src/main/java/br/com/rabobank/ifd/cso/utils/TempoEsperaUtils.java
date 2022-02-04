package br.com.rabobank.ifd.cso.utils;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vimalselvam.cucumber.listener.Reporter;

public class TempoEsperaUtils{
	
	private WebDriver driver;
	
	public TempoEsperaUtils (WebDriver driver) {
		this.driver = driver;
	}
	
	public void sleep(int tempo) throws InterruptedException {
		Thread.sleep(tempo * 1000);
	}
	
	public boolean verificarElementoExiste(int tempoEsperaSegundos, WebElement element) {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, tempoEsperaSegundos);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}
	
	public boolean verificarElementosExistem(int tempoEsperaSegundos, List<WebElement> btnEditarProjecao) {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, tempoEsperaSegundos);
			wait.until(ExpectedConditions.visibilityOfAllElements(btnEditarProjecao));
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}
	
	public boolean verificarElementoClicavel(int tempoEsperaSegundos, WebElement element) {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver, tempoEsperaSegundos);
			wait.until(ExpectedConditions.elementToBeClickable(element));
			return true;
		}catch (Exception e) {
			return false;
		}
		
	}
	
	//public boolean verificarLoadDesaparecer(int tempoEsperaSegundos) {
	public void verificarLoadDesaparecer(int tempoEsperaSegundos) {
		
		boolean verificador = false;
		WebElement load = driver.findElement(By.xpath("/html/body/app-root/app-spinner"));
		try {
			WebDriverWait wait = new WebDriverWait(driver, tempoEsperaSegundos);
			wait.until(ExpectedConditions.invisibilityOf(load));
		}catch (TimeoutException to) {
			Reporter.addStepLog("A página demorou mais que " + tempoEsperaSegundos + " segundos para carregar.");
			Assert.assertTrue(verificador);		
		}	
		
	}
	
	

}
