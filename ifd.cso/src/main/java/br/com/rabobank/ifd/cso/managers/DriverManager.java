package br.com.rabobank.ifd.cso.managers;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import br.com.rabobank.ifd.cso.enums.DriverType;
import br.com.rabobank.ifd.cso.utils.TestContextUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	private WebDriver webDriver;
	public TestContextUtils testContext;
	private static DriverType driverType;

	public DriverManager() {
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
	}

	public WebDriver startBrowser() {
		switch (driverType) {
		case FIREFOX:
			if (webDriver == null) {
				WebDriverManager.firefoxdriver().setup();
				webDriver = new FirefoxDriver();
			}
			break;

		case INTERNETEXPLORER:
			if (webDriver == null) {
				WebDriverManager.iedriver().setup();
				webDriver = new InternetExplorerDriver();
			}
			break;

		case CHROME:
			if (webDriver == null) {					    
				WebDriverManager.chromedriver().setup();
				webDriver = new ChromeDriver();
			}
			break;
		case EDGE:
			if (webDriver == null) {					    
				WebDriverManager.edgedriver().setup();
				webDriver = new EdgeDriver();
			}
			break;
		}

		if (FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize())
			//webDriver.manage().window().maximize();
			webDriver.manage().window().setSize(new Dimension(1903, 3665));
			webDriver.manage().timeouts().implicitlyWait(
				FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);

		return webDriver;

	}

	public WebDriver createDriver() {

		if (webDriver == null)
			webDriver = startBrowser();
		return webDriver;
	}

	public void getUrl(String url) {
		webDriver.get(url);

	}

	public void quitDriver() {
		webDriver.close();
		webDriver.quit();
	}
}
