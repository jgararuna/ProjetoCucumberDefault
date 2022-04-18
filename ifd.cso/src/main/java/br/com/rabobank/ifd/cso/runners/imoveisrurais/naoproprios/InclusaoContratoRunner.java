package br.com.rabobank.ifd.cso.runners.imoveisrurais.naoproprios;

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
				 glue = {"br.com.rabobank.ifd.cso.steps.hooks", "br.com.rabobank.ifd.cso.steps.imoveisrurais"},
				 //tags = {"@Inclusao_ImoveisNaoProprios_SemPreencherColunas"},
				 tags = {"@Inclusao_ImoveisNaoProprios_Contrato"},
                 plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"})
public class InclusaoContratoRunner extends RunnerSetup{

	public InclusaoContratoRunner(Class<?> clazz) {
		super(clazz);
		// TODO Auto-generated constructor stub
	}
	
	@BeforeClass
	public static void setup() {
		new InclusaoContratoRunner(br.com.rabobank.ifd.cso.runners.imoveisrurais.naoproprios.InclusaoContratoRunner.class);
	}
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}

}
