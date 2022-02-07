package br.com.rabobank.ifd.cso.runners.bens.moveis;

import java.io.File;
import java.io.UnsupportedEncodingException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import br.com.rabobank.ifd.cso.managers.FileReaderManager;
import br.com.rabobank.ifd.cso.runners.RunnerModel;
import br.com.rabobank.ifd.cso.runners.RunnerSetup;
import br.com.rabobank.ifd.cso.steps.comuns.TelaLoginStep;
import br.com.rabobank.ifd.cso.steps.hooks.Hooks;
import br.com.rabobank.ifd.cso.utils.FolderUtils;
import br.com.rabobank.ifd.cso.utils.TestContextUtils;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/"},
				 glue = {"br.com.rabobank.ifd.cso.steps.hooks", "br.com.rabobank.ifd.cso.steps.bens"},
				 tags = {"@Exclusao_BemMovel"},
                 plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"})
public class ExclusaoRunner extends RunnerSetup{
//public class ExlusaoRunner extends Hooks{
	//plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"})
	//glue = "br.com.rabobank.ifd.cso.steps.TelaBensMoveisStep",
	//glue = {"br.com.rabobank.ifd.cso.steps.hooks", "br.com.rabobank.ifd.cso.steps.bens"},
	///Bens/Moveis/Excluir_BemMovel.feature
	//src/test/resources/features/Bens/Moveis/Excluir_BemMovel.feature
	//"br.com.rabobank.ifd.cso.steps.hooks"
	
	//ExclusaoRunner ex = new ExclusaoRunner();

//	public ExclusaoRunner () {
//		super(br.com.rabobank.ifd.cso.runners.bens.moveis.ExclusaoRunner.class);
//	}
	
	public ExclusaoRunner(Class<?> clazz) {
		super(clazz);
		// TODO Auto-generated constructor stub
	}
	
	
	@BeforeClass
	public static void setUp() {		
		new ExclusaoRunner(br.com.rabobank.ifd.cso.runners.bens.moveis.ExclusaoRunner.class);
	}
	


	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}

}
