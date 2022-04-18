package br.com.rabobank.ifd.cso.steps.bens;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.object.TelaBensMoveisImoveisObject;
import br.com.rabobank.ifd.cso.steps.comuns.TelaGeralStep;
import br.com.rabobank.ifd.cso.steps.comuns.TelaLoginStep;
import br.com.rabobank.ifd.cso.utils.ScreenshotUtils;
import br.com.rabobank.ifd.cso.utils.TestContextUtils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TelaBensMoveisImoveisStep{
	
	WebDriver driver;
	private TestContextUtils testContext;
	private TelaBensMoveisImoveisObject telaBensMoveisImoveisObject;
	private ScreenshotUtils screenshot;
	private TelaLoginStep telaLoginStep;
	private TelaGeralStep telaGeralStep;
	
	public TelaBensMoveisImoveisStep(TestContextUtils context) {
		
		telaLoginStep = new TelaLoginStep(context);
		telaGeralStep = new TelaGeralStep(context);
		telaBensMoveisImoveisObject = new TelaBensMoveisImoveisObject(driver);
		testContext = context;
		telaBensMoveisImoveisObject = testContext.getPageObjectManager().getTelaBensMoveisObject();
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
		telaBensMoveisImoveisObject.clicarAbaBensMoveisImoveis();
	}
	
	@E("^clico na lixeira do primeiro item da lista de bens moveis$")
	public void clico_na_lixeira_do_primeiro_item_da_lista_de_bens_moveis() throws Throwable {
		screenshot.getScreenshot("Lista_AntesExclusao");
	    telaBensMoveisImoveisObject.clicarLixeira();
	}

	@E("^clico em Deletar na popup de confirmacao de exclusao$")
	public void clico_em_Deletar_na_popup_de_confirmacao_de_exclusao() throws Throwable {
	    telaBensMoveisImoveisObject.clicarDeletar();
	}

	@Entao("^o item será removido da lista de bens moveis$")
	public void o_item_será_removido_da_lista_de_bens_moveis() throws Throwable {		
		Assert.assertTrue("O item não foi removido da lista!", telaBensMoveisImoveisObject.confirmarExclusaoMoveis());
		screenshot.getScreenshot("Lista_DepoisExclusao");
	}

	@Entao("^o item será removido da lista de bens imoveis$")
	public void o_item_será_removido_da_lista_de_bens_imoveis() throws Throwable {		
		Assert.assertTrue("O item não foi removido da lista!", telaBensMoveisImoveisObject.confirmarExclusaoImoveis());
		screenshot.getScreenshot("Lista_DepoisExclusao");
	}
	
	@Quando("^clico no botao Adicionar bens moveis$")
	public void clico_no_botao_Adicionar_bens_moveis() throws Throwable {
	 telaBensMoveisImoveisObject.clicarAdicionarBensMoveis();
	}

	@Quando("^preencho campo Descricao Item$")
	public void preencho_campo_Descricao_Item() throws Throwable {
	    telaBensMoveisImoveisObject.preencherDescricao();
	}

	@Quando("^preencho campo Quantidade$")
	public void preencho_campo_Quantidade() throws Throwable {
	    telaBensMoveisImoveisObject.preencherQuantidade();
	}

	@Quando("^preencho campo Valor Unitario$")
	public void preencho_campo_Valor_Unitario() throws Throwable {
	    telaBensMoveisImoveisObject.preencherValorUnitario();
	}

	@Entao("^a inclusao sera concluida com sucesso$")
	public void a_inclusao_sera_concluida_com_sucesso() throws Throwable {
		Assert.assertTrue("O item foi adicionado da lista!", telaBensMoveisImoveisObject.confirmarInclusaoMoveis());
		screenshot.getScreenshot("Lista_DepoisInclusao");
	}

	@Entao("^a inclusao bens imoveis sera concluida com sucesso$")
	public void a_inclusao_bens_imoveis_sera_concluida_com_sucesso() throws Throwable {
		Assert.assertTrue("O item foi adicionado da lista!", telaBensMoveisImoveisObject.confirmarInclusaoImoveis());
		screenshot.getScreenshot("Lista_DepoisInclusao");
	}
	
	
	@Quando("^clico no icone do lapis$")
	public void clico_no_icone_do_lapis() throws Throwable {
	   telaBensMoveisImoveisObject.clicarIconeLapis();
	}

	@Quando("^altero campo Descricao Item$")
	public void altero_campo_Descricao_Item() throws Throwable {
	    telaBensMoveisImoveisObject.preencherDescricaoAlteracao();
	}

	@Entao("^a alteracao sera concluida com sucesso$")
	public void a_alteracao_sera_concluida_com_sucesso() throws Throwable {
		
		Assert.assertTrue("O item foi alterado da lista!", telaBensMoveisImoveisObject.confirmarAlteracao());
		screenshot.getScreenshot("Lista_DepoisAlteracao");   
	}

	@Entao("^a alteracao imovel sera concluida com sucesso$")
	public void a_alteracao_imovel_sera_concluida_com_sucesso() throws Throwable {
		Assert.assertTrue("O item foi alterado da lista!", telaBensMoveisImoveisObject.confirmarAlteracaoImovel());
		screenshot.getScreenshot("Lista_DepoisAlteracao");   
	}

	@Quando("^altero campo Quantidade$")
	public void altero_campo_Quantidade() throws Throwable {
	   telaBensMoveisImoveisObject.preencherQuantidadeAlteracao();
	}

	@Quando("^altero campo Valor Unitario$")
	public void altero_campo_Valor_Unitario() throws Throwable {
	   telaBensMoveisImoveisObject.preencherValorUnitarioAlteracao();
	}
	
	@Quando("^clico no botao salvar$")
	public void clico_no_botao_salvar() throws Throwable {
	   telaBensMoveisImoveisObject.clicarSalvar();
	}

	@Quando("^clico na lixeira do primeiro item da lista de bens imoveis$")
	public void clico_na_lixeira_do_primeiro_item_da_lista_de_bens_imoveis() throws Throwable {
		screenshot.getScreenshot("Lista_AntesExclusao");
	    telaBensMoveisImoveisObject.clicarLixeira();
	}

	@Quando("^clico no botao imovel$")
	public void clico_no_botao_imovel() throws Throwable {
		telaBensMoveisImoveisObject.clicarImovel();
	}
	
	@Quando("^altero campo Valor Total$")
	public void altero_campo_Valor_Total() throws Throwable {
		telaBensMoveisImoveisObject.preencherValorTotalAlteracao();
	}
	
	@Quando("^clico no botao Imoveis$")
	public void clico_no_botao_Imoveis() throws Throwable {
	    telaBensMoveisImoveisObject.clicarImovel();
	}
	
	@Quando("^clico no botao Adicionar bens imoveis$")
	public void clico_no_botao_Adicionar_bens_imoveis() throws Throwable {
	    telaBensMoveisImoveisObject.clicarAdicionarBensImoveis();
	}

	@Quando("^preencho campo Valor Total$")
	public void preencho_campo_Valor_Total() throws Throwable {
	    telaBensMoveisImoveisObject.preencherValorTotal();
	}


	
}
