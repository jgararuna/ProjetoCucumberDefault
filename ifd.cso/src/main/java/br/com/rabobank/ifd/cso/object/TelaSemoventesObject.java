package br.com.rabobank.ifd.cso.object;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.pages.TelaSemoventesPage;
import br.com.rabobank.ifd.cso.utils.ScrollUtils;
import br.com.rabobank.ifd.cso.utils.TempoEsperaUtils;

public class TelaSemoventesObject extends TelaSemoventesPage{
	
	private ScrollUtils scroll = new ScrollUtils(driver);
	private TempoEsperaUtils espera = new TempoEsperaUtils(driver);
	
	public TelaSemoventesObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	// métodos

	public void clicarAbaSemoventes() throws InterruptedException {
		espera.sleep(7000);
		btnAbaSemoventes.click();
	}

	public void selecionarFiltroTipo() throws InterruptedException {
//		espera.sleep(4000);
		scroll.scrollPosicao(250);
		scroll.scrollPosicao(250);
		cmpFiltroTipo.click();
	}

	public void selecionarFiltroRebanho() throws InterruptedException {
//		espera.sleep(4000);
		scroll.scrollPosicao(250);
		scroll.scrollPosicao(250);
		cmpFiltroRebanho.click();
	}
	
	public void clicarAdicionarSemoventes() throws InterruptedException {
//		espera.sleep(4000);
		scroll.scrollPosicao(250);
		scroll.scrollPosicao(250);
		scroll.scrollPosicao(250);
//		espera.sleep(4000);
		btnAdicionarSemoventes.click();
//		espera.sleep(4000);
	}

	public void escolherFiltroQualquer() throws InterruptedException {
//		espera.sleep(4000);
		scroll.scrollPosicao(250);
		scroll.scrollPosicao(250);
		cmpFiltroQualquer.click();
	}

	public void preencherDescricao(String descricao) throws InterruptedException {
//		espera.sleep(4000);
		cmpDescricao.click();
//		espera.sleep(4000);
		cmpDescricao.sendKeys(descricao);
	}

	public void selecionarUF(String UF) throws InterruptedException {
//		espera.sleep(4000);
		cmpUF.click();
		cmpUF.sendKeys(UF, Keys.ENTER);
	}

	public void selecionarCidade(String cidade) throws InterruptedException {
//		espera.sleep(2000);
		cmpCidade.click();
		cmpCidade.sendKeys(cidade, Keys.ENTER);
//		espera.sleep(4000);
	}

	public void selecionarTipoSemovente(String tipoSemovente) throws InterruptedException {
//		espera.sleep(4000);
		cmpTipoSemovente.click();
		cmpTipoSemovente.sendKeys(tipoSemovente, Keys.ENTER);
	}

	public void selecionarRebanho(String rebanho) throws InterruptedException {
//		espera.sleep(2000);
		cmpRebanho.click();
		cmpRebanho.sendKeys(rebanho, Keys.ENTER);
	}

	public void preencherQuantidade(String quantidade) throws InterruptedException {
//		espera.sleep(2000);
		cmpQuantidade.click();
		cmpQuantidade.sendKeys(quantidade, Keys.ENTER);
	}

	public void setarCalculoBase() {
		rdoCalculoBase.click();
	}

	public void setarDefinido() {
		rdoDefinido.click();
	}

	public void setarEfetivo() {
		rdoEfetivo.click();
	}

	public void setarADefinir() {
		rdoADefinir.click();
	}

	public void preencherValorArroba(String valorArroba) {
		cmpValorArroba.click();
		cmpValorArroba.sendKeys(valorArroba);
	}

	public void preencherPesoMedio(String pesoMedio) {
		cmpPesoMedio.click();
		cmpPesoMedio.sendKeys(pesoMedio);
	}

	public void preencherValorUnitario(String valorUnitario) {
		cmpValorUnitario.click();
		cmpValorUnitario.sendKeys(valorUnitario);
	}

	public void selecionarCheckBoxRebanho() {
		chkRebanhoComercializacao.click();
	}

	public void preencherDataComercializacao(String dataComercializacao) throws InterruptedException {
		cmpDataComercializacao.click();
//		espera.sleep(1000);
		cmpDataComercializacao.sendKeys(dataComercializacao, Keys.ENTER);
	}

	public void preencherJustificativaComercilizacao(String Justificativa) {
		cmpJustificativaComercializacao.click();
		cmpJustificativaComercializacao.sendKeys(Justificativa);
	}

	public void clicarSalvar() throws InterruptedException {
		btnSalvar.click();
//		espera.sleep(7000);
	}
}