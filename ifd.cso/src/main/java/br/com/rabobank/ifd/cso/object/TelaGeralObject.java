package br.com.rabobank.ifd.cso.object;

import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.pages.TelaGeralPage;
import br.com.rabobank.ifd.cso.utils.TempoEsperaUtils;

public class TelaGeralObject extends TelaGeralPage{
	
	private TempoEsperaUtils espera = new TempoEsperaUtils(driver);

	public TelaGeralObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clicarInformacoesPatrimoniais() {
		
		espera.verificarElementoExiste(10, btnInfPatrimoniais);
		btnInfPatrimoniais.click();
		espera.verificarLoadDesaparecer(10);
		
	}

}
