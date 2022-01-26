package br.com.rabobank.ifd.cso.steps.hooks;

import java.io.UnsupportedEncodingException;

import org.junit.BeforeClass;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import br.com.rabobank.ifd.cso.dataProviders.ConfigFileReader;
import br.com.rabobank.ifd.cso.steps.comuns.TelaLoginStep;
import br.com.rabobank.ifd.cso.utils.FolderUtils;
import br.com.rabobank.ifd.cso.utils.ScreenshotUtils;
import br.com.rabobank.ifd.cso.utils.TestContextUtils;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
//@CucumberOptions(plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"})
public class Hooks {

	private TestContextUtils ttestContext;
	private ConfigFileReader configLeitorDeArquivos;
	private ScreenshotUtils screenshot;
	//private TelaLoginStep telaLoginStep;

	public Hooks(TestContextUtils context) {
		System.out.println("antes do teste1");
		ttestContext = context;
		configLeitorDeArquivos = new ConfigFileReader();
		screenshot = new ScreenshotUtils(context);
		//telaLoginStep = new TelaLoginStep(context);
	}	

	@Before(order=0)
	public void BeforeSteps() {
		ttestContext.getWebDriverManager().startBrowser();
		ttestContext.getWebDriverManager().getUrl(configLeitorDeArquivos.getUrl());
		System.out.println("antes do teste");
		
	}
	
//	@Before(order=1)
//	public void beforeScenario() {
//		try {
//			telaLoginStep.que_estou_no_site_do_IFD();
//			telaLoginStep.eu_informo_meus_dados_de_usuario();
//			telaLoginStep.clico_em_entrar();
//			System.out.println("screen");
//			telaLoginStep.as_funcionalidades_do_sistema_ficam_disponíveis();
//		} catch (Throwable e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}

	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			screenshot.getScreenshot(screenshotName + " - Falhou");
		}
	}

	@After(order = 0)
	public void AfterSteps() {
		ttestContext.getWebDriverManager().quitDriver();
	}
	
}
