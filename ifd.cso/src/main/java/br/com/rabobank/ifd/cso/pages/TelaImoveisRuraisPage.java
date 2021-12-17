package br.com.rabobank.ifd.cso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import br.com.rabobank.ifd.cso.utils.ScrollUtils;
import br.com.rabobank.ifd.cso.utils.TempoEsperaUtils;

public class TelaImoveisRuraisPage {

	protected WebDriver driver;
//	private ScrollUtils scroll;
//	private TempoEsperaUtils espera;

	public TelaImoveisRuraisPage(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(this.driver, 20);
		PageFactory.initElements(factory, this);
//		scroll = new ScrollUtils(driver);
//		espera = new TempoEsperaUtils();
		
	}

	@FindBy(xpath = "//*[@id=\"login\"]")
	protected WebElement cmpLogin;

	@FindBy(xpath = "//*[@id=\"senha\"]")
	protected WebElement cmpSenha;

	@FindBy(xpath = "//*[@id=\"entrar\"]")
	protected WebElement btnEntrar;

	@FindBy(xpath = "//*[@id=\"informacoes_patrimoniais\"]")
	protected WebElement btnInfPatrimoniais;

	@FindBy(xpath = "//*[@id=\"pills-properties-tab\"]")
	protected WebElement btnAbaImoveisRurais;

	@FindBy(xpath = "//*[@id=\"nao_proprios\"]")
	protected WebElement btnNaoProprios;

	@FindBy(xpath = "//*[@id=\"proprios\"]")
	protected WebElement btnProprios;

	@FindBy(xpath = "//*[@id=\"icone_lixeira\"]")
	protected WebElement btnIconeLixeira;

	@FindBy(xpath = "//*[@id=\"deletar\"]")
	protected WebElement btnDeletar;

	@FindBy(xpath = "//*[@id=\"cancelar\"]")
	protected WebElement btnCancelar;

//	@FindBy(xpath = "//*[@id=\"fechar_deletar\"]")
	@FindBy(id = "fechar")
	protected WebElement btnFecharDeletar;

	@FindBy(xpath = "//*[@id=\"option_filtro\"]")
	protected WebElement cmpFiltro;

	@FindBy(xpath = "//*[@id=\"option_denominacao\"]")
	protected WebElement lblDenominacao;

	@FindBy(xpath = "//*[@id=\"option_cidade\"]")
	protected WebElement lblCidade;

	@FindBy(xpath = "//*[@id=\"option_uf\"]")
	protected WebElement lblUF;

//	@FindBy(xpath = "//*[@id=\"option_comarca\"]")
	@FindBy(id = "comarca")
	protected WebElement lblComarca;

	@FindBy(xpath = "//*[@id=\"pesquisar\"]")
	protected WebElement cmpPesquisar;

	@FindBy(xpath = "//*[@id=\"lupa\"]")
	protected WebElement btnLupa;

//	// métodos
//
//	public void logarNoSiteIFD() throws InterruptedException {
//		cmpLogin.click();
//		cmpLogin.sendKeys("rabobank");
//		
//		cmpSenha.click();
//		cmpSenha.sendKeys("rabobank1");
//
//		btnEntrar.click();
//		espera.sleep(3000);
//	}
//
//	public void clicarInformacoesPatrimoniais() {
//		btnInfPatrimoniais.click();
//	}
//
//	public void clicarAbaImoveisRurais() throws InterruptedException {
//		espera.sleep(4000);
//		btnAbaImoveisRurais.click();
//	}
//
//	public void clicarNaoProprios() throws InterruptedException {
//		scroll.scrollPosicao(200);
//		btnNaoProprios.click();
//		espera.sleep(2000);
//	}
//	
//	public void clicarProprios() throws InterruptedException {
//		scroll.scrollPosicao(250);
//		btnProprios.click();
//		espera.sleep(2000);
//	}
//
//	public void clicarIconeLixeira() throws InterruptedException {
//		scroll.scrollPosicao(200);
//		espera.sleep(4000);
//		btnIconeLixeira.click();
//		espera.sleep(4000);
//
//	}
//
//	public void clicarDeletar() throws InterruptedException {
//		espera.sleep(2000);
//		btnDeletar.click();
//		espera.sleep(6000);
//	}
//
//	public void clicarCancelar() throws InterruptedException {
//		btnCancelar.click();
//		espera.sleep(2000);
//	}
//
//	public void fecharJanelaDeletar() throws InterruptedException {
//		btnFecharDeletar.click();
//		espera.sleep(4000);
//	}
//
//	public void clicarFiltro() {
//		cmpFiltro.click();
//	}
//
//	public void selecionarDenominacao() {
//		lblDenominacao.click();
//		scroll.scrollPosicao(100);		
//	}
//
//	public void selecionarCidade() {
//		lblCidade.click();
//		scroll.scrollPosicao(100);		
//	}
//
//	public void selecionarUF() {
//		lblUF.click();
//		scroll.scrollPosicao(100);		
//	}
//
//	public void selecionarComarca() {
//		lblComarca.click();
//		scroll.scrollPosicao(100);		
//	}
//
//	public void preencherPesquisa(String pesquisa) throws InterruptedException {
//		cmpPesquisar.click();
//		cmpPesquisar.sendKeys(pesquisa);
//		espera.sleep(2000);
//	}
//	
//	public void clicarLupa() throws InterruptedException {
//		espera.sleep(2000);
//		scroll.scrollPosicao(100);		
//		btnLupa.click();
//		espera.sleep(6000);
//	}
}
