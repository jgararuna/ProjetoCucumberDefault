package br.com.rabobank.ifd.cso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class TelaSemoventesPage {

	protected WebDriver driver;
//	private ScrollUtils scroll;
//	private TempoEsperaUtils espera;

	public TelaSemoventesPage(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(this.driver, 20);
		PageFactory.initElements(factory, this);
//		scroll = new ScrollUtils(driver);
//		espera = new TempoEsperaUtils(driver);
	}

	@FindBy(xpath = "//*[@id=\"pills-livestock-tab\"]")
	protected WebElement btnAbaSemoventes;

	@FindBy(xpath = "//*[@id=\"option_tipo\"]")
	protected WebElement cmpFiltroTipo;

	@FindBy(xpath = "//*[@id=\"option_rebanho\"]")
	protected WebElement cmpFiltroRebanho;

	@FindBy(xpath = "//*[@id=\"option_filtro\"]")
	protected WebElement cmpFiltroQualquer;

	@FindBy(xpath = "//*[@id=\"btn_adicionar_semovente\"]")
	protected WebElement btnAdicionarSemoventes;	
	
	@FindBy(xpath = "//*[@id=\"descricao\"]")
	protected WebElement cmpDescricao;

	@FindBy(xpath = "//*[@id=\"select_uf\"]")
	protected WebElement cmpUF;

	@FindBy(xpath = "//*[@id=\"select_cidade\"]")
	protected WebElement cmpCidade;

	@FindBy(xpath = "//*[@id=\"select_tipo_semovente\"]")
	protected WebElement cmpTipoSemovente;

	@FindBy(xpath = "//*[@id=\"select_rebanho\"]")
	protected WebElement cmpRebanho;

	@FindBy(xpath = "//*[@id=\"quantidade\"]")
	protected WebElement cmpQuantidade;

	@FindBy(xpath = "//*[@id=\"radio_modo_valor_unitario_calc_base\"]")
	protected WebElement rdoCalculoBase;

	@FindBy(xpath = "//*[@id=\"radio_modo_valor_unitario_definido\"]")
	protected WebElement rdoDefinido;

	@FindBy(xpath = "//*[@id=\"radio_modo_valor_unitario_efetivo\"]")
	protected WebElement rdoEfetivo;

	@FindBy(xpath = "//*[@id=\"radio_modo_valor_unitario_a_definir\"]")
	protected WebElement rdoADefinir;

	@FindBy(xpath = "//*[@id=\"valor_arroba\"]")
	protected WebElement cmpValorArroba;

	@FindBy(xpath = "//*[@id=\"peso_medio\"]")
	protected WebElement cmpPesoMedio;

	@FindBy(xpath = "//*[@id=\"valor_unitario\"]")
	protected WebElement cmpValorUnitario;

	@FindBy(xpath = "//*[@id=\"checkbox_rebanho_pronto_para_comercializacao\"]")
	protected WebElement chkRebanhoComercializacao;

	@FindBy(xpath = "//*[@id=\"checkbox_rebanho_pronto_para_comercializacao_data\"]")
	protected WebElement cmpDataComercializacao;

	@FindBy(xpath = "//*[@id=\"justificativa\"]")
	protected WebElement cmpJustificativaComercializacao;

	@FindBy(xpath = "//*[@id=\"btn_salvar\"]")
	protected WebElement btnSalvar;

//	public void clicarAbaSemoventes() throws InterruptedException {
//		espera.sleep(7000);
//		btnAbaSemoventes.click();
//	}
//
//	public void selecionarFiltroTipo() throws InterruptedException {
//		espera.sleep(4000);
//		scroll.scrollPosicao(250);
//		scroll.scrollPosicao(250);
//		cmpFiltroTipo.click();
//	}
//
//	public void selecionarFiltroRebanho() throws InterruptedException {
//		espera.sleep(4000);
//		scroll.scrollPosicao(250);
//		scroll.scrollPosicao(250);
//		cmpFiltroRebanho.click();
//	}
//	
//	public void clicarAdicionarSemoventes() throws InterruptedException {
//		espera.sleep(4000);
//		scroll.scrollPosicao(250);
//		scroll.scrollPosicao(250);
//		scroll.scrollPosicao(250);
//		espera.sleep(4000);
//		btnAdicionarSemoventes.click();
//		espera.sleep(4000);
//	}
//
//	public void escolherFiltroQualquer() throws InterruptedException {
//		espera.sleep(4000);
//		scroll.scrollPosicao(250);
//		scroll.scrollPosicao(250);
//		cmpFiltroQualquer.click();
//	}
//
//	public void preencherDescricao(String descricao) throws InterruptedException {
//		espera.sleep(4000);
//		cmpDescricao.click();
//		espera.sleep(4000);
//		cmpDescricao.sendKeys(descricao);
//	}
//
//	public void selecionarUF(String UF) throws InterruptedException {
//		espera.sleep(4000);
//		cmpUF.click();
//		cmpUF.sendKeys(UF, Keys.ENTER);
//	}
//
//	public void selecionarCidade(String cidade) throws InterruptedException {
//		espera.sleep(2000);
//		cmpCidade.click();
//		cmpCidade.sendKeys(cidade, Keys.ENTER);
//		espera.sleep(4000);
//	}
//
//	public void selecionarTipoSemovente(String tipoSemovente) throws InterruptedException {
//		espera.sleep(4000);
//		cmpTipoSemovente.click();
//		cmpTipoSemovente.sendKeys(tipoSemovente, Keys.ENTER);
//	}
//
//	public void selecionarRebanho(String rebanho) throws InterruptedException {
//		espera.sleep(2000);
//		cmpRebanho.click();
//		cmpRebanho.sendKeys(rebanho, Keys.ENTER);
//	}
//
//	public void preencherQuantidade(String quantidade) throws InterruptedException {
//		espera.sleep(2000);
//		cmpQuantidade.click();
//		cmpQuantidade.sendKeys(quantidade, Keys.ENTER);
//	}
//
//	public void setarCalculoBase() {
//		rdoCalculoBase.click();
//	}
//
//	public void setarDefinido() {
//		rdoDefinido.click();
//	}
//
//	public void setarEfetivo() {
//		rdoEfetivo.click();
//	}
//
//	public void setarADefinir() {
//		rdoADefinir.click();
//	}
//
//	public void preencherValorArroba(String valorArroba) {
//		cmpValorArroba.click();
//		cmpValorArroba.sendKeys(valorArroba);
//	}
//
//	public void preencherPesoMedio(String pesoMedio) {
//		cmpPesoMedio.click();
//		cmpPesoMedio.sendKeys(pesoMedio);
//	}
//
//	public void preencherValorUnitario(String valorUnitario) {
//		cmpValorUnitario.click();
//		cmpValorUnitario.sendKeys(valorUnitario);
//	}
//
//	public void selecionarCheckBoxRebanho() {
//		chkRebanhoComercializacao.click();
//	}
//
//	public void preencherDataComercializacao(String dataComercializacao) throws InterruptedException {
//		cmpDataComercializacao.click();
//		espera.sleep(1000);
//		cmpDataComercializacao.sendKeys(dataComercializacao, Keys.ENTER);
//	}
//
//	public void preencherJustificativaComercilizacao(String Justificativa) {
//		cmpJustificativaComercializacao.click();
//		cmpJustificativaComercializacao.sendKeys(Justificativa);
//	}
//
//	public void clicarSalvar() throws InterruptedException {
//		btnSalvar.click();
//		espera.sleep(7000);
//	}

}
