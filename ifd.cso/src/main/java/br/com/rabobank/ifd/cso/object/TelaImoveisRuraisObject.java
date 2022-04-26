package br.com.rabobank.ifd.cso.object;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

import org.apache.bcel.generic.CALOAD;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.rabobank.ifd.cso.pages.TelaImoveisRuraisPage;
import br.com.rabobank.ifd.cso.utils.CheckboxUtils;
import br.com.rabobank.ifd.cso.utils.ComboboxUtils;
import br.com.rabobank.ifd.cso.utils.ConvertUtils;
import br.com.rabobank.ifd.cso.utils.ListWebElementUtils;
import br.com.rabobank.ifd.cso.utils.RandomUtils;
import br.com.rabobank.ifd.cso.utils.ScrollUtils;
import br.com.rabobank.ifd.cso.utils.SendKeys;
import br.com.rabobank.ifd.cso.utils.TempoEsperaUtils;
import br.com.rabobank.ifd.cso.utils.WebElementDataUtils;

public class TelaImoveisRuraisObject extends TelaImoveisRuraisPage{
	
	private ScrollUtils scroll = new ScrollUtils(driver);
	private TempoEsperaUtils espera = new TempoEsperaUtils(driver);
	private ComboboxUtils comboboxUtils = new ComboboxUtils(driver);
	//private ConvertUtils convertUtils = new ConvertUtils();
	private CheckboxUtils checkboxUtils = new CheckboxUtils();
	//private ScrollUtils scrollUtils = new ScrollUtils(driver);
	private WebElementDataUtils webElementDataUtils = new WebElementDataUtils();
	private RandomUtils randomUtils = new RandomUtils();
	private ListWebElementUtils listWebElementUtils = new ListWebElementUtils();
	private SendKeys sendKeys = new SendKeys();
	int numItensAntes = 0;
	
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

//	public void clicarAbaImoveisRurais() throws InterruptedException {
//		//espera.sleep(4000);
//		espera.verificarElementoClicavel(10, btnAbaImoveisRurais);
//		espera.verificarLoadDesaparecer(30);
//		btnAbaImoveisRurais.click();
//	}
//
	public void clicarNaoProprios() throws InterruptedException {
		espera.verificarElementoClicavel(15, btnNaoProprios);
		espera.verificarLoadDesaparecer(15);
		btnNaoProprios.click();
		espera.verificarLoadDesaparecer(15);
	}
//	
//	public void clicarProprios() throws InterruptedException {
//		//scroll.scrollPosicao(250);
//		espera.verificarLoadDesaparecer(10);
//		btnProprios.click();
//		//espera.sleep(2000);
//	}
//
//	public void clicarIconeLixeira() throws InterruptedException {
//		scroll.scrollPosicao(200);
//		//espera.sleep(4000);
//		espera.verificarElementoExiste(10, btnIconeLixeira);
//		btnIconeLixeira.click();
//		espera.sleep(4000);
//
//	}
//
//	public void clicarDeletar() throws InterruptedException {
//		//espera.sleep(2000);
//		espera.verificarElementoExiste(10, btnDeletar);
//		btnDeletar.click();
//		//espera.sleep(6000);
//	}
//
//	public void clicarCancelar() throws InterruptedException {
//		espera.verificarElementoExiste(10, btnCancelar);
//		btnCancelar.click();
//		//espera.sleep(2000);
//	}
//
//	public void fecharJanelaDeletar() throws InterruptedException {
//		espera.verificarElementoExiste(10, btnFecharDeletar);
//		btnFecharDeletar.click();
//		//espera.sleep(4000);
//	}

//	public void clicarFiltro() {
//		espera.verificarElementoExiste(10, cmpFiltro);
//		cmpFiltro.click();
//	}
//
//	public void selecionarDenominacao() {
//		espera.verificarElementoExiste(10, lblDenominacao);
//		lblDenominacao.click();
//		scroll.scrollPosicao(100);		
//	}
//
//	public void selecionarCidade() {
//		espera.verificarElementoExiste(10, lblCidade);
//		lblCidade.click();
//		scroll.scrollPosicao(100);		
//	}
//
//	public void selecionarUF() {
//		espera.verificarElementoExiste(10, lblUF);
//		lblUF.click();
//		scroll.scrollPosicao(100);		
//	}
//
//	public void selecionarComarca() {
//		espera.verificarElementoExiste(10, lblComarca);
//		lblComarca.click();
//		scroll.scrollPosicao(100);		
//	}

//	public void preencherPesquisa(String pesquisa) throws InterruptedException {
//		espera.verificarElementoExiste(10, cmpPesquisar);
//		espera.verificarLoadDesaparecer(10);
//		cmpPesquisar.click();
//		cmpPesquisar.sendKeys(pesquisa);
//		//espera.sleep(2000);
//	}
//	
//	public void clicarLupa() throws InterruptedException {
//		//espera.sleep(2000);
//		scroll.scrollPosicao(100);		
//		btnLupa.click();
//		//espera.sleep(6000);
//	}
	
