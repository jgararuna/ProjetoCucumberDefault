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
				 tags = {"@Alteracao_ImoveisNaoProprios"},
                 plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"})
public class AlterarImovelNaoProprio extends RunnerSetup{

	public AlterarImovelNaoProprio(Class<?> clazz) {
		super(clazz);
		// TODO Auto-generated constructor stub
	}
	
	@BeforeClass
	public static void setup() {
		new AlterarImovelNaoProprio(br.com.rabobank.ifd.cso.runners.imoveisrurais.naoproprios.AlterarImovelNaoProprio.class);
	}
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}

}
