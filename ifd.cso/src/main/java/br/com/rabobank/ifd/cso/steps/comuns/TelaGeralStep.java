package br.com.rabobank.ifd.cso.steps.comuns;

import org.openqa.selenium.WebDriver;

import br.com.rabobank.ifd.cso.object.TelaGeralObject;
import br.com.rabobank.ifd.cso.utils.ScreenshotUtils;
import br.com.rabobank.ifd.cso.utils.TestContextUtils;
import cucumber.api.java.pt.Quando;

public class TelaGeralStep {
	
	WebDriver driver;
	private TestContextUtils testContext;
	private TelaGeralObject telaGeralObject;
	private ScreenshotUtils screenshot;
	
	public TelaGeralStep(TestContextUtils context) {
		
		telaGeralObject = new TelaGeralObject(driver);
		testContext = context;
		telaGeralObject = testContext.getPageObjectManager().getTelaGeralObject();
		screenshot = new ScreenshotUtils(context);
		
	}
	
	@Quando("^clico no botao de informacoes patrimoniais$")
	public void clico_no_botao_de_informacoes_patrimoniais() throws Throwable {
		telaGeralObject.clicarInformacoesPatrimoniais();
	}
	
}