	/*
	 * Métodos de pesquisa 
	 */
	
	public boolean pesquisarProposta(String nomeProposta) {
		
		boolean verificador = false;
		numItensAntes = Integer.valueOf(btnNaoProprios.getText().replaceAll("\\D+",""));
		comboboxUtils.selecionarOpcaoComboBoxByText(cmbFiltro, "Denominação");
		cmpPesquisar.sendKeys(nomeProposta);
		btnLupa.click();
		espera.verificarLoadDesaparecer(30);
		if(listWebElementUtils.listChildOfWebElement(listNaoProprios) > 0) {
			verificador = true;
		}
		
		return verificador;
		
	}
	
	public void clicarAlterar() {
		
		btnEditarPrimeiraProposta.click();
		espera.verificarLoadDesaparecer(30);
		
	}
	
	
	
	/*
	 * Métodos de inclusão 
	 */
	
	public void clicarAddImovelNaoProprio() {
		
		numItensAntes = Integer.valueOf(btnNaoProprios.getText().replaceAll("\\D+",""));
		espera.verificarElementoClicavel(10, btnIncluirNaoProprio);
		espera.verificarLoadDesaparecer(15);
		btnIncluirNaoProprio.click();
		espera.verificarLoadDesaparecer(15);
		//alteracao
//		espera.verificarLoadAparecer(15);
//		espera.verificarLoadDesaparecer(30);
	}
	
	public void preencherCamposObrigatorios() {

		espera.verificarElementosExistem(20, btnsEditarProjecao);
		cmpMatricula.sendKeys(randomUtils.generateStringOfLongRandomNumber(10));
		addMatricula.click();
		//cmpNomeImovel.sendKeys("Nome Imovel Nao Proprio");
		cmpNomeImovel.sendKeys("Teste Alteração(Não excluir)");
		//cmpAreaUtil.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(webElementDataUtils.getMaxlengthElement(cmpAreaUtil)));
		cmpAreaUtil.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(6));
		//cmpAreaUtil.sendKeys("938657,65");
		//cmpAreaUtil.sendKeys("93,65");
		comboboxUtils.selecionarOpcaoComboBoxByText(cbxUf, "MG");
		espera.verificarLoadDesaparecer(10);
		comboboxUtils.selecionarOpcaoComboBoxByText(cbxCidade, "Além Paraíba");
		cmpVencimento.sendKeys("31122023");
		
	}
	
	public void marcarColunasAtualAnoUmValorFixo() {
		
		checkboxUtils.marcarCheckbox(chkBtnValorFixoAtual);
		checkboxUtils.marcarCheckbox(chkBtnValorFixoAno1);
		
	}
	
	public void preencherColunaAtualAnoUmValorFixo(String nomeColuna) {

		WebElement combobox, cmpCusto,cmpValor, btnDistribuir, cmpValorTotal;
		
		if(nomeColuna == "Atual") {
			combobox = cbxPeriodoAtual;
			cmpCusto = cmpCustoAtual;
			cmpValor = cmpValorAtual;
			btnDistribuir = btnDistribAtual;
			cmpValorTotal = cmpValorTotalAtual;
		}
		
		else {
			combobox = cbxPeriodoAno1;
			cmpCusto = cmpCustoAno1;
			cmpValor = cmpValorAno1;
			btnDistribuir = btnDistribAno1;
			cmpValorTotal = cmpValorTotalAno1;
		}
		
		int i = 1, tamanhoComboboxPeriodo = comboboxUtils.getComboboxSize(combobox) - 1;
		//cmpCusto.sendKeys(convertUtils.convertInttoString(tamanhoComboboxPeriodo));
		cmpCusto.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(6));		
		//cmpCusto.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(webElementDataUtils.getMaxlengthElement(cmpCusto)));
		cmpValorTotal.click();
		
		double valorTotalDouble;
		BigDecimal valorTotal;
		String valorTotalString;

		//valorTotalString = "15.26";
		valorTotalString = cmpValorTotal.getAttribute("value").replace("R$ ","").replace(".", "").replace(",", ".");
		//System.out.println(valorTotalString);
		valorTotalDouble = Double.valueOf(valorTotalString);
		valorTotal = BigDecimal.valueOf(valorTotalDouble);
		//BigDecimal num = new BigDecimal(valorTotal).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		System.out.println("total " + valorTotal);
		//System.out.println("aqui1 " + num);
		
