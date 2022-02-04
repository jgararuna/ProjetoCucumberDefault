package br.com.rabobank.ifd.cso.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ComboboxUtils {
	
	private WebDriver driver;
	
	public ComboboxUtils(WebDriver driver) {
		this.driver = driver;
	}

	public void selecionarOpcaoComboBoxByText(WebElement combobox, String opcao) {
			
		Select select = new Select(combobox);
		select.selectByVisibleText(opcao);
		
	}
	
	public void selecionarOpcaoComboBoxByPosition(WebElement combobox, int position) {
		
		Select select = new Select(combobox);
		select.selectByIndex(position);
		
	}
	
	public int getComboboxSize(WebElement combobox) {
		
		Select select = new Select(combobox);
		return select.getOptions().size();
		
	}

}
