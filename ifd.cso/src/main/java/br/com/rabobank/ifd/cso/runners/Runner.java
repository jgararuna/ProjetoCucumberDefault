package br.com.rabobank.ifd.cso.runners;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.text.html.HTML;

import org.apache.bcel.generic.NEW;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
//import com.cucumber.listener.ExtentCucumberFormatter;
//import com.cucumber.listener.Reporter;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import br.com.rabobank.ifd.cso.managers.FileReaderManager;
import br.com.rabobank.ifd.cso.utils.CucumberUtils;
import br.com.rabobank.ifd.cso.utils.FolderUtils;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
				 glue = "br.com.rabobank.ifd.cso.steps", 
				 tags = {"@ConsultaDenominacao_ImoveisNaoProprios"},
				 plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"})
//public class Runner extends RunnerSetup{
public class Runner{
	
	//plugin = "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/reportInclusaoComSucessoADefinirInclusaoRebanhoProntoComercializacao.html")
	
	@BeforeClass
	public static void setUp() {
		
//		CucumberUtils cucumberUtils = new CucumberUtils();
//		FolderUtils folderUtils = new FolderUtils();
//		folderUtils.createReportFolder(cucumberUtils.getTagsFromAnnotations(Runner.class));
		
		FolderUtils folderUtils = new FolderUtils();
		folderUtils.createReportFolder2(Runner.class);
	
	}

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));		
	}
	
}
