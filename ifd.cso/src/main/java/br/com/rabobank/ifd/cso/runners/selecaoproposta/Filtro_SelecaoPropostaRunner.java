package br.com.rabobank.ifd.cso.runners.selecaoproposta;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import br.com.rabobank.ifd.cso.managers.FileReaderManager;
import br.com.rabobank.ifd.cso.runners.RunnerSetup;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/"}, 
				 glue = {"br.com.rabobank.ifd.cso.steps.hooks", "br.com.rabobank.ifd.cso.steps.selecaoproposta" }, 
				 tags = {"@FiltroProposta_SelecaoProposta"}, 
				 plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"})

public class Filtro_SelecaoPropostaRunner extends RunnerSetup {
	
	public Filtro_SelecaoPropostaRunner() {
		super(br.com.rabobank.ifd.cso.runners.selecaoproposta.Filtro_SelecaoPropostaRunner.class);
	}

	@BeforeClass
	public static void setUp() {
		new Filtro_SelecaoPropostaRunner();
	}

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}

}
