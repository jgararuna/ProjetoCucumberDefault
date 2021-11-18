package br.com.rabobank.ifd.cso.steps;

import br.com.rabobank.ifd.cso.dataProviders.ConfigFileReader;
import br.com.rabobank.ifd.cso.utils.ScreenshotUtils;
import br.com.rabobank.ifd.cso.utils.TestContextUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	private TestContextUtils testContext;
	private ConfigFileReader configLeitorDeArquivos;
	private ScreenshotUtils screenshot;

	public Hooks(TestContextUtils context) {
		testContext = context;
		configLeitorDeArquivos = new ConfigFileReader();
		screenshot = new ScreenshotUtils(context);
	}

	@Before
	public void BeforeSteps() {
		testContext.getWebDriverManager().startBrowser();
		testContext.getWebDriverManager().getUrl(configLeitorDeArquivos.getUrl());

	}

//	@Before
//	public void beforeScenario(Scenario scenario) {
//		if (scenario.getName().equals("Some scenario name")) {
//			Reporter.assignAuthor("IFD - Angra");
//		}
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
		testContext.getWebDriverManager().quitDriver();
	}
}
