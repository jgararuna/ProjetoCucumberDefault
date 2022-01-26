package br.com.rabobank.ifd.cso.utils;


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.vimalselvam.cucumber.listener.ExtentCucumberFormatter;
import com.vimalselvam.cucumber.listener.ExtentProperties;
import com.vimalselvam.cucumber.listener.Reporter;

import br.com.rabobank.ifd.cso.managers.FileReaderManager;

//import com.cucumber.listener.Reporter;

public class ScreenshotUtils {

	private TestContextUtils testContext;

	public ScreenshotUtils(TestContextUtils context) {
		testContext = context;
	}

	public String getScreenshot(String screenshotName) {
		
		FolderUtils folderUtils = new FolderUtils();
		File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().createDriver())
				.getScreenshotAs(OutputType.FILE);
		
		 String user = System.getProperty("user.dir");
		 String mostRecentFolderPath = folderUtils.mostRecentFolder(user + "\\target\\cucumber-reports");
		 //Path path = Paths.get(user + "\\AdvantageShopping\\target\\cucumber-reports\\output\\screenshots");
		 
		 Path path = Paths.get(mostRecentFolderPath +"\\screenshots");

		    try {
				Files.createDirectories(path);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
//		String caminhoDoArquivo = user + "/target/cucumber-reports/output/screenshots/"
//				+ screenshotName + ".png";
		
		String caminhoDoArquivo = mostRecentFolderPath + "/screenshots/"
				+ screenshotName + ".png";

		File destino = new File(caminhoDoArquivo);

		try {
			FileUtils.copyFile(sourcePath, destino);
			//Reporter.addScreenCaptureFromPath(caminhoDoArquivo.toString());
			//com.vimalselvam.cucumber.listener.Reporter.addScreenCaptureFromPath(caminhoDoArquivo.toString());
			Reporter.addScreenCaptureFromPath(destino.toString());
		} catch (IOException e) {
			System.out.println(" O print falhou " + e.getMessage());
		} 
//		catch (NullPointerException e) {
//			String caminhoDoArquivoReport = mostRecentFolderPath + "/report.html";
//			File report = new File(caminhoDoArquivoReport);
//			try {
//				
//				ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(caminhoDoArquivoReport);
//				ExtentReports extent = new ExtentReports();
//				extent.attachReporter(htmlReporter);
////				report.createNewFile();
////				ExtentReports er = new ExtentReporter
////				er.start();
////				ExtentProperties extentProperties = ExtentProperties.INSTANCE;
////				System.out.println("ola " + extentProperties.getReportPath());
////				extentProperties.setReportPath("target/cucumber-reports/" + mostRecentFolderPath + "/report.html");
////				System.out.println("ola3" + report.toString());
//				Reporter.addScreenCaptureFromPath(caminhoDoArquivoReport);
//			} catch (IOException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//			//System.out.println(e.getMessage());
//		}

		return caminhoDoArquivo;
	}
}
