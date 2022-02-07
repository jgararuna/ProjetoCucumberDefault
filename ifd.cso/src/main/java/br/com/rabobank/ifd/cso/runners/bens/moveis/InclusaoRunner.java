package br.com.rabobank.ifd.cso.runners.bens.moveis;

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
				 glue = {"br.com.rabobank.ifd.cso.steps.hooks", "br.com.rabobank.ifd.cso.steps.bens" }, 
				 tags = {"@Inclusao_BemMovel"}, 
				 plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"})

public class InclusaoRunner extends RunnerSetup {
	// public class ExlusaoRunner extends Hooks{
	// plugin = {"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:"})
	// glue = "br.com.rabobank.ifd.cso.steps.TelaBensMoveisStep",
	// glue = {"br.com.rabobank.ifd.cso.steps.hooks",
	// "br.com.rabobank.ifd.cso.steps.bens"},
	/// Bens/Moveis/Excluir_BemMovel.feature
	// src/test/resources/features/Bens/Moveis/Excluir_BemMovel.feature
	// "br.com.rabobank.ifd.cso.steps.hooks"

	// ExclusaoRunner ex = new ExclusaoRunner();

	public InclusaoRunner() {
		super(br.com.rabobank.ifd.cso.runners.bens.moveis.InclusaoRunner.class);
	}

	@BeforeClass
	public static void setUp() {
		new InclusaoRunner();
	}

	@AfterClass
	public static void writeExtentReport() {
		Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
	}

}
