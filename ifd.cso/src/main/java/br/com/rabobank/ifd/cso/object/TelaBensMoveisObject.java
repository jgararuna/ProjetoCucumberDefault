package br.com.rabobank.ifd.cso.object;



import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ByIdOrName;

import br.com.rabobank.ifd.cso.pages.TelaBensMoveisPage;
import br.com.rabobank.ifd.cso.utils.ListWebElementUtils;
import br.com.rabobank.ifd.cso.utils.ScrollUtils;
import br.com.rabobank.ifd.cso.utils.TempoEsperaUtils;
import junit.framework.AssertionFailedError;

public class TelaBensMoveisObject extends TelaBensMoveisPage{
	
	private TempoEsperaUtils espera = new TempoEsperaUtils(driver);
	private ListWebElementUtils listWebElementUtils = new ListWebElementUtils();
	int numItensAntes;
	
	public TelaBensMoveisObject(WebDriver driver) {
		super(driver);
	}
	
	// métodos

//	public void logarNoSiteIFD() throws InterruptedException {
//		
//		//cmpLogin.click();
//		cmpLogin.sendKeys("rabobank");
//		
//		//cmpSenha.click();
//		cmpSenha.sendKeys("rabobank1");
//
//		btnEntrar.click();
//
//	}
//
//	public void clicarInformacoesPatrimoniais() {
//		
//		espera.verificarElementoExiste(10, btnInfPatrimoniais);
//		btnInfPatrimoniais.click();
//		
//	}

	public void clicarAbaBensMoveisImoveis() throws InterruptedException {
		
		espera.verificarElementoClicavel(10, btnAbaBensMoveisImoveis);
		espera.verificarLoadDesaparecer(10);
		btnAbaBensMoveisImoveis.click();
		espera.verificarLoadDesaparecer(10);
		btnAdd.click();
		new ScrollUtils(driver).scrollElement(desc);
		
	}

	public void clicarLixeira() throws InterruptedException {
		
		
//		espera.verificarLoadDesaparecer(10);
		//numItensAntes = listWebElementUtils.listChildOfWebElement(listaBensMoveis);
		//System.out.println(btnMoveis.getText());
		numItensAntes = Integer.valueOf(btnMoveis.getText().replaceAll("\\D+",""));
		//System.out.println("kk " + numItensAntes);
		espera.verificarElementoClicavel(10, btnLixeira);
		btnLixeira.click();

	}
	
	public void clicarDeletar() {
		
		espera.verificarElementoClicavel(10, btnDeletar);
		btnDeletar.click();
		espera.verificarLoadDesaparecer(20);
		espera.verificarLoadAparecer(20);
		espera.verificarLoadDesaparecer(20);
		
	}
	
	public boolean confirmarExclusao() throws InterruptedException {
		
		//int numItensDepois = 2;
		//int numItensDepois = listWebElementUtils.listChildOfWebElement(listaBensMoveis);
		int numItensDepois = Integer.valueOf(btnMoveis.getText().replaceAll("\\D+",""));
		System.out.println("k " + numItensDepois);
		boolean verify = false;
		if(numItensAntes > numItensDepois) {
			verify = true;			
		}
		
		return verify;

	}	

}
