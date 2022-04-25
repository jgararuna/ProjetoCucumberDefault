package br.com.rabobank.ifd.cso.runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import br.com.rabobank.ifd.cso.managers.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)
//@CucumberOptions(features = {"src/main/java/br/com/rabobank/ifd/cso/features/"},
//				 glue = {"br.com.rabobank.ifd.cso.steps.hooks", "br.com.rabobank.ifd.cso.steps.comuns"},
//				 tags = {"@Logar1"},
//                 plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"})
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/"},
				 glue = {"br.com.rabobank.ifd.cso.steps.hooks", "br.com.rabobank.ifd.cso.steps.comuns"},
				 tags = {"@Logar"},
                 plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"})
public class LoginRunner extends RunnerSetup{

	
	public LoginRunner() {
		super(br.com.rabobank.ifd.cso.runners.LoginRunner.class);
	}
	
	@BeforeClass
	public static void setUp() {		
		new LoginRunner();
	}
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}
}
