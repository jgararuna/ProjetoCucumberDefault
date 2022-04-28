package br.com.rabobank.ifd.cso.object;

import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.pages.TelaSelecaoPropostaPage;
import br.com.rabobank.ifd.cso.utils.ListWebElementUtils;
import br.com.rabobank.ifd.cso.utils.ScrollUtils;
import br.com.rabobank.ifd.cso.utils.TempoEsperaUtils;

public class TelaSelecaoPropostaObject extends TelaSelecaoPropostaPage {
	
	private TempoEsperaUtils espera = new TempoEsperaUtils(driver);
	private ListWebElementUtils listWebElementUtils = new ListWebElementUtils();
	private ScrollUtils scroll = new ScrollUtils(driver);
	int numItensAntes = 0;

	public TelaSelecaoPropostaObject(WebDriver driver) {
		super(driver);
	}
	
	public void selecionarTipoPesquisaProposta() {
		espera.verificarElementoClicavel(10, cmpPesquisa);
		cmpPesquisa.click();
		cmpPesquisa.sendKeys("Proposta");
		cmpPesquisa.click();
	}
	
	public void digitarFiltroProposta() {
		espera.verificarElementoClicavel(10, cmpFiltro);
		cmpFiltro.click();
		cmpFiltro.sendKeys("13456");
	}
	
	public void clicarBotaoBuscar() {
		espera.verificarElementoClicavel(10, btnBuscar);
		btnBuscar.click();
		espera.verificarLoadDesaparecer(70);
	}
	
	public void selecionarTipoPesquisaStatus() {
		espera.verificarElementoClicavel(10, cmpPesquisa);
		cmpPesquisa.click();
		cmpPesquisa.sendKeys("Status");
		cmpPesquisa.click();
	}
	
	public void digitarFiltroStatus() {
		espera.verificarElementoClicavel(10, cmpFiltro);
		cmpFiltro.click();
		cmpFiltro.sendKeys("Concl");
	}
	
	public void selecionarTipoPesquisaProdutor() {
		espera.verificarElementoClicavel(10, cmpPesquisa);
		cmpPesquisa.click();
		cmpPesquisa.sendKeys("Produtor");
		cmpPesquisa.click();
	}
	
	public void digitarFiltroProdutor() {
		espera.verificarElementoClicavel(10, cmpFiltro);
		cmpFiltro.click();
		cmpFiltro.sendKeys("NMPRT 256");
	}
	
	public void selecionarTipoPesquisaRegional() {
		espera.verificarElementoClicavel(10, cmpPesquisa);
		cmpPesquisa.click();
		cmpPesquisa.sendKeys("Regional");
		cmpPesquisa.click();
	}
	
	public void digitarFiltroRegional() {
		espera.verificarElementoClicavel(10, cmpFiltro);
		cmpFiltro.click();
		cmpFiltro.sendKeys("Oeste");
	}
	
	public void selecionarTipoPesquisaAgencia() {
		espera.verificarElementoClicavel(10, cmpPesquisa);
		cmpPesquisa.click();
		cmpPesquisa.sendKeys("Agência");
		cmpPesquisa.click();
	}

	public void digitarFiltroAgencia() {
		espera.verificarElementoClicavel(10, cmpFiltro);
		cmpFiltro.click();
		cmpFiltro.sendKeys("VARGINHA");
	}

	public void selecionarTipoPesquisaGerenteDeContas() {
		espera.verificarElementoClicavel(10, cmpPesquisa);
		cmpPesquisa.click();
		cmpPesquisa.sendKeys("Gerente de Contas");
		cmpPesquisa.click();
	}
	
	public void digitarFiltroGerenteContas() {
		espera.verificarElementoClicavel(10, cmpFiltro);
		cmpFiltro.click();
		cmpFiltro.sendKeys("NMCPL 1003072");
		cmpFiltro.click();
	}
	
	public boolean verificarFiltro() {
		//String InformacaoProposta = "NMPRT";
		
		if(lblLista != null) {
			System.out.println("Apareceu alguma informação da seleção de proposta");		
		}
		return true;
	}
	

}
