package br.com.rabobank.ifd.cso.steps;

import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.object.TelaImoveisRuraisObject;
import br.com.rabobank.ifd.cso.pages.TelaImoveisRuraisPage;
import br.com.rabobank.ifd.cso.utils.ScreenshotUtils;
import br.com.rabobank.ifd.cso.utils.TestContextUtils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TelaImoveisRuraisStep {
	
	WebDriver driver;
	private TestContextUtils testContext;
	//private TelaImoveisRuraisPage telaImoveisRuraisPage;
	private TelaImoveisRuraisObject telaImoveisRuraisObject;
	private ScreenshotUtils screenshot;
		
	public TelaImoveisRuraisStep(TestContextUtils context) {
	//telaImoveisRuraisPage = new TelaImoveisRuraisPage(driver);
	telaImoveisRuraisObject = new TelaImoveisRuraisObject(driver);
	testContext = context;
	//telaImoveisRuraisPage = testContext.getPageObjectManager().getTelaImoveisRuraisPage();
	telaImoveisRuraisObject = testContext.getPageObjectManager().getTelaImoveisRuraisObject();
	screenshot = new ScreenshotUtils(context);
	}

//	@Dado("^que faco login no site$")
//	public void faco_login_no_site() throws Throwable {
//		telaImoveisRuraisPage.logarNoSiteIFD();
//	}
//
//	@Quando("^clico no botao de informacoes patrimoniais$")
//	public void clico_no_botao_de_informacoes_patrimoniais() throws Throwable {
//		telaImoveisRuraisPage.clicarInformacoesPatrimoniais();
//	}
//
//	@Quando("^clico na aba de imoveis rurais$")
//	public void clico_na_aba_de_imoveis_rurais() throws Throwable {
//	    telaImoveisRuraisPage.clicarAbaImoveisRurais();
//		
//	}
//
//	@Quando("^clico no botao nao proprios$")
//	public void clico_no_botao_nao_proprios() throws Throwable {
//		telaImoveisRuraisPage.clicarNaoProprios();
//	}
//
//	@Quando("^clico no botao proprios$")
//	public void clico_no_botao_proprios() throws Throwable {
//		telaImoveisRuraisPage.clicarProprios();
//	}
//	
//
//	@Quando("^clico no icone da lixeira$")
//	public void clico_no_icone_da_lixeira() throws Throwable {
//		telaImoveisRuraisPage.clicarIconeLixeira();
//	}
//
//	@Quando("^clico em Deletar$")
//	public void clico_em_Deletar() throws Throwable {
//		telaImoveisRuraisPage.clicarDeletar();
//	}
//
//	@Quando("^clico em Cancelar$")
//	public void clico_em_Cancelar() throws Throwable {
//		telaImoveisRuraisPage.clicarCancelar();
//	}
//
//	@Quando("^clico no X para fechar a janela$")
//	public void clico_no_X_para_fechar_a_janela() throws Throwable {
//		telaImoveisRuraisPage.fecharJanelaDeletar();
//	}
//
//	@Entao("^imovel nao proprio sera deletado com sucesso$")
//	public void imovel_sera_deletado_com_sucesso() throws Throwable {
//		screenshot.getScreenshot("Excluir_NaoProprio");
//	}
//
//	@Entao("^imovel nao proprio nao sera deletado$")
//	public void imovel_nao_proprio_nao_sera_deletado() throws Throwable {
//		screenshot.getScreenshot("Excluir_NaoProprio");
//	}
//	
//	@Quando("^clico na denominacao$")
//	public void clico_na_denominacao() throws Throwable {
//		telaImoveisRuraisPage.selecionarDenominacao();
//	}
//
//	@Quando("^clico em UF$")
//	public void clico_em_UF() throws Throwable {
//		telaImoveisRuraisPage.selecionarUF();
//	}
//	
//	@Quando("^clico na cidade$")
//	public void clico_na_cidade() throws Throwable {
//		telaImoveisRuraisPage.selecionarCidade();
//	}
//	
//	@Quando("^clico na comarca$")
//	public void clico_na_comarca() throws Throwable {
//		telaImoveisRuraisPage.selecionarComarca();
//	}
//
//	@Quando("^preencho o campo \"([^\"]*)\"$")
//	public void preencho_o_campo(String pesquisar) throws Throwable {
//		telaImoveisRuraisPage.preencherPesquisa(pesquisar);
//	}
//
//	@Quando("^clico na lupa$")
//	public void clico_na_lupa() throws Throwable {
//		telaImoveisRuraisPage.clicarLupa();
//	}
//
//	@Entao("^imovel nao proprio aparecera de acordo com a consulta$")
//	public void imovel_nao_proprio_aparecera_de_acordo_com_a_consulta() throws Throwable {
//		screenshot.getScreenshot("Listar_NaoProprios_Pesquisa");
//		
//	}
//	
//	@Entao("^imovel proprio aparecera de acordo com a consulta$")
//	public void imovel_proprio_aparecera_de_acordo_com_a_consulta() throws Throwable {
//		screenshot.getScreenshot("Listar_Proprios_Pesquisa");
//		
//	}
	
	@Dado("^que faco login no site$")
	public void faco_login_no_site() throws Throwable {
		telaImoveisRuraisObject.logarNoSiteIFD();
	}

	@Quando("^clico no botao de informacoes patrimoniais$")
	public void clico_no_botao_de_informacoes_patrimoniais() throws Throwable {
		telaImoveisRuraisObject.clicarInformacoesPatrimoniais();
	}

	@Quando("^clico na aba de imoveis rurais$")
	public void clico_na_aba_de_imoveis_rurais() throws Throwable {
		telaImoveisRuraisObject.clicarAbaImoveisRurais();
		
	}

	@Quando("^clico no botao nao proprios$")
	public void clico_no_botao_nao_proprios() throws Throwable {
		telaImoveisRuraisObject.clicarNaoProprios();
	}

	@Quando("^clico no botao proprios$")
	public void clico_no_botao_proprios() throws Throwable {
		telaImoveisRuraisObject.clicarProprios();
	}
	

	@Quando("^clico no icone da lixeira$")
	public void clico_no_icone_da_lixeira() throws Throwable {
		telaImoveisRuraisObject.clicarIconeLixeira();
	}

	@Quando("^clico em Deletar$")
	public void clico_em_Deletar() throws Throwable {
		telaImoveisRuraisObject.clicarDeletar();
	}

	@Quando("^clico em Cancelar$")
	public void clico_em_Cancelar() throws Throwable {
		telaImoveisRuraisObject.clicarCancelar();
	}

	@Quando("^clico no X para fechar a janela$")
	public void clico_no_X_para_fechar_a_janela() throws Throwable {
		telaImoveisRuraisObject.fecharJanelaDeletar();
	}

	@Entao("^imovel nao proprio sera deletado com sucesso$")
	public void imovel_sera_deletado_com_sucesso() throws Throwable {
		screenshot.getScreenshot("Excluir_NaoProprio");
	}

	@Entao("^imovel nao proprio nao sera deletado$")
	public void imovel_nao_proprio_nao_sera_deletado() throws Throwable {
		screenshot.getScreenshot("Excluir_NaoProprio");
	}
	
	@Quando("^clico na denominacao$")
	public void clico_na_denominacao() throws Throwable {
		telaImoveisRuraisObject.selecionarDenominacao();
	}

	@Quando("^clico em UF$")
	public void clico_em_UF() throws Throwable {
		telaImoveisRuraisObject.selecionarUF();
	}
	
	@Quando("^clico na cidade$")
	public void clico_na_cidade() throws Throwable {
		telaImoveisRuraisObject.selecionarCidade();
	}
	
	@Quando("^clico na comarca$")
	public void clico_na_comarca() throws Throwable {
		telaImoveisRuraisObject.selecionarComarca();
	}

	@Quando("^preencho o campo \"([^\"]*)\"$")
	public void preencho_o_campo(String pesquisar) throws Throwable {
		telaImoveisRuraisObject.preencherPesquisa(pesquisar);
	}

	@Quando("^clico na lupa$")
	public void clico_na_lupa() throws Throwable {
		telaImoveisRuraisObject.clicarLupa();
	}

	@Entao("^imovel nao proprio aparecera de acordo com a consulta$")
	public void imovel_nao_proprio_aparecera_de_acordo_com_a_consulta() throws Throwable {
		screenshot.getScreenshot("Listar_NaoProprios_Pesquisa");
		
	}
	
	@Entao("^imovel proprio aparecera de acordo com a consulta$")
	public void imovel_proprio_aparecera_de_acordo_com_a_consulta() throws Throwable {
		screenshot.getScreenshot("Listar_Proprios_Pesquisa");
		
	}

}