//		double valor = 0.00;
//		valor = Double.valueOf(valorTotal/tamanhoComboboxPeriodo).doubleValue();
//		BigDecimal valorDecimal = new BigDecimal(valor);
		//BigDecimal valorDecimal = new BigDecimal(num.doubleValue()/tamanhoComboboxPeriodo).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		
		//BigDecimal valorDecimal = new BigDecimal((valorTotal)/tamanhoComboboxPeriodo).setScale(2, BigDecimal.ROUND_DOWN);
		BigDecimal valorDecimal = valorTotal.divide(BigDecimal.valueOf(tamanhoComboboxPeriodo), 2, RoundingMode.DOWN).setScale(2, BigDecimal.ROUND_DOWN);
		//BigDecimal valorDecimal = new BigDecimal((valorTotal)/tamanhoComboboxPeriodo);
		System.out.println("totalDec " + valorDecimal);	
		//BigDecimal valorTotalParcial = new BigDecimal(Double.valueOf(valorDecimal.toString()) * (tamanhoComboboxPeriodo - 1)).setScale(2, BigDecimal.ROUND_DOWN);
		BigDecimal valorTotalParcial = valorDecimal.multiply(BigDecimal.valueOf(tamanhoComboboxPeriodo - 1)).setScale(2, BigDecimal.ROUND_DOWN);
		//BigDecimal valorTotalParcial = new BigDecimal(Double.valueOf(valorDecimal.toString()) * (tamanhoComboboxPeriodo - 1));
		System.out.println("totalparc" + valorTotalParcial);
		
//		System.out.println("parc" + valorTotal);
//		System.out.println("parc" + Double.valueOf(valorTotalParcial.toString()));
		//BigDecimal valorDecimalUlt = new BigDecimal(valorTotal - Double.valueOf(valorTotalParcial.toString())).setScale(2, BigDecimal.ROUND_UP);
		//BigDecimal valorDecimalUlt = new BigDecimal(valorTotal - Double.valueOf(valorTotalParcial.toString()));
		BigDecimal valorDecimalUlt = valorTotal.subtract(valorTotalParcial);
//		double tot = valorTotal - valorTotalParcial.doubleValue();
		System.out.println(valorDecimalUlt);
		
		while(i <= tamanhoComboboxPeriodo){
			
//			comboboxUtils.selecionarOpcaoComboBoxByPosition(combobox, 1);
//			cmpValor.sendKeys(String.valueOf(valorDecimal).replace(".", ","));
//			btnDistribuir.click();
//			i++;
			if(i < tamanhoComboboxPeriodo) {
				comboboxUtils.selecionarOpcaoComboBoxByPosition(combobox, 1);
				cmpValor.sendKeys(String.valueOf(valorDecimal).replace(".", ","));
				//cmpValor.sendKeys(valorDecimalUltString);
				btnDistribuir.click();
			}
			else {
				comboboxUtils.selecionarOpcaoComboBoxByPosition(combobox, 1);
				cmpValor.sendKeys(String.valueOf(valorDecimalUlt).replace(".", ","));
				//cmpValor.sendKeys(valorDecimalUltString);
				btnDistribuir.click();	
			}
			i++;
			
		}
		
