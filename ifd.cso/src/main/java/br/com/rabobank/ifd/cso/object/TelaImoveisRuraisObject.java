package br.com.rabobank.ifd.cso.object;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.rabobank.ifd.cso.pages.TelaImoveisRuraisPage;
import br.com.rabobank.ifd.cso.utils.CheckboxUtils;
import br.com.rabobank.ifd.cso.utils.ComboboxUtils;
import br.com.rabobank.ifd.cso.utils.ConvertUtils;
import br.com.rabobank.ifd.cso.utils.RandomUtils;
import br.com.rabobank.ifd.cso.utils.ScrollUtils;
import br.com.rabobank.ifd.cso.utils.TempoEsperaUtils;
import br.com.rabobank.ifd.cso.utils.WebElementDataUtils;

public class TelaImoveisRuraisObject extends TelaImoveisRuraisPage{
	
	private ScrollUtils scroll = new ScrollUtils(driver);
	private TempoEsperaUtils espera = new TempoEsperaUtils(driver);
	private ComboboxUtils comboboxUtils = new ComboboxUtils(driver);
	private ConvertUtils convertUtils = new ConvertUtils();
	private CheckboxUtils checkboxUtils = new CheckboxUtils();
	private ScrollUtils scrollUtils = new ScrollUtils(driver);
	private WebElementDataUtils webElementDataUtils = new WebElementDataUtils();
	private RandomUtils randomUtils = new RandomUtils();
	
	public TelaImoveisRuraisObject(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	// métodos

//	public void logarNoSiteIFD() throws InterruptedException {
//		cmpLogin.click();
//		cmpLogin.sendKeys("rabobank");
//		
//		cmpSenha.click();
//		cmpSenha.sendKeys("rabobank1");
//
//		btnEntrar.click();
//		//espera.sleep(3000);
//	}
//
//	public void clicarInformacoesPatrimoniais() {
//		espera.verificarElementoExiste(10, btnInfPatrimoniais);
//		btnInfPatrimoniais.click();
//	}

	public void clicarAbaImoveisRurais() throws InterruptedException {
		//espera.sleep(4000);
		espera.verificarElementoClicavel(10, btnAbaImoveisRurais);
		espera.verificarLoadDesaparecer(15);
		btnAbaImoveisRurais.click();
	}

	public void clicarNaoProprios() throws InterruptedException {
		//scroll.scrollPosicao(200);
		espera.verificarLoadDesaparecer(15);
		btnNaoProprios.click();
		//espera.sleep(2000);
	}
	
	public void clicarProprios() throws InterruptedException {
		//scroll.scrollPosicao(250);
		espera.verificarLoadDesaparecer(10);
		btnProprios.click();
		//espera.sleep(2000);
	}

	public void clicarIconeLixeira() throws InterruptedException {
		scroll.scrollPosicao(200);
		//espera.sleep(4000);
		espera.verificarElementoExiste(10, btnIconeLixeira);
		btnIconeLixeira.click();
		espera.sleep(4000);

	}

	public void clicarDeletar() throws InterruptedException {
		//espera.sleep(2000);
		espera.verificarElementoExiste(10, btnDeletar);
		btnDeletar.click();
		//espera.sleep(6000);
	}

	public void clicarCancelar() throws InterruptedException {
		espera.verificarElementoExiste(10, btnCancelar);
		btnCancelar.click();
		//espera.sleep(2000);
	}

	public void fecharJanelaDeletar() throws InterruptedException {
		espera.verificarElementoExiste(10, btnFecharDeletar);
		btnFecharDeletar.click();
		//espera.sleep(4000);
	}

	public void clicarFiltro() {
		espera.verificarElementoExiste(10, cmpFiltro);
		cmpFiltro.click();
	}

	public void selecionarDenominacao() {
		espera.verificarElementoExiste(10, lblDenominacao);
		lblDenominacao.click();
		scroll.scrollPosicao(100);		
	}

	public void selecionarCidade() {
		espera.verificarElementoExiste(10, lblCidade);
		lblCidade.click();
		scroll.scrollPosicao(100);		
	}

	public void selecionarUF() {
		espera.verificarElementoExiste(10, lblUF);
		lblUF.click();
		scroll.scrollPosicao(100);		
	}

	public void selecionarComarca() {
		espera.verificarElementoExiste(10, lblComarca);
		lblComarca.click();
		scroll.scrollPosicao(100);		
	}

	public void preencherPesquisa(String pesquisa) throws InterruptedException {
		espera.verificarElementoExiste(10, cmpPesquisar);
		espera.verificarLoadDesaparecer(10);
		cmpPesquisar.click();
		cmpPesquisar.sendKeys(pesquisa);
		//espera.sleep(2000);
	}
	
	public void clicarLupa() throws InterruptedException {
		//espera.sleep(2000);
		scroll.scrollPosicao(100);		
		btnLupa.click();
		//espera.sleep(6000);
	}
	
	public void clicarAddImovelNaoProprio() {
		
		espera.verificarElementoClicavel(10, btnIncluirNaoProprio);
		espera.verificarLoadDesaparecer(15);
		btnIncluirNaoProprio.click();
		espera.verificarLoadDesaparecer(15);
		
	}
	
	public void preencherCamposObrigatorios() {
		System.out.println("hey");
		espera.verificarElementosExistem(10, btnsEditarProjecao);
		cmpMatricula.sendKeys(randomUtils.generateStringOfLongRandomNumber(webElementDataUtils.getMaxlengthElement(cmpMatricula)));
		addMatricula.click();
		cmpNomeImovel.sendKeys("Nome Imovel Nao Proprio");
		cmpAreaUtil.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(webElementDataUtils.getMaxlengthElement(cmpAreaUtil)));
		comboboxUtils.selecionarOpcaoComboBoxByText(cbxUf, "MG");
		//comboboxUtils.selecionarOpcaoComboBoxByPosition(cbxUf, 1);
		espera.verificarLoadDesaparecer(10);
		comboboxUtils.selecionarOpcaoComboBoxByText(cbxCidade, "Além Paraíba");
		//comboboxUtils.selecionarOpcaoComboBoxByPosition(cbxCidade, 1);
		cmpVencimento.sendKeys("31122023");
		
	}
	
