package br.com.rabobank.ifd.cso.object;

import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.pages.TelaBensMoveisPage;
import br.com.rabobank.ifd.cso.utils.ListWebElementUtils;
import br.com.rabobank.ifd.cso.utils.ScrollUtils;
import br.com.rabobank.ifd.cso.utils.TempoEsperaUtils;

public class TelaBensMoveisObject extends TelaBensMoveisPage {

	private TempoEsperaUtils espera = new TempoEsperaUtils(driver);
	private ListWebElementUtils listWebElementUtils = new ListWebElementUtils();
	private ScrollUtils scroll = new ScrollUtils(driver);
	int numItensAntes;

	public TelaBensMoveisObject(WebDriver driver) {
		super(driver);
	}

	public void clicarAbaBensMoveisImoveis() throws InterruptedException {

		espera.verificarElementoClicavel(10, btnAbaBensMoveisImoveis);
		espera.verificarLoadDesaparecer(15);
		btnAbaBensMoveisImoveis.click();
		espera.verificarLoadDesaparecer(15);

	}

	public void clicarLixeira() throws InterruptedException {

//		espera.verificarLoadDesaparecer(10);
		// numItensAntes = listWebElementUtils.listChildOfWebElement(listaBensMoveis);
		// System.out.println(btnMoveis.getText());
		numItensAntes = Integer.valueOf(btnMoveis.getText().replaceAll("\\D+", ""));
		// System.out.println("kk " + numItensAntes);
		espera.verificarElementoClicavel(10, btnLixeira);

		btnLixeira.click();

	}

	public void clicarDeletar() {

		espera.verificarElementoClicavel(10, btnDeletar);
		btnDeletar.click();
		espera.verificarLoadDesaparecer(20);
		espera.verificarLoadAparecer(20);
		espera.verificarLoadDesaparecer(20);

//		espera.verificarElementoClicavel(10, btnDeletar);
//		btnDeletar.click();
//		espera.verificarLoadDesaparecer(10);

	}

	public boolean confirmarInclusao() throws InterruptedException {

		int numItensDepois = Integer.valueOf(btnMoveis.getText().replaceAll("\\D+", ""));
		System.out.println("k " + numItensDepois);
		boolean verify = false;
		if (numItensAntes < numItensDepois) {
			verify = true;
		}
		return verify;
	}

	public boolean confirmarExclusao() throws InterruptedException {

		// int numItensDepois = 2;
		// int numItensDepois =
		// listWebElementUtils.listChildOfWebElement(listaBensMoveis);
		int numItensDepois = Integer.valueOf(btnMoveis.getText().replaceAll("\\D+", ""));
		System.out.println("k " + numItensDepois);
		boolean verify = false;
		if (numItensAntes > numItensDepois) {
			verify = true;
			// int numItensDepois = 2;

		}
		return verify;
	}

	public boolean confirmarAlteracao() throws InterruptedException {

		int numItensDepois = Integer.valueOf(btnMoveis.getText().replaceAll("\\D+", ""));
		System.out.println("k " + numItensDepois);
		boolean verify = false;
		if (numItensAntes == numItensDepois) {
			verify = true;
		}
		return verify;
	}

	public void clicarIconeLapis() {
		scroll.scrollPosicao(250);
		espera.verificarElementoClicavel(10, iconeLapis);
		iconeLapis.click();
	}

	public void clicarAdicionarBensMoveis() {
		espera.verificarElementoClicavel(10, btnAdicionarBemMovel);
		btnAdicionarBemMovel.click();
		scroll.scrollPosicao(250);
	}

	public void preencherDescricao() {
		scroll.scrollPosicao(250);
		cmpDescricaoItem.click();
		cmpDescricaoItem.sendKeys("Descrição Teste Novo");
	}

	public void preencherDescricaoAlteracao() {
		scroll.scrollPosicao(250);
		cmpDescricaoItem.click();
		cmpDescricaoItem.clear();
		cmpDescricaoItem.sendKeys("Descrição Teste Alteração");
	}

	public void preencherQuantidade() {
		espera.verificarElementoClicavel(10, cmpQuantidade);
		cmpQuantidade.click();
		cmpQuantidade.sendKeys("100");
	}

	public void preencherQuantidadeAlteracao() {
		espera.verificarElementoClicavel(10, cmpQuantidade);
		cmpQuantidade.click();
		cmpQuantidade.clear();
		cmpQuantidade.sendKeys("50");
	}

	public void preencherValorUnitario() {
		espera.verificarElementoClicavel(10, cmpValorUnitario);
		cmpValorUnitario.click();
		cmpValorUnitario.sendKeys("100");
	}

	public void preencherValorUnitarioAlteracao() {
		espera.verificarElementoClicavel(10, cmpValorUnitario);
		cmpValorUnitario.click();
		cmpValorUnitario.clear();
		cmpValorUnitario.sendKeys("50");
	}

	public void clicarSalvar() {
		espera.verificarElementoClicavel(10, btnSalvar);
		btnSalvar.click();
		espera.verificarLoadDesaparecer(20);
	}

}
