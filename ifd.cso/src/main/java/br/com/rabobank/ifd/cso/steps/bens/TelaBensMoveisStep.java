package br.com.rabobank.ifd.cso.steps.bens;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.object.TelaBensMoveisObject;
import br.com.rabobank.ifd.cso.steps.comuns.TelaGeralStep;
import br.com.rabobank.ifd.cso.steps.comuns.TelaLoginStep;
import br.com.rabobank.ifd.cso.utils.ScreenshotUtils;
import br.com.rabobank.ifd.cso.utils.TestContextUtils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TelaBensMoveisStep{
	
	WebDriver driver;
	private TestContextUtils testContext;
	private TelaBensMoveisObject telaBensMoveisObject;
	private ScreenshotUtils screenshot;
	private TelaLoginStep telaLoginStep;
	private TelaGeralStep telaGeralStep;
	
	public TelaBensMoveisStep(TestContextUtils context) {
		
		telaLoginStep = new TelaLoginStep(context);
		telaGeralStep = new TelaGeralStep(context);
		telaBensMoveisObject = new TelaBensMoveisObject(driver);
		testContext = context;
		telaBensMoveisObject = testContext.getPageObjectManager().getTelaBensMoveisObject();
		screenshot = new ScreenshotUtils(context);
		
	}
	
	@Dado("^que faco login no site$")
	public void faco_login_no_site() throws Throwable {
		telaLoginStep.logar();
	}

	@Quando("^clico no botao de informacoes patrimoniais$")
	public void clico_no_botao_de_informacoes_patrimoniais() throws Throwable {
		//telaBensMoveisObject.clicarInformacoesPatrimoniais();
		telaGeralStep.clico_no_botao_de_informacoes_patrimoniais();
	}

	@E("^clico na aba de Bens Moveis/Imoveis$")
	public void clico_na_aba_de_imoveis_rurais() throws Throwable {
		telaBensMoveisObject.clicarAbaBensMoveisImoveis();
		//screenshot.getScreenshot("add");
	}
	
	@E("^clico na lixeira do primeiro item da lista de bens moveis$")
	public void clico_na_lixeira_do_primeiro_item_da_lista_de_bens_moveis() throws Throwable {
		screenshot.getScreenshot("Lista_AntesExclusao");
	    telaBensMoveisObject.clicarLixeira();
	}

	@E("^clico em Deletar na popup de confirmacao de exclusao$")
	public void clico_em_Deletar_na_popup_de_confirmacao_de_exclusao() throws Throwable {
	    telaBensMoveisObject.clicarDeletar();
	}

	@Entao("^o item será removido da lista de bens moveis$")
	public void o_item_será_removido_da_lista_de_bens_moveis() throws Throwable {		
		Assert.assertTrue("O item não foi removido da lista!", telaBensMoveisObject.confirmarExclusao());
		screenshot.getScreenshot("Lista_DepoisExclusao");
	}
	
	@Quando("^clico no botao Adicionar bens moveis$")
	public void clico_no_botao_Adicionar_bens_moveis() throws Throwable {
	 telaBensMoveisObject.clicarAdicionarBensMoveis();
	}

	@Quando("^preencho campo Descricao Item$")
	public void preencho_campo_Descricao_Item() throws Throwable {
	    telaBensMoveisObject.preencherDescricao();
	}

	@Quando("^preencho campo Quantidade$")
	public void preencho_campo_Quantidade() throws Throwable {
	    telaBensMoveisObject.preencherQuantidade();
	}

	@Quando("^preencho campo Valor Unitario$")
	public void preencho_campo_Valor_Unitario() throws Throwable {
	    telaBensMoveisObject.preencherValorUnitario();
	}

	@Entao("^a inclusao sera concluida com sucesso$")
	public void a_inclusao_sera_concluida_com_sucesso() throws Throwable {
//		Assert.assertTrue("O item não foi adicionado da lista!", telaBensMoveisObject.confirmarExclusao());
//		screenshot.getScreenshot("Lista_DepoisInclusao");
	}
	
	

}
