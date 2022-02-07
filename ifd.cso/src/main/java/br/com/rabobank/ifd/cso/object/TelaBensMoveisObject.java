package br.com.rabobank.ifd.cso.object;

import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.pages.TelaBensMoveisPage;
import br.com.rabobank.ifd.cso.utils.ListWebElementUtils;
import br.com.rabobank.ifd.cso.utils.ScrollUtils;
import br.com.rabobank.ifd.cso.utils.TempoEsperaUtils;

public class TelaBensMoveisObject extends TelaBensMoveisPage {

	private TempoEsperaUtils espera = new TempoEsperaUtils(driver);
	private ListWebElementUtils listWebElementUtils = new ListWebElementUtils();
	private ScrollUtils scroll;
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

	}

	public void clicarLixeira() throws InterruptedException {

//		espera.verificarLoadDesaparecer(10);
		numItensAntes = listWebElementUtils.listChildOfWebElement(listaBensMoveis);
		espera.verificarElementoClicavel(10, btnLixeira);
		// btnLixeira.click();

	}

	public void clicarDeletar() {

//		espera.verificarElementoClicavel(10, btnDeletar);
//		btnDeletar.click();
//		espera.verificarLoadDesaparecer(10);

	}

	public boolean confirmarExclusao() throws InterruptedException {
		// int numItensDepois = 2;
		int numItensDepois = listWebElementUtils.listChildOfWebElement(listaBensMoveis);
		boolean verify = false;
		if (numItensAntes != numItensDepois) {
			verify = true;
		}
		return verify;
	}

	public void clicarAdicionarBensMoveis() {
		espera.verificarElementoClicavel(10, btnAdicionarBemMovel);
		btnAdicionarBemMovel.click();
		scroll.scrollElement(cmpDescricaoItem);
	}

	public void preencherDescricao() {
		cmpDescricaoItem.click();
		cmpDescricaoItem.sendKeys("Descrição Teste");
	}

	public void preencherQuantidade() {
		cmpQuantidade.click();
		cmpQuantidade.sendKeys("100");
	}

	public void preencherValorUnitario() {
		cmpValorUnitario.click();
		cmpValorUnitario.sendKeys("100");
	}

}
