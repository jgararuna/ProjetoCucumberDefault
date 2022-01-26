package br.com.rabobank.ifd.cso.steps.comuns;

import org.openqa.selenium.WebDriver;

import com.vimalselvam.cucumber.listener.Reporter;

import br.com.rabobank.ifd.cso.object.TelaBensMoveisObject;
import br.com.rabobank.ifd.cso.object.TelaLoginObject;
import br.com.rabobank.ifd.cso.utils.ScreenshotUtils;
import br.com.rabobank.ifd.cso.utils.TestContextUtils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class TelaLoginStep {
	
	WebDriver driver;
	private TestContextUtils testContext;
	private TelaLoginObject telaLoginObject;
	private ScreenshotUtils screenshot;
	
	public TelaLoginStep(TestContextUtils context) {
		
		telaLoginObject = new TelaLoginObject(driver);
		testContext = context;
		telaLoginObject = testContext.getPageObjectManager().getTelaLoginObject();
		screenshot = new ScreenshotUtils(context);
		
	}
	
	
	@Dado("^que estou no site do IFD carregado$")
	public void que_estou_no_site_do_IFD() throws Throwable {
	    telaLoginObject.verificarSiteCarreado();
	}

	@Quando("^eu informo meus dados de usuario$")
	public void eu_informo_meus_dados_de_usuario() throws Throwable {
	    telaLoginObject.informarDados();
	}

	@E("^clico em entrar$")
	public void clico_em_entrar() throws Throwable {
	    telaLoginObject.acionarEntrar();
	}

	@Entao("^as funcionalidades do sistema ficam disponíveis$")
	public void as_funcionalidades_do_sistema_ficam_disponíveis() throws Throwable {
	    telaLoginObject.verificarSucessoLogin();
	    screenshot.getScreenshot("Login_Confirmado");
	}
	
	public void logar(){
		
		try {
			que_estou_no_site_do_IFD();
			eu_informo_meus_dados_de_usuario();
			clico_em_entrar();
			as_funcionalidades_do_sistema_ficam_disponíveis();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
