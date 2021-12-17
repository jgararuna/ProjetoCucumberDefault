package br.com.rabobank.ifd.cso.object;

import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.pages.TelaImoveisRuraisPage;
import br.com.rabobank.ifd.cso.utils.ScrollUtils;
import br.com.rabobank.ifd.cso.utils.TempoEsperaUtils;

public class TelaImoveisRuraisObject extends TelaImoveisRuraisPage{
	
	private ScrollUtils scroll = new ScrollUtils(driver);
	private TempoEsperaUtils espera = new TempoEsperaUtils(driver);
	
	public TelaImoveisRuraisObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	// métodos

	public void logarNoSiteIFD() throws InterruptedException {
		cmpLogin.click();
		cmpLogin.sendKeys("rabobank");
		
		cmpSenha.click();
		cmpSenha.sendKeys("rabobank1");

		btnEntrar.click();
		//espera.sleep(3000);
	}

	public void clicarInformacoesPatrimoniais() {
		espera.verificarElementoExiste(10, btnInfPatrimoniais);
		btnInfPatrimoniais.click();
	}

	public void clicarAbaImoveisRurais() throws InterruptedException {
		//espera.sleep(4000);
		espera.verificarElementoClicavel(10, btnAbaImoveisRurais);
		espera.verificarLoadDesaparecer(10);
		btnAbaImoveisRurais.click();
	}

	public void clicarNaoProprios() throws InterruptedException {
		scroll.scrollPosicao(200);
		btnNaoProprios.click();
		//espera.sleep(2000);
	}
	
	public void clicarProprios() throws InterruptedException {
		scroll.scrollPosicao(250);
		btnProprios.click();
		//espera.sleep(2000);
	}

	public void clicarIconeLixeira() throws InterruptedException {
		scroll.scrollPosicao(200);
		//espera.sleep(4000);
		espera.verificarElementoExiste(10, btnIconeLixeira);
		btnIconeLixeira.click();
		espera.sleep(4000);

	}

	public void clicarDeletar() throws InterruptedException {
		//espera.sleep(2000);
		espera.verificarElementoExiste(10, btnDeletar);
		btnDeletar.click();
		//espera.sleep(6000);
	}

	public void clicarCancelar() throws InterruptedException {
		espera.verificarElementoExiste(10, btnCancelar);
		btnCancelar.click();
		//espera.sleep(2000);
	}

	public void fecharJanelaDeletar() throws InterruptedException {
		espera.verificarElementoExiste(10, btnFecharDeletar);
		btnFecharDeletar.click();
		//espera.sleep(4000);
	}

	public void clicarFiltro() {
		espera.verificarElementoExiste(10, cmpFiltro);
		cmpFiltro.click();
	}

	public void selecionarDenominacao() {
		espera.verificarElementoExiste(10, lblDenominacao);
		lblDenominacao.click();
		scroll.scrollPosicao(100);		
	}

	public void selecionarCidade() {
		espera.verificarElementoExiste(10, lblCidade);
		lblCidade.click();
		scroll.scrollPosicao(100);		
	}

	public void selecionarUF() {
		espera.verificarElementoExiste(10, lblUF);
		lblUF.click();
		scroll.scrollPosicao(100);		
	}

	public void selecionarComarca() {
		espera.verificarElementoExiste(10, lblComarca);
		lblComarca.click();
		scroll.scrollPosicao(100);		
	}

	public void preencherPesquisa(String pesquisa) throws InterruptedException {
		espera.verificarElementoExiste(10, cmpPesquisar);
		espera.verificarLoadDesaparecer(10);
		cmpPesquisar.click();
		cmpPesquisar.sendKeys(pesquisa);
		//espera.sleep(2000);
	}
	
	public void clicarLupa() throws InterruptedException {
		//espera.sleep(2000);
		scroll.scrollPosicao(100);		
		btnLupa.click();
		//espera.sleep(6000);
	}

}
