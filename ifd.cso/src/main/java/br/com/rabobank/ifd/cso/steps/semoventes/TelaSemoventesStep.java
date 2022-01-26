package br.com.rabobank.ifd.cso.steps.semoventes;

import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.pages.TelaSemoventesPage;
import br.com.rabobank.ifd.cso.utils.ScreenshotUtils;
import br.com.rabobank.ifd.cso.utils.TestContextUtils;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TelaSemoventesStep {

	WebDriver driver;
	private TestContextUtils testContext;
	private TelaSemoventesPage telaSemoventesPage;
	private ScreenshotUtils screenshot;

	public TelaSemoventesStep(TestContextUtils context) {
		telaSemoventesPage = new TelaSemoventesPage(driver);
		testContext = context;
		telaSemoventesPage = testContext.getPageObjectManager().getTelaSemoventePage();
		screenshot = new ScreenshotUtils(context);
	}

	@Quando("^clico na aba de semoventes$")
	public void clico_na_aba_de_semoventes() throws Throwable {
		telaSemoventesPage.clicarAbaSemoventes();
	}

	@Entao("^semovente sera deletado com sucesso$")
	public void semovente_sera_deletado_com_sucesso() throws Throwable {
		screenshot.getScreenshot("Teste Semovente Deletado");
	}

	@Entao("^semoventes nao sera deletado$")
	public void semoventes_nao_sera_deletado() throws Throwable {
		screenshot.getScreenshot("Teste Semovente Finalizado");
	}

	@Quando("^clico no filtro tipo$")
	public void clico_no_filtro_tipo() throws Throwable {
		telaSemoventesPage.selecionarFiltroTipo();
	}

	@Quando("^clico no filtro rebanho$")
	public void clico_no_filtro_rebanho() throws Throwable {
		telaSemoventesPage.selecionarFiltroRebanho();
	}

	@Quando("^clico no filtro qualquer$")
	public void clico_no_filtro_qualquer() throws Throwable {
		telaSemoventesPage.escolherFiltroQualquer();
	}

	@Entao("^semovente aparecera de acordo com a consulta$")
	public void semovente_aparecera_de_acordo_com_a_consulta() throws Throwable {
		screenshot.getScreenshot("Teste Semovente Consultado");
	}

	@Quando("^clico no botao adicionar semoventes$")
	public void clico_no_botao_adicionar_semoventes() throws Throwable {
		telaSemoventesPage.clicarAdicionarSemoventes();
	}

	@Quando("^clico em salvar$")
	public void clico_em_salvar() throws Throwable {
		telaSemoventesPage.clicarSalvar();
	}

	@Entao("^sera apresentado um alerta com a pendencia de dos campos$")
	public void sera_apresentado_um_alerta_com_a_pendencia_de_dos_campos() throws Throwable {
		screenshot.getScreenshot("Teste Semovente Alerta");
	}

	@Quando("^preencho a descricao \"([^\"]*)\"$")
	public void preencho_a_descricao(String descricao) throws Throwable {
		telaSemoventesPage.preencherDescricao(descricao);
	}

	@Quando("^preencho a UF \"([^\"]*)\"$")
	public void preencho_a_UF(String UF) throws Throwable {
		telaSemoventesPage.selecionarUF(UF);
	}

	@Quando("^preencho a cidade \"([^\"]*)\"$")
	public void preencho_a_cidade(String cidade) throws Throwable {
		telaSemoventesPage.selecionarCidade(cidade);
	}

	@Quando("^preencho a tipo de semoventes \"([^\"]*)\"$")
	public void preencho_a_tipo_de_semoventes(String tipoSemovente) throws Throwable {
		telaSemoventesPage.selecionarTipoSemovente(tipoSemovente);
	}

	@Quando("^preencho a rebanho \"([^\"]*)\"$")
	public void preencho_a_rebanho(String rebanho) throws Throwable {
		telaSemoventesPage.selecionarRebanho(rebanho);
	}

	@Quando("^preencho a quantidade \"([^\"]*)\"$")
	public void preencho_a_quantidade(String quantidade) throws Throwable {
		telaSemoventesPage.preencherQuantidade(quantidade);
	}

	@Quando("^preencho o campo valor arroba \"([^\"]*)\"$")
	public void preencho_o_campo_valor_arroba(String valorArroba) throws Throwable {
		telaSemoventesPage.preencherValorArroba(valorArroba);
	}

	@Quando("^preencho o campo valor unitario \"([^\"]*)\"$")
	public void preencho_o_campo_valor_unitario(String valorUnitario) throws Throwable {
		telaSemoventesPage.preencherValorUnitario(valorUnitario);
	}

	@Quando("^preencho peso \"([^\"]*)\"$")
	public void preencho_peso(String pesoMedio) throws Throwable {
		telaSemoventesPage.preencherPesoMedio(pesoMedio);
	}

	@Quando("^clico em Salvar$")
	public void clico_em_Salvar() throws Throwable {
		telaSemoventesPage.clicarSalvar();
	}

	@Quando("^seleciono o checkbox efetivo$")
	public void seleciono_o_checkbox_efetivo() throws Throwable {
		telaSemoventesPage.setarEfetivo();
	}

	@Entao("^semoventes sera salvo com sucesso$")
	public void semoventes_sera_salvo_com_sucesso() throws Throwable {

	}

	@Quando("^seleciono o checkbox definido$")
	public void seleciono_o_checkbox_definido() throws Throwable {
		telaSemoventesPage.setarDefinido();
	}

	@Quando("^seleciono o checkbox a definir$")
	public void seleciono_o_checkbox_a_definir() throws Throwable {
		telaSemoventesPage.setarADefinir();
	}

	@Quando("^seleciono o chechbox Rebanho pronto para comercializacao$")
	public void seleciono_o_chechbox_Rebanho_pronto_para_comercializacao() throws Throwable {
		telaSemoventesPage.selecionarCheckBoxRebanho();
	}

	@Quando("^preencho a data comercializacao \"([^\"]*)\"$")
	public void preencho_a_data_comercializacao(String dataComercializacao) throws Throwable {
		telaSemoventesPage.preencherDataComercializacao(dataComercializacao);
	}

	@Quando("^preencho a justificativa \"([^\"]*)\"$")
	public void preencho_a_justificativa(String Justificativa) throws Throwable {
		telaSemoventesPage.preencherJustificativaComercilizacao(Justificativa);
	}

}
