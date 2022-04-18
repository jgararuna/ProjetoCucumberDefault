package br.com.rabobank.ifd.cso.steps.imoveisrurais;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.vimalselvam.cucumber.listener.Reporter;

import br.com.rabobank.ifd.cso.object.TelaImoveisRuraisObject;
import br.com.rabobank.ifd.cso.object.TelaLoginObject;
import br.com.rabobank.ifd.cso.pages.TelaImoveisRuraisPage;
import br.com.rabobank.ifd.cso.steps.comuns.TelaGeralStep;
import br.com.rabobank.ifd.cso.steps.comuns.TelaLoginStep;
import br.com.rabobank.ifd.cso.utils.ScreenshotUtils;
import br.com.rabobank.ifd.cso.utils.TestContextUtils;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TelaImoveisRuraisStep{
	
	WebDriver driver;
	private TestContextUtils testContext;
	//private TelaImoveisRuraisPage telaImoveisRuraisPage;
	private TelaImoveisRuraisObject telaImoveisRuraisObject;
	private TelaLoginStep telaLoginStep;
	private TelaGeralStep telaGeralStep;
	private ScreenshotUtils screenshot;
		
	public TelaImoveisRuraisStep(TestContextUtils context) {

		telaImoveisRuraisObject = new TelaImoveisRuraisObject(driver);
		telaLoginStep = new TelaLoginStep(context);
		telaGeralStep = new TelaGeralStep(context);
		testContext = context;
		telaImoveisRuraisObject = testContext.getPageObjectManager().getTelaImoveisRuraisObject();
		screenshot = new ScreenshotUtils(context);
	
	}
	
	@Dado("^que faco login no site$")
	public void faco_login_no_site() throws Throwable {
		telaLoginStep.logar();
		//telaImoveisRuraisObject.logarNoSiteIFD();
	}

	@Quando("^clico no botao de informacoes patrimoniais$")
	public void clico_no_botao_de_informacoes_patrimoniais() throws Throwable {
		telaGeralStep.clico_no_botao_de_informacoes_patrimoniais();
		//telaImoveisRuraisObject.clicarInformacoesPatrimoniais();
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
		//telaImoveisRuraisObject.selecionarUF();
	}
	
	@Quando("^clico na cidade$")
	public void clico_na_cidade() throws Throwable {
		//telaImoveisRuraisObject.selecionarCidade();
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
	
	/* Fluxos de inclusao */
	@Quando("^clico no botão de incluir imovel nao proprio$")
	public void clico_no_botão_de_incluir_imovel_nao_proprio() throws Throwable {
		screenshot.getScreenshot("Lista_AntesInclusao");
	    telaImoveisRuraisObject.clicarAddImovelNaoProprio();
	}

	@Quando("^preencho os campos obrigatórios$")
	public void preencho_os_campos_obrigatórios() throws Throwable {
	    telaImoveisRuraisObject.preencherCamposObrigatorios();
	}
	
	/* Fluxos de inclusao para valor fixo */
	@Quando("^marco as coluna atual e anoUm da distribuição como valor fixo$")
	public void marco_a_coluna_atual_e_anoUm_da_distribuição_como_valor_fixo() throws Throwable {
		telaImoveisRuraisObject.marcarColunasAtualAnoUmValorFixo();
	}
	
	@Quando("^preencho o campo Custo\\(Ha\\) e distribuo todos os períodos disponíveis para valor fixo na coluna atual$")
	public void preencho_o_campo_Custo_Ha_e_distribuo_todos_os_períodos_disponíveis_para_valor_fixo_na_coluna_atual() throws Throwable {
	    telaImoveisRuraisObject.preencherColunaAtualAnoUmValorFixo("Atual");
	}
	
	@Quando("^preencho o campo Custo\\(Ha\\) e distribuo todos os períodos disponíveis para valor fixo na coluna anoUm$")
	public void preencho_o_campo_Custo_Ha_e_distribuo_todos_os_períodos_disponíveis_para_valor_fixo_na_coluna_anoUm() throws Throwable {
		telaImoveisRuraisObject.preencherColunaAtualAnoUmValorFixo("Ano 1");
	}
	
	@Quando("^preencho o campo Custo\\(Ha\\) e distribuo todos os períodos disponíveis para valor fixo na coluna projeção$")
	public void preencho_o_campo_Custo_Ha_e_distribuo_todos_os_períodos_disponíveis_para_valor_fixo_na_coluna_projeção() throws Throwable {
	    telaImoveisRuraisObject.preencherColunaProjecaoValorFixo();
	}
	
	/* Fluxos de inclusao para valor contrato */
	@Quando("^marco a coluna atual e anoUm da distribuição como contrato$")
	public void marco_a_coluna_atual_e_anoUm_da_distribuição_como_contrato() throws Throwable {
	    telaImoveisRuraisObject.marcarColunasAtualAnoUmContrato();
	}

	@Quando("^seleciono uma mercadoria que tenha valor Ref\\.RBB$")
	public void seleciono_uma_mercadoria_que_tenha_valor_Ref_RBB() throws Throwable {
	    telaImoveisRuraisObject.preencherMercadoria("Boi Gordo Com Escala Pasto");
	}
	
	@Quando("^preencho o campo Kg/Ha e distribuo todos os períodos disponíveis para contrato na coluna atual$")
	public void preencho_o_campo_Kg_Ha_e_distribuo_todos_os_períodos_disponíveis_para_contrato_na_coluna_atual() throws Throwable {
	    telaImoveisRuraisObject.preencherColunaAtualAnoUmContrato("Atual");
	}
	
	@Quando("^preencho o campo Kg/Ha e distribuo todos os períodos disponíveis para contrato na coluna anoUm$")
	public void preencho_o_campo_Kg_Ha_e_distribuo_todos_os_períodos_disponíveis_para_contrato_na_coluna_anoUm() throws Throwable {
	    telaImoveisRuraisObject.preencherColunaAtualAnoUmContrato("Ano 1");
	}
	
	@Quando("^preencho o campo Kg/Ha e distribuo todos os períodos disponíveis para contrato na coluna projeção$")
	public void preencho_o_campo_Kg_Ha_e_distribuo_todos_os_períodos_disponíveis_para_contrato_na_coluna_projeção() throws Throwable {
	    telaImoveisRuraisObject.preencherColunaProjecaoContrato();
	}
	
	@E("^ciclo no botão Salvar$")
	public void ciclo_no_botão_Salvar() throws Throwable {
	    telaImoveisRuraisObject.clicarBotaoSalvar();
	}

	@Entao("^o sistema conclui o cadastro e apresenta mensagem de sucesso$")
	public void o_sistema_conclui_o_cadastro_e_apresenta_mensagem_de_sucesso() throws Throwable {
		Assert.assertTrue("O item não foi adicionado da lista!", telaImoveisRuraisObject.confirmarInclusao());
		screenshot.getScreenshot("Lista_DepoisInclusao");
	}
	
	

}