package br.com.rabobank.ifd.cso.runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import br.com.rabobank.ifd.cso.managers.FileReaderManager;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/features", 
				 glue = "br.com.rabobank.ifd.cso", 
				 tags = {"@teste" }, 
				 plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html")

public class Runner {

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}
}
