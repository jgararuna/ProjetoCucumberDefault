package br.com.rabobank.ifd.cso.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollUtils {
	
	private WebDriver driver;

	public ScrollUtils (WebDriver driver) {
		this.driver = driver;
	}

	public Object executeJs(String cmd, Object...param) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js.executeScript(cmd, param);
	}
	
	// scroll to element
	public void scrollElement(WebElement element) {
		executeJs("arguments[0].scrollIntoView(true)", element);
	}
	
	
	// scroll to position
	public void scrollPosicao(int scroll) {
		executeJs("window.scrollBy(0," + scroll + ")", "");
	}
}