//		if(nomeColuna == "Ano 1") {
//			combobox = cbxPeriodoAtual;
//			cmpCusto = cmpCustoAtual;
//			cmpValor = cmpValorAtual;
//			btnDistribuir = btnDistribAtual;
//			cmpValorTotal = cmpValorTotalAtual;
//		}
//		int i = 1, tamanhoComboboxPeriodo = comboboxUtils.getComboboxSize(combobox) - 1;
//		cmpCusto.sendKeys(convertUtils.convertInttoString(tamanhoComboboxPeriodo));
//		//cmpCusto.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(webElementDataUtils.getMaxlengthElement(cmpCusto)));
//		cmpValorTotal.click();
//		
//		NumberFormat nf = new DecimalFormat("#.00");
//		
//		double valorTotal = 0.00;
//		try {
//			valorTotal = nf.parse (cmpValorTotal.getAttribute("value").replace("R$ ","").replace(".", "").replace(",", ".")).doubleValue();
//			valorTotal = nf.parse (new BigDecimal(valorTotal).toPlainString()).doubleValue();
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//System.out.println("aqui1 " + valorTotal);
//		
//		double valor = 0.00;
//		try {
//			valor = nf.parse (String.valueOf(valorTotal/tamanhoComboboxPeriodo)).doubleValue();
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		//System.out.println("aqui2 " + valor);
//		
//		while(i <= tamanhoComboboxPeriodo){
//			
//			comboboxUtils.selecionarOpcaoComboBoxByPosition(combobox, 1);
//			cmpValor.sendKeys(String.valueOf(valor).replace(".", ","));
//			btnDistribuir.click();
//			i++;
//			
//		}		
		
	}
	
	public void preencherColunaProjecaoValorFixo() {
		
		int i = 0, numeroBtnsEdicao = btnsEditarProjecao.size();

		while(i < numeroBtnsEdicao){
			
			btnsEditarProjecao.get(i).click();
			cmpCustoProjecao.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(6));
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
		espera.verificarLoadDesaparecer(305);
		
	}
	
	public void preencherColunaAtualAnoUmContrato(String nomeColuna) {
		
		WebElement combobox, cmpKg,cmpValor, btnDistribuir, cmpValorTotal;
		
		if(nomeColuna == "Atual") {
			combobox = cbxPeriodoAtual;
			cmpKg = cmpKgAtual;
			cmpValor = cmpValorAtual;
			btnDistribuir = btnDistribAtual;
			cmpValorTotal = cmpValorTotalAtual;
		}
		
		else {
			combobox = cbxPeriodoAno1;
			cmpKg = cmpKgAno1;
			cmpValor = cmpValorAno1;
			btnDistribuir = btnDistribAno1;
			cmpValorTotal = cmpValorTotalAno1;
		}
		
		int i = 1, tamanhoComboboxPeriodo = comboboxUtils.getComboboxSize(combobox) - 1;
		cmpKg.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(6));
		cmpValorTotal.click();
		
		double valorTotalDouble;
		BigDecimal valorTotal;
		String valorTotalString;

		//valorTotalString = "15.26";
		valorTotalString = cmpValorTotal.getAttribute("value").replace("R$ ","").replace(".", "").replace(",", ".");
		//System.out.println(valorTotalString);
		valorTotalDouble = Double.valueOf(valorTotalString);
		valorTotal = BigDecimal.valueOf(valorTotalDouble);
		//BigDecimal num = new BigDecimal(valorTotal).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		System.out.println("total " + valorTotal);
		//System.out.println("aqui1 " + num);
		
//		double valor = 0.00;
//		valor = Double.valueOf(valorTotal/tamanhoComboboxPeriodo).doubleValue();
//		BigDecimal valorDecimal = new BigDecimal(valor);
		//BigDecimal valorDecimal = new BigDecimal(num.doubleValue()/tamanhoComboboxPeriodo).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		
		//BigDecimal valorDecimal = new BigDecimal((valorTotal)/tamanhoComboboxPeriodo).setScale(2, BigDecimal.ROUND_DOWN);
		BigDecimal valorDecimal = valorTotal.divide(BigDecimal.valueOf(tamanhoComboboxPeriodo), 2, RoundingMode.DOWN).setScale(2, BigDecimal.ROUND_DOWN);
		//BigDecimal valorDecimal = new BigDecimal((valorTotal)/tamanhoComboboxPeriodo);
		System.out.println("totalDec " + valorDecimal);	
		//BigDecimal valorTotalParcial = new BigDecimal(Double.valueOf(valorDecimal.toString()) * (tamanhoComboboxPeriodo - 1)).setScale(2, BigDecimal.ROUND_DOWN);
		BigDecimal valorTotalParcial = valorDecimal.multiply(BigDecimal.valueOf(tamanhoComboboxPeriodo - 1)).setScale(2, BigDecimal.ROUND_DOWN);
		//BigDecimal valorTotalParcial = new BigDecimal(Double.valueOf(valorDecimal.toString()) * (tamanhoComboboxPeriodo - 1));
		System.out.println("totalparc" + valorTotalParcial);
		
