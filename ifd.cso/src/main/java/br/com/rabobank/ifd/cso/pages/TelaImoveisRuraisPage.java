package br.com.rabobank.ifd.cso.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rabobank.ifd.cso.utils.TempoEspera;
import br.com.rabobank.ifd.cso.utils.ScrollUtils;

public class TelaImoveisRuraisPage {

	private WebDriver driver;
	private ScrollUtils scroll;
	private WebDriverWait wait;
	private TempoEspera espera;

	public TelaImoveisRuraisPage(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(this.driver, 20);
		PageFactory.initElements(factory, this);
		scroll = new ScrollUtils(driver);
		espera = new TempoEspera();
	}

	@FindBy(xpath = "//*[@id=\"login\"]")
	private WebElement cmpLogin;

	@FindBy(xpath = "//*[@id=\"senha\"]")
	private WebElement cmpSenha;

	@FindBy(xpath = "//*[@id=\"entrar\"]")
	private WebElement btnEntrar;

	@FindBy(xpath = "//*[@id=\"informacoes_patrimoniais\"]")
	private WebElement btnInfPatrimoniais;

	@FindBy(xpath = "//*[@id=\"pills-properties-tab\"]")
	private WebElement btnImoveisRurais;

	@FindBy(xpath = "//*[@id=\"nao_proprios\"]")
	private WebElement btnNaoProprios;

	@FindBy(xpath = "//*[@id=\"proprios\"]")
	private WebElement btnProprios;

	@FindBy(xpath = "//*[@id=\"icone_lixeira\"]")
	private WebElement btnIconeLixeira;

	@FindBy(xpath = "//*[@id=\"deletar\"]")
	private WebElement btnDeletar;

	@FindBy(xpath = "//*[@id=\"cancelar\"]")
	private WebElement btnCancelar;

	@FindBy(xpath = "//*[@id=\"fechar_deletar\"]")
	private WebElement btnFecharDeletar;

	@FindBy(xpath = "//*[@id=\"option_filtro\"]")
	private WebElement cmpFiltro;

	@FindBy(xpath = "//*[@id=\"option_denominacao\"]")
	private WebElement lblDenominacao;

	@FindBy(xpath = "//*[@id=\"option_cidade\"]")
	private WebElement lblCidade;

	@FindBy(xpath = "//*[@id=\"option_uf\"]")
	private WebElement lblUF;

	@FindBy(xpath = "//*[@id=\"option_comarca\"]")
	private WebElement lblComarca;

	@FindBy(xpath = "//*[@id=\"pesquisar\"]")
	private WebElement cmpPesquisar;

	@FindBy(xpath = "//*[@id=\"lupa\"]")
	private WebElement btnLupa;

	// métodos

	public void logarNoSiteIFD() throws InterruptedException {
		cmpLogin.sendKeys("rabobank");
		cmpSenha.sendKeys("rabobank1");

		btnEntrar.click();
		espera.sleep(3000);
	}

	public void clicarInformacoesPatrimoniais() throws InterruptedException {
		btnInfPatrimoniais.click();
	}

	public void clicarAbaImoveisRurais() throws InterruptedException {
		espera.sleep(4000);
		btnImoveisRurais.click();
	}

	public void clicarNaoProprios() throws InterruptedException {
		scroll.scrollPosicao(200);
		btnNaoProprios.click();
		espera.sleep(2000);
	}
	
	public void clicarProprios() throws InterruptedException {
		scroll.scrollPosicao(200);
		btnProprios.click();
		espera.sleep(2000);
	}

	public void clicarIconeLixeira() throws InterruptedException {
		scroll.scrollPosicao(200);
		espera.sleep(4000);
		btnIconeLixeira.click();
		espera.sleep(4000);

	}

	public void clicarDeletar() throws InterruptedException {
		espera.sleep(2000);
		btnDeletar.click();
		espera.sleep(6000);
	}

	public void clicarCancelar() throws InterruptedException {
		espera.sleep(2000);
		btnCancelar.click();
		espera.sleep(2000);
	}

	public void fecharJanelaDeletar() throws InterruptedException {
		espera.sleep(2000);
		btnFecharDeletar.click();
		espera.sleep(4000);
	}

	public void clicarFiltro() {
		cmpFiltro.click();
	}

	public void selecionarDenominacao() {
		lblDenominacao.click();
		scroll.scrollPosicao(100);		
	}

	public void selecionarCidade() {
		lblCidade.click();
		scroll.scrollPosicao(100);		
	}

	public void selecionarUF() {
		lblUF.click();
		scroll.scrollPosicao(100);		
	}

	public void selecionarComarca() {
		lblComarca.click();
		scroll.scrollPosicao(100);		
	}

	public void preencherPesquisa(String pesquisa) throws InterruptedException {
		cmpPesquisar.click();
		cmpPesquisar.sendKeys(pesquisa);
		espera.sleep(2000);
	}
	
	public void clicarLupa() throws InterruptedException {
		espera.sleep(2000);
		scroll.scrollPosicao(100);		
		btnLupa.click();
		espera.sleep(4000);
	}
}
