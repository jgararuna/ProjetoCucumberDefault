package br.com.rabobank.ifd.cso.runners;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.poi.ss.formula.functions.T;
import org.apache.xmlbeans.impl.common.ResolverUtil;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentReports;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import br.com.rabobank.ifd.cso.managers.FileReaderManager;
import br.com.rabobank.ifd.cso.utils.FolderUtils;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import gherkin.lexer.Ru;
import net.bytebuddy.implementation.bind.annotation.Super;



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
				 glue = {"br.com.rabobank.ifd.cso.steps.hooks", "br.com.rabobank.ifd.cso.steps"}, 
				 tags = {""},
				 plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"})
public class RunnerModel extends RunnerSetup{
	
	//public Runner2 (Class<?> runner2) {
	public RunnerModel () {
		super(br.com.rabobank.ifd.cso.runners.RunnerModel.class);

	}
	

	@BeforeClass
	public static void setUp() {
		new RunnerModel();		
	}
	
	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}

}
