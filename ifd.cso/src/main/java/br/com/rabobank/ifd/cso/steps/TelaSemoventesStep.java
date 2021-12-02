package br.com.rabobank.ifd.cso.steps;

import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.pages.TelaImoveisRuraisPage;
import br.com.rabobank.ifd.cso.pages.TelaSemoventesPage;
import br.com.rabobank.ifd.cso.utils.ScreenshotUtils;
import br.com.rabobank.ifd.cso.utils.ScrollUtils;
import br.com.rabobank.ifd.cso.utils.TestContextUtils;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TelaSemoventesStep {
	
	
	WebDriver driver;
	private TestContextUtils testContext;
	private TelaSemoventesPage telaSemoventesPage;
	private ScreenshotUtils screenshot;
	private ScrollUtils scroll;
		
	public TelaSemoventesStep(TestContextUtils context) {
	telaSemoventesPage = new TelaSemoventesPage(driver);
	testContext = context;
	telaSemoventesPage = testContext.getPageObjectManager().getTelaSemoventePage();
	screenshot = new ScreenshotUtils(context);
	scroll = new ScrollUtils(driver);
	}
	
	
	@Quando("^clico na aba de semoventes$")
	public void clico_na_aba_de_semoventes() throws Throwable {
	    
	}

	@Entao("^semovente sera deletado com sucesso$")
	public void semovente_sera_deletado_com_sucesso() throws Throwable {
	   
	}

	@Entao("^semoventes nao sera deletado$")
	public void semoventes_nao_sera_deletado() throws Throwable {
	    
	}

	@Entao("^semovente nao sera deletado$")
	public void semovente_nao_sera_deletado() throws Throwable {
	    
	}
	
	@Quando("^clico no filtro tipo$")
	public void clico_no_filtro_tipo() throws Throwable {
	  
	}

	@Entao("^semovente aparecera de acordo com a consulta$")
	public void semovente_aparecera_de_acordo_com_a_consulta() throws Throwable {
	    
	}

	@Quando("^clico no filtro rebanho$")
	public void clico_no_filtro_rebanho() throws Throwable {
	    
	}

	@Quando("^clico no \"([^\"]*)\" qualquer$")
	public void clico_no_qualquer(String arg1) throws Throwable {
	   
	}



}