//		System.out.println("parc" + valorTotal);
//		System.out.println("parc" + Double.valueOf(valorTotalParcial.toString()));
		//BigDecimal valorDecimalUlt = new BigDecimal(valorTotal - Double.valueOf(valorTotalParcial.toString())).setScale(2, BigDecimal.ROUND_UP);
		//BigDecimal valorDecimalUlt = new BigDecimal(valorTotal - Double.valueOf(valorTotalParcial.toString()));
		BigDecimal valorDecimalUlt = valorTotal.subtract(valorTotalParcial);
//		double tot = valorTotal - valorTotalParcial.doubleValue();
		System.out.println(valorDecimalUlt);
		
		while(i <= tamanhoComboboxPeriodo){
			
			if(i < tamanhoComboboxPeriodo) {
				comboboxUtils.selecionarOpcaoComboBoxByPosition(combobox, 1);
				cmpValor.sendKeys(String.valueOf(valorDecimal).replace(".", ","));
				btnDistribuir.click();
			}
			else {
				comboboxUtils.selecionarOpcaoComboBoxByPosition(combobox, 1);
				cmpValor.sendKeys(String.valueOf(valorDecimalUlt).replace(".", ","));
				btnDistribuir.click();	
			}
			i++;
			
		}	
		
	}
	
	public void preencherColunaProjecaoContrato() {
		
		int i = 0, numeroBtnsEdicao = btnsEditarProjecao.size();
		//scrollUtils.scrollPosicao(-300);
		
		while(i < numeroBtnsEdicao){
			
//			if(i==0) {
//				
//			}
			
			btnsEditarProjecao.get(i).click();
			if(!chkBtnContratoProjecao.isSelected()) {
				chkBtnContratoProjecao.click();
			}
			
			//cmpKgProjecao.sendKeys(randomUtils.generateStringOfLongRandomNumber(webElementDataUtils.getMaxlengthElement(cmpKgProjecao)));
			cmpKgProjecao.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(6));
			btnDistribProjecao.click();
			i++;
			
		}		
		
	}
	
	/*
	 * Este método é utilizado tanto na inclusão, quanto na alteração
	 */
	public void clicarBotaoSalvar() {
		
		btnSalvar.click();
		espera.verificarLoadDesaparecer(90);
		
	}
	
	public boolean confirmarInclusao() {
		
//		while(Integer.valueOf(btnNaoProprios.getText().replaceAll("\\D+","")) == 0) {
//			espera.waitExplicito(1);
//		}
		espera.verificarLoadAparecer(60);
		espera.verificarLoadDesaparecer(60);
		System.out.println("antes " + numItensAntes);
		scroll.scrollElement(btnNaoProprios);
		int numItensDepois = Integer.valueOf(btnNaoProprios.getText().replaceAll("\\D+",""));
		System.out.println("depois" + numItensDepois);
		boolean verify = false;
		if(numItensAntes < numItensDepois) {
			verify = true;			
		}
		return verify;
		
	}
	
	/*
	 * Métodos de alteração
	 */
	public void alterarDadosCdastrais() {
		
		espera.verificarElementosExistem(10, btnsEditarProjecao);
		excluirMatricula.click();
		cmpMatricula.sendKeys(randomUtils.generateStringOfLongRandomNumber(10));
		addMatricula.click();
		sendKeys.clearAndSendKeys(cmpNomeImovel, "Teste Alteração(Não excluir)");
		sendKeys.clearAndSendKeys(cmpAreaUtil, randomUtils.generateStringOfDecimalRandomNumber(6));
		comboboxUtils.selecionarOpcaoComboBoxByText(cbxUf, "GO");
		espera.verificarLoadDesaparecer(10);
		comboboxUtils.selecionarOpcaoComboBoxByText(cbxCidade, "Anápolis");
		sendKeys.clearAndSendKeys(cmpVencimento, "30112022");
		
	}
	
	public void excluirDistribuicoes() {

		int numDistribAtual = listDistribAtual.size() - 1;
		int numDistribAno1 = listDistribAno1.size() - 1;
		int numDistribProj = btnsExcluirProjecao.size();
		int i = 0;
		scroll.scrollElement(cbxMercadoria);
		while(i < numDistribAtual + numDistribAno1){
			btnExcluirDistrib.click();
			i++;
			System.out.println(i);
		}
		
		i = 0;
		while(i < numDistribProj) {	
			btnsExcluirProjecao.get(i).click();
			i++;
		}	
		
	}
	
	public void alterarColunaAtualAno1(String nomeColuna) {
		
		WebElement combobox, cmpKg, cmpCusto, cmpValor, btnDistribuir, cmpValorTotal, chkBtnValorFixo, chkBtnContrato;
		
		if(nomeColuna == "Atual") {
			combobox = cbxPeriodoAtual;
			cmpKg = cmpKgAtual;
			cmpCusto = cmpCustoAtual;
			cmpValor = cmpValorAtual;
			btnDistribuir = btnDistribAtual;
			cmpValorTotal = cmpValorTotalAtual;
			chkBtnValorFixo = chkBtnValorFixoAtual;
			chkBtnContrato = chkBtnContratoAtual;
		}
		
		else {
			combobox = cbxPeriodoAno1;
			cmpKg = cmpKgAno1;
			cmpCusto = cmpCustoAno1;
			cmpValor = cmpValorAno1;
			btnDistribuir = btnDistribAno1;
			cmpValorTotal = cmpValorTotalAno1;
			chkBtnValorFixo = chkBtnValorFixoAno1;
			chkBtnContrato = chkBtnContratoAno1;
		}
		
		
		if(chkBtnValorFixo.isSelected()){
			chkBtnContrato.click();
			preencherMercadoria("Boi Gordo Com Escala Pasto");
			cmpKg.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(6));
			cmpValorTotal.click();		
		}
		else{
			chkBtnValorFixo.click();
			cmpCusto.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(6));		
			cmpValorTotal.click();
		}
		
		int i = 1, tamanhoComboboxPeriodo = comboboxUtils.getComboboxSize(combobox) - 1;
		
		double valorTotalDouble;
		BigDecimal valorTotal;
		String valorTotalString;

		valorTotalString = cmpValorTotal.getAttribute("value").replace("R$ ","").replace(".", "").replace(",", ".");
		//System.out.println(valorTotalString);
		valorTotalDouble = Double.valueOf(valorTotalString);
		valorTotal = BigDecimal.valueOf(valorTotalDouble);
		System.out.println("total " + valorTotal);
		BigDecimal valorDecimal = valorTotal.divide(BigDecimal.valueOf(tamanhoComboboxPeriodo), 2, RoundingMode.DOWN).setScale(2, BigDecimal.ROUND_DOWN);
		System.out.println("totalDec " + valorDecimal);	
		BigDecimal valorTotalParcial = valorDecimal.multiply(BigDecimal.valueOf(tamanhoComboboxPeriodo - 1)).setScale(2, BigDecimal.ROUND_DOWN);
		System.out.println("totalparc" + valorTotalParcial);
		BigDecimal valorDecimalUlt = valorTotal.subtract(valorTotalParcial);
		System.out.println(valorDecimalUlt);
		
		while(i <= tamanhoComboboxPeriodo){
			
			if(i < tamanhoComboboxPeriodo) {
				comboboxUtils.selecionarOpcaoComboBoxByPosition(combobox, 1);
				cmpValor.sendKeys(String.valueOf(valorDecimal).replace(".", ","));
				btnDistribuir.click();
			}
			else {
				comboboxUtils.selecionarOpcaoComboBoxByPosition(combobox, 1);
				cmpValor.sendKeys(String.valueOf(valorDecimalUlt).replace(".", ","));
				btnDistribuir.click();	
			}
			i++;
			
		}
		
	}
	
	public void alterarColunaProjecao() {
		
		int i = 0, numeroBtnsEdicao = btnsEditarProjecao.size();
		
		while(i < numeroBtnsEdicao){
			
			btnsEditarProjecao.get(i).click();
			if(chkBtnValorFixoProjecao.isSelected()){
				chkBtnContratoProjecao.click();
				cmpKgProjecao.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(6));
				cmpValorTotalProjecao.click();
			}
			else{
				chkBtnValorFixoProjecao.click();
				cmpCustoProjecao.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(6));		
				cmpValorTotalProjecao.click();
			}
			btnDistribProjecao.click();
			i++;
			
		}		
		
	}
	
	public boolean confirmarAlteracao() {
		
		espera.verificarLoadAparecer(60);
		espera.verificarLoadDesaparecer(60);
		System.out.println(numItensAntes);
		scroll.scrollElement(btnNaoProprios);
		int numItensDepois = Integer.valueOf(btnNaoProprios.getText().replaceAll("\\D+",""));
		System.out.println(numItensDepois);
		boolean verify = false;
		if(numItensAntes == numItensDepois) {
			verify = true;			
		}
		return verify;
		
		
	}

}
