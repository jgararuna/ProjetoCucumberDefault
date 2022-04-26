package br.com.rabobank.ifd.cso.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class TelaImoveisRuraisPage {

	protected WebDriver driver;

	public TelaImoveisRuraisPage(WebDriver driver) {
		this.driver = driver;
		AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(this.driver, 20);
		PageFactory.initElements(factory, this);
		
	}

	/*	
		Localizadores da tela de listagem
	*/
//	@FindBy(xpath = "//*[@id=\"login\"]")
//	protected WebElement cmpLogin;
//
//	@FindBy(xpath = "//*[@id=\"senha\"]")
//	protected WebElement cmpSenha;
//
//	@FindBy(xpath = "//*[@id=\"entrar\"]")
//	protected WebElement btnEntrar;

	@FindBy(xpath = "//*[@id=\"informacoes_patrimoniais\"]")
	protected WebElement btnInfPatrimoniais;

	@FindBy(xpath = "//*[@id=\"pills-properties-tab\"]")
	protected WebElement btnAbaImoveisRurais;
	
	@FindBy(xpath = "//*[@id=\"pills-properties\"]/app-rural-properties/div/div[2]/app-rural-properties-list/div[2]/table/tbody")
	protected WebElement listNaoProprios;

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

	@FindBy(xpath = "//*[@id=\"fechar_deletar\"]")
	protected WebElement btnFecharDeletar;
	
	@FindBy(xpath = "//*[@id=\"pills-properties\"]/app-rural-properties/div/div[2]/app-rural-properties-list/div[2]/table/tbody/tr/td[6]/div/div/i[1]")
	protected WebElement btnEditarPrimeiraProposta;

//	@FindBy(xpath = "//*[@id=\"option_filtro\"]")
//	protected WebElement cmpFiltro;
//
//	@FindBy(xpath = "//*[@id=\"option_denominacao\"]")
//	protected WebElement lblDenominacao;
//
//	@FindBy(xpath = "//*[@id=\"option_cidade\"]")
//	protected WebElement lblCidade;
//
//	@FindBy(xpath = "//*[@id=\"option_uf\"]")
//	protected WebElement lblUF;
//
//	@FindBy(xpath = "//*[@id=\"option_comarca\"]")
//	protected WebElement lblComarca;
	
	@FindBy(id= "filtro")
	protected WebElement cmbFiltro;

	@FindBy(id = "pesquisar")
	protected WebElement cmpPesquisar;

	@FindBy(id = "lupa")
	protected WebElement btnLupa;
	
	@FindBy(id = "btn_adicionar_nao_imovel_proprio")
	protected WebElement btnIncluirNaoProprio;
	
	/*	
		Localizadores da tela de inclusão/alteração de imóveis não próprios
	*/	
	@FindBy(id = "matricula")
	protected WebElement cmpMatricula;
	
	@FindBy(xpath = "//div[@class='matriculaStyle input-w-sm matriculaBg']/i")
	protected WebElement addMatricula;
	
	@FindBy(xpath = "//*[@id=\"pills-properties\"]/app-rural-properties/div/div[2]/app-rural-properties-list/div[2]/table/tbody/app-form-not-own/table/thead/tr[1]/td[1]/div[2]/div/i")
	protected WebElement excluirMatricula;
	
	@FindBy(id = "nomeImovel")
	protected WebElement cmpNomeImovel;
	
	@FindBy(id = "areaUtil")
	protected WebElement cmpAreaUtil;
	
	@FindBy(id = "selectUf")
	protected WebElement cbxUf;
	
	@FindBy(id = "selectCidade")
	protected WebElement cbxCidade;
	
	@FindBy(id = "vencContrato")
	protected WebElement cmpVencimento;
	
	@FindBy(id = "radioAtual")
	protected WebElement chkBtnValorFixoAtual;

	@FindBy(id = "radioAtualContrato")
	protected WebElement chkBtnContratoAtual;
	
	@FindBy(id = "cursoHaAtual")
	protected WebElement cmpCustoAtual;
	
	@FindBy(id = "kgHaAtual")
	protected WebElement cmpKgAtual;
	
	@FindBy(id = "valorTotalAtual")
	protected WebElement cmpValorTotalAtual;
	
	@FindAll(@FindBy(xpath = "//tr[6]/td[1]/div/div[7]/div/div"))
	protected List<WebElement> listDistribAtual;
	
	@FindBy(id = "selectPeriodoAtual")
	protected WebElement cbxPeriodoAtual;
	
	@FindBy(id = "valorAtual")
	protected WebElement cmpValorAtual;
	
	@FindBy(id = "btnDistribAtual")
	protected WebElement btnDistribAtual;
	
	@FindBy(id = "icone_lixeira")
	protected WebElement btnExcluirDistrib;
	
	@FindBy(id = "radioValorFixoAno1")
	protected WebElement chkBtnValorFixoAno1;

	@FindBy(id = "radioContratoAno1")
	protected WebElement chkBtnContratoAno1;
	
	@FindBy(id = "custoHaAno1")
	protected WebElement cmpCustoAno1;
	
	@FindBy(id = "kgHaAno1")
	protected WebElement cmpKgAno1;
	
	@FindBy(id = "valorTotalAno1")
	protected WebElement cmpValorTotalAno1;
	
	@FindAll(@FindBy(xpath = "//tr[6]/td[2]/div/div[6]/div[2]/div/div"))
	protected List<WebElement> listDistribAno1;
	
	@FindBy(id = "periodoAno1Select")
	protected WebElement cbxPeriodoAno1;
	
	@FindBy(id = "valorPeriodoAno1")
	protected WebElement cmpValorAno1;
	
	@FindBy(id = "btnDistribAno1")
	protected WebElement btnDistribAno1;
	
	@FindBy(id = "radioValorFixoProjecao")
	protected WebElement chkBtnValorFixoProjecao;

	@FindBy(id = "radioContratoProjecao")
	protected WebElement chkBtnContratoProjecao;
	
	@FindBy(id = "custoHaProjecao")
	protected WebElement cmpCustoProjecao;
	
	@FindBy(id = "kgHaProjecao")
	protected WebElement cmpKgProjecao;
	
	@FindBy(id = "valorTotalProjecao")
	protected WebElement cmpValorTotalProjecao;
	
	@FindBy(xpath = "//*[@id=\"pills-properties\"]/app-rural-properties/div/div[2]/app-rural-properties-list/div[2]/table/tbody/app-form-not-own[2]/table/thead/tr[6]/td[3]/div/div[4]/div[3]")
	protected WebElement listDistribProj;
	
	//@FindAll(@FindBy(xpath = "//tr[6]/td[3]/div/div[4]/div[3]/div//div[4]/i[1]"))
	@FindAll(@FindBy(xpath = "//tr[6]/td[3]/div/div[4]/div[3]/div/div[4]/i[1]"))
	protected List<WebElement> btnsEditarProjecao;
	
	@FindAll(@FindBy(xpath = "//tr[6]/td[3]/div/div[4]/div[3]/div/div[4]/i[2]"))
	protected List<WebElement> btnsExcluirProjecao;
	
	@FindBy(xpath = "//td[3]/div/div[4]/div[1]/button[@id=\"btnDistribAtual\"]")
	protected WebElement btnDistribProjecao;
	
	@FindBy(id = "selectMercadoria")
	protected WebElement cbxMercadoria;
	
	@FindBy(id = "kgHaProjecao")
	protected WebElement cmpJustificativa;
	//*[@id="pills-properties"]/app-rural-properties/div/div[2]/app-rural-properties-list/div[2]/table/tbody/app-form-not-own/table/thead/tr[7]/td[3]/button
	@FindBy(xpath = "//button[text()=' Salvar ']")
	protected WebElement btnSalvar;
	
}
