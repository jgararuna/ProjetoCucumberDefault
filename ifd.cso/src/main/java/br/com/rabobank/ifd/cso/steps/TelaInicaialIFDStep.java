package br.com.rabobank.ifd.cso.steps;

import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.pages.TelaInicialPage;
import br.com.rabobank.ifd.cso.utils.ScreenshotUtils;
import br.com.rabobank.ifd.cso.utils.TestContextUtils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TelaInicaialIFDStep {
	
	WebDriver driver;
	private TestContextUtils testContext;
	private TelaInicialPage telaInicialPage;
	private ScreenshotUtils screenshot;
		
	public TelaInicaialIFDStep(TestContextUtils context) {
	telaInicialPage = new TelaInicialPage(driver);
	testContext = context;
	telaInicialPage = testContext.getPageObjectManager().getTelaInicialPage();
	screenshot = new ScreenshotUtils(context);
	
	}

	@Dado("^que faco login no site$")
	public void faco_login_no_site() throws Throwable {
		telaInicialPage.logarNoSiteIFD();
	}

	@Quando("^clico no botao de informacoes patrimoniais$")
	public void clico_no_botao_de_informacoes_patrimoniais() throws Throwable {
		telaInicialPage.clicarInformacoesPatrimoniais();
	}

	@Quando("^clico no botao nao proprios$")
	public void clico_no_botao_nao_proprios() throws Throwable {
		telaInicialPage.clicarNaoProprios();
	}
	
	@Quando("^clico na aba de imoveis rurais$")
	public void clico_na_aba_de_imoveis_rurais() throws Throwable {
	    
		
	}


	@Quando("^clico no icone da lixeira$")
	public void clico_no_icone_da_lixeira() throws Throwable {
		
	}

	@Quando("^clico em Deletar$")
	public void clico_em_Deletar() throws Throwable {

	}

	@Entao("^imovel sera deletado com sucesso$")
	public void imovel_sera_deletado_com_sucesso() throws Throwable {

	}
}