	public void marcarColunasAtualAnoUmValorFixo() {
		
		checkboxUtils.marcarCheckbox(chkBtnValorFixoAtual);
		checkboxUtils.marcarCheckbox(chkBtnValorFixoAno1);
		
	}
	
	public void preencherColunaAtualAnoUmValorFixo(String nomeColuna) {
		
		//espera.verificarElementosExistem(10, btnsEditarProjecao);

		WebElement combobox, cmpCusto,cmpValor, btnDistribuir;
		
		if(nomeColuna == "Atual") {
			combobox = cbxPeriodoAtual;
			cmpCusto = cmpCustoAtual;
			cmpValor = cmpValorAtual;
			btnDistribuir = btnDistribAtual;		
		}
		
		else {
			combobox = cbxPeriodoAno1;
			cmpCusto = cmpCustoAno1;
			cmpValor = cmpValorAno1;
			btnDistribuir = btnDistribAno1;
		}
		
		int i = 1, tamanhoComboboxPeriodo = comboboxUtils.getComboboxSize(combobox) - 1;
		cmpCusto.sendKeys(convertUtils.convertInttoString(tamanhoComboboxPeriodo));
		//cmpCusto.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(webElementDataUtils.getMaxlengthElement(cmpCusto)));
		cmpValorTotalAtual.click();
		
		NumberFormat nf = new DecimalFormat("#.00");
		
		double valorTotal = 0.00;
		try {
			valorTotal = nf.parse (cmpValorTotalAtual.getAttribute("value").replace("R$ ","").replace(".", "").replace(",", ".")).doubleValue();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("aqui1 " + valorTotal);
		
		double valor = 0.00;
		try {
			valor = nf.parse (String.valueOf(valorTotal/tamanhoComboboxPeriodo)).doubleValue();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		while(i <= tamanhoComboboxPeriodo){
			
			comboboxUtils.selecionarOpcaoComboBoxByPosition(combobox, 1);
			cmpValor.sendKeys(String.valueOf(valor).replace(".", ","));
			btnDistribuir.click();
			i++;
			
		}		
		
	}
	
	public void preencherColunaProjecaoValorFixo() {
		
		int i = 0, numeroBtnsEdicao = btnsEditarProjecao.size();

		while(i < numeroBtnsEdicao){
			
			btnsEditarProjecao.get(i).click();
			cmpCustoProjecao.sendKeys("100");
			btnDistribProjecao.click();
			i++;
			
		}		
		
	}
	
	public void marcarColunasAtualAnoUmContrato() {
		
		checkboxUtils.marcarCheckbox(chkBtnContratoAtual);
		checkboxUtils.marcarCheckbox(chkBtnContratoAno1);
		
	}
	
	public void preencherMercadoria(String mercadoria) {
		
		comboboxUtils.selecionarOpcaoComboBoxByText(cbxMercadoria, mercadoria);
		espera.verificarLoadDesaparecer(15);
		
	}
	
	public void preencherColunaAtualAnoUmContrato(String nomeColuna) {

		WebElement combobox, cmpKg,cmpValor, btnDistribuir;
		
		if(nomeColuna == "Atual") {
			combobox = cbxPeriodoAtual;
			cmpKg = cmpKgAtual;
			cmpValor = cmpValorAtual;
			btnDistribuir = btnDistribAtual;
		}
		else {
			combobox = cbxPeriodoAno1;
			cmpKg = cmpKgAno1;
			cmpValor = cmpValorAno1;
			btnDistribuir = btnDistribAno1;
		}
		
		int i = 1, tamanhoComboboxPeriodo = comboboxUtils.getComboboxSize(combobox) - 1;
		cmpKg.sendKeys(convertUtils.convertInttoString(tamanhoComboboxPeriodo));
		
		while(i <= tamanhoComboboxPeriodo){
			
			comboboxUtils.selecionarOpcaoComboBoxByPosition(combobox, 1);
			cmpValor.sendKeys("100");
			btnDistribuir.click();
			i++;
			
		}		
		
	}
	
	public void preencherColunaProjecaoContrato() {
		
		int i = 0, numeroBtnsEdicao = btnsEditarProjecao.size();
		scrollUtils.scrollPosicao(-300);
		
		while(i < numeroBtnsEdicao){
			
//			if(i==0) {
//				
//			}
			
			btnsEditarProjecao.get(i).click();
			if(!chkBtnContratoProjecao.isSelected()) {
				chkBtnContratoProjecao.click();
			}
			
			cmpKgProjecao.sendKeys("100");
			btnDistribProjecao.click();
			i++;
			
		}		
		
	}
	
	
	public void clicarBotaoSalvar() {
		
		btnSalvar.click();
		espera.verificarLoadDesaparecer(20);
		
	}
	

}
