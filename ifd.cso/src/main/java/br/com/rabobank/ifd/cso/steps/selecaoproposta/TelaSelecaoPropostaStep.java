package br.com.rabobank.ifd.cso.steps.selecaoproposta;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.object.TelaSelecaoPropostaObject;
import br.com.rabobank.ifd.cso.steps.comuns.TelaGeralStep;
import br.com.rabobank.ifd.cso.steps.comuns.TelaLoginStep;
import br.com.rabobank.ifd.cso.utils.ScreenshotUtils;
import br.com.rabobank.ifd.cso.utils.TestContextUtils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;

public class TelaSelecaoPropostaStep {
	
	WebDriver driver;
	private TestContextUtils testContext;
	private TelaSelecaoPropostaObject telaSelecaoPropostaObject;
	private TelaLoginStep telaLoginStep;
	private ScreenshotUtils screenshot;
	
	public TelaSelecaoPropostaStep(TestContextUtils context) {
		telaLoginStep = new TelaLoginStep(context);
		screenshot = new ScreenshotUtils(context);
		telaSelecaoPropostaObject = new TelaSelecaoPropostaObject(driver);
		testContext = context;
		telaSelecaoPropostaObject = testContext.getPageObjectManager().getSelecaoPropostaObject();
		
	}
	
	@Dado("^que faco login no site$")
	public void que_faco_login_no_site() throws Throwable {
	   telaLoginStep.logar();
	}
	
	@Dado("^seleciono tipo de pesquisa Proposta$")
	public void seleciono_tipo_de_pesquisa_Proposta() throws Throwable {
	   telaSelecaoPropostaObject.selecionarTipoPesquisaProposta();
	}

	@Dado("^digito o filtro do cod proposta$")
	public void digito_o_filtro_do_cod_proposta() throws Throwable {
	   telaSelecaoPropostaObject.digitarFiltroProposta();
	}

	@Dado("^clico em buscar$")
	public void clico_em_buscar() throws Throwable {
	    telaSelecaoPropostaObject.clicarBotaoBuscar();
	}

	@Entao("^o sistema apresentara a prosposta de acordo com o filtro$")
	public void o_sistema_apresentara_a_prosposta_de_acordo_com_o_filtro() throws Throwable {
		Assert.assertTrue("Apresentou o filtro selecionado na lista !", telaSelecaoPropostaObject.verificarFiltro());
		screenshot.getScreenshot("Filtro_SelecaoProposta");
		
	}

	@Dado("^seleciono tipo de pesquisa status$")
	public void seleciono_tipo_de_pesquisa_status() throws Throwable {
	telaSelecaoPropostaObject.selecionarTipoPesquisaStatus();
	}

	@Dado("^digito o filtro do status da proposta$")
	public void digito_o_filtro_do_status_da_proposta() throws Throwable {
	    telaSelecaoPropostaObject.digitarFiltroStatus();
	}

	@Dado("^seleciono tipo de pesquisa produtor$")
	public void seleciono_tipo_de_pesquisa_produtor() throws Throwable {
	    telaSelecaoPropostaObject.selecionarTipoPesquisaProdutor();
	}

	@Dado("^digito o filtro do produtor$")
	public void digito_o_filtro_do_produtor() throws Throwable {
	    telaSelecaoPropostaObject.digitarFiltroProdutor();
	}

	@Dado("^seleciono tipo de pesquisa regional$")
	public void seleciono_tipo_de_pesquisa_regional() throws Throwable {
	    telaSelecaoPropostaObject.selecionarTipoPesquisaRegional();
	}

	@Dado("^digito o filtro da regional$")
	public void digito_o_filtro_da_regional() throws Throwable {
	    telaSelecaoPropostaObject.digitarFiltroRegional();
	}

	@Dado("^seleciono tipo de pesquisa agencia$")
	public void seleciono_tipo_de_pesquisa_agencia() throws Throwable {
	   telaSelecaoPropostaObject.selecionarTipoPesquisaAgencia();
	}

	@Dado("^digito o filtro da agencia$")
	public void digito_o_filtro_da_agencia() throws Throwable {
	    telaSelecaoPropostaObject.digitarFiltroAgencia();
	}

	@Dado("^seleciono tipo de pesquisa gerente de contas$")
	public void seleciono_tipo_de_pesquisa_gerente_de_contas() throws Throwable {
	    telaSelecaoPropostaObject.selecionarTipoPesquisaGerenteDeContas();
	}

	@Dado("^digito o filto do gerente de contas$")
	public void digito_o_filto_do_gerente_de_contas() throws Throwable {
	   telaSelecaoPropostaObject.digitarFiltroGerenteContas();
	}

}
