package br.com.rabobank.ifd.cso.utils;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class RandomUtils {
	
	public static void main(String[] args) {
		
//		int i = 1, tamanhoComboboxPeriodo = 12;
//		//cmpCusto.sendKeys(convertUtils.convertInttoString(tamanhoComboboxPeriodo));
//		//cmpCusto.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(6));		
//		//cmpCusto.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(webElementDataUtils.getMaxlengthElement(cmpCusto)));
//		//cmpValorTotal.click();
//		
//		double valorTotal = 0.00;
//		String valorTotalString;
//
//		valorTotalString = "23,83";
//		//System.out.println(valorTotalString);
//		valorTotal = Double.valueOf(valorTotalString.replace("R$ ","").replace(".", "").replace(",", "."));
//		System.out.println("total " + valorTotal);
//		final DecimalFormat df = new DecimalFormat("0.00");
//		df.setRoundingMode(RoundingMode.DOWN);
////		double valor = 0.00;
////		valor = Double.valueOf(valorTotal/tamanhoComboboxPeriodo).doubleValue();
////		BigDecimal valorDecimal = new BigDecimal(valor);
//		//BigDecimal valorDecimal = new BigDecimal(num.doubleValue()/tamanhoComboboxPeriodo).setScale(2, BigDecimal.ROUND_HALF_EVEN);
//		//BigDecimal valorDecimal = new BigDecimal((valorTotal)/tamanhoComboboxPeriodo).setScale(2, BigDecimal.ROUND_DOWN);
//		String valorDecimalString = df.format(valorTotal/tamanhoComboboxPeriodo);
//		
//		System.out.println("totalDec " + Double.valueOf(valorDecimalString.replace("R$ ","").replace(".", "").replace(",", ".")));
//		double valorDecimal = Double.valueOf(valorDecimalString.replace("R$ ","").replace(".", "").replace(",", "."));
//		
//		double valorTotalParcial = valorDecimal * (tamanhoComboboxPeriodo - 1);
//		String valorTotalParcialString = df.format(valorTotalParcial).replace("R$ ","").replace(".", "").replace(",", ".");
//		System.out.println(valorTotalParcialString);
//		System.out.println("parcString " + valorTotalParcialString.replace(",", "."));
//		valorTotalParcial = Double.valueOf(valorTotalParcialString);
////		BigDecimal valorTotalParcial = new BigDecimal(Double.valueOf(valorDecimal.toString()) * (tamanhoComboboxPeriodo - 1)).setScale(2, BigDecimal.ROUND_DOWN);
////	
//		System.out.println("totalparc " + valorTotalParcial);
//		//BigDecimal valorDecimalUlt = new BigDecimal(valorTotal - Double.valueOf(valorTotalParcial.toString())).setScale(2, BigDecimal.ROUND_DOWN);
//		df.setRoundingMode(RoundingMode.UP);
//		String valorDecimalUltString = df.format(valorTotal - valorTotalParcial).replace(",", ".");
//		System.out.println(valorDecimalUltString);
////		double valorDecimalUlt = valorTotal - valorTotalParcial;
////		System.out.println(valorTotal + " - " + valorTotalParcial + " = " + valorDecimalUlt);
		
		
		int i = 1, tamanhoComboboxPeriodo = 12;
		//int i = 1;
		//cmpCusto.sendKeys(convertUtils.convertInttoString(tamanhoComboboxPeriodo));
		//cmpCusto.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(6));		
		//cmpCusto.sendKeys(randomUtils.generateStringOfDecimalRandomNumber(webElementDataUtils.getMaxlengthElement(cmpCusto)));
		//cmpValorTotal.click();
		
		//double valorTotalDouble;
		BigDecimal valorTotal; 
		//BigDecimal tamanhoComboboxPeriodo = new BigDecimal("12.00");
		String valorTotalString;

		valorTotalString = "15.26";
		//valorTotalString = cmpValorTotal.getAttribute("value").replace("R$ ","").replace(".", "").replace(",", ".");
		//System.out.println(valorTotalString);
		//valorTotalDouble = Double.valueOf(valorTotalString);
		valorTotal = new BigDecimal(valorTotalString);
		//valorTotal = BigDecimal.valueOf(Double.valueOf(valorTotalString));
		//BigDecimal num = new BigDecimal(valorTotal).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		System.out.println("total " + valorTotal);
		//System.out.println("aqui1 " + num);
		
//		double valor = 0.00;
//		valor = Double.valueOf(valorTotal/tamanhoComboboxPeriodo).doubleValue();
//		BigDecimal valorDecimal = new BigDecimal(valor);
		//BigDecimal valorDecimal = new BigDecimal(num.doubleValue()/tamanhoComboboxPeriodo).setScale(2, BigDecimal.ROUND_HALF_EVEN);
		BigDecimal val2 = new BigDecimal(tamanhoComboboxPeriodo);
		System.out.println(val2);
		//BigDecimal valorDecimal = new BigDecimal((valorTotal)/tamanhoComboboxPeriodo).setScale(2, BigDecimal.ROUND_DOWN);
		//BigDecimal valorDecimal = valorTotal.divide(BigDecimal.valueOf(tamanhoComboboxPeriodo), 2, RoundingMode.DOWN).setScale(2, BigDecimal.ROUND_DOWN);
		//BigDecimal valorDecimal = valorTotal.divide(BigDecimal.valueOf(tamanhoComboboxPeriodo), RoundingMode.DOWN);
		BigDecimal valorDecimal = valorTotal.divide(val2, RoundingMode.DOWN);
		System.out.println("totalDec " + valorDecimal);	
		//BigDecimal valorTotalParcial = new BigDecimal(Double.valueOf(valorDecimal.toString()) * (tamanhoComboboxPeriodo - 1)).setScale(2, BigDecimal.ROUND_DOWN);
		//BigDecimal valorTotalParcial = valorDecimal.multiply(BigDecimal.valueOf(tamanhoComboboxPeriodo - 1)).setScale(2, BigDecimal.ROUND_DOWN);
		System.out.println(val2.subtract(new BigDecimal(1.00)));
		BigDecimal valorTotalParcial = valorDecimal.multiply(val2.subtract(new BigDecimal(1.00))).setScale(2, BigDecimal.ROUND_DOWN);
		//BigDecimal valorTotalParcial = new BigDecimal(Double.valueOf(valorDecimal.toString()) * (tamanhoComboboxPeriodo - 1));
		System.out.println("totalparc " + valorTotalParcial);
		
//		//BigDecimal valorDecimal = new BigDecimal((valorTotal)/tamanhoComboboxPeriodo).setScale(2, BigDecimal.ROUND_DOWN);
//		BigDecimal valorDecimal = valorTotal.divide(tamanhoComboboxPeriodo, 2).setScale(2, BigDecimal.ROUND_DOWN);
//		//BigDecimal valorDecimal = new BigDecimal((valorTotal)/tamanhoComboboxPeriodo);
//		System.out.println("totalDec " + valorDecimal);	
//		//BigDecimal valorTotalParcial = new BigDecimal(Double.valueOf(valorDecimal.toString()) * (tamanhoComboboxPeriodo - 1)).setScale(2, BigDecimal.ROUND_DOWN);
//		BigDecimal valorTotalParcial = valorDecimal.multiply(tamanhoComboboxPeriodo.subtract(new BigDecimal("1.00"))).setScale(2, BigDecimal.ROUND_DOWN);
//		//BigDecimal valorTotalParcial = new BigDecimal(Double.valueOf(valorDecimal.toString()) * (tamanhoComboboxPeriodo - 1));
//		System.out.println("totalparc" + valorTotalParcial);
		
//		System.out.println("parc" + valorTotal);
//		System.out.println("parc" + Double.valueOf(valorTotalParcial.toString()));
		//BigDecimal valorDecimalUlt = new BigDecimal(valorTotal - Double.valueOf(valorTotalParcial.toString())).setScale(2, BigDecimal.ROUND_UP);
		//BigDecimal valorDecimalUlt = new BigDecimal(valorTotal - Double.valueOf(valorTotalParcial.toString()));
		BigDecimal valorDecimalUlt = valorTotal.subtract(valorTotalParcial);
//		double tot = valorTotal - valorTotalParcial.doubleValue();
		System.out.println(valorDecimalUlt);
		//BigDecimal valorDecimalUlt = new BigDecimal(valorTotal).subtract(valorTotalParcial.setScale(2, BigDecimal.ROUND_DOWN));
//		final DecimalFormat df = new DecimalFormat("0.00");
//		df.setRoundingMode(RoundingMode.DOWN);
//		double valorDecimal = valorTotal/tamanhoComboboxPeriodo;
//		System.out.println(valorDecimal);
////		String valorDecimalString = df.format(valorTotal/tamanhoComboboxPeriodo).replace(",", ".");
////		System.out.println(valorDecimalString);
//		
//		double valorTotalParcial = valorDecimal * (tamanhoComboboxPeriodo - 1);
//		String valorTotalParcialString = df.format(valorTotalParcial).replace(",", ".");
//		System.out.println(valorTotalParcial);
//		System.out.println(valorTotalParcialString);
//		
//		double valorDecimalUlt = valorTotal - Double.valueOf(valorTotalParcialString);
//		System.out.println(valorDecimalUlt);
		
		
//		String tot = df.format(valorTotalParcial.doubleValue()).replace(",",".");
//		System.out.println(df.format(valorTotalParcial.doubleValue()).replace(",","."));
//		double valorDecimalUlt = valorTotal - Double.parseDouble(tot);
//		System.out.println("ult" + valorDecimalUlt);
//		System.out.println("ultsem" + new BigDecimal(valorTotal - Double.valueOf(valorTotalParcial.toString())));
		
		
	}
	
	
	public static String GenerateRandomNumber(int charLength) {
        return String.valueOf(charLength < 1 ? 0 : Math.abs(new Random()
                .nextInt((9 * (int) Math.pow(10, charLength - 1)) - 1)
                + (int) Math.pow(10, charLength - 1)));
    }
	
	
	public String generateStringOfLongRandomNumber(int tamanho) {
		
		int tamanhoRandom = (int) ((Math.random() * (tamanho)) + 1);
		
		long numberConverted = (long) Math.pow(10, tamanhoRandom - 1);
		
		long numberConverted2 = (long) (Math.pow(10, tamanhoRandom) - 1);
		
		long numberGenerated = (long) ((Math.random() * (numberConverted2 - numberConverted)) + numberConverted);
		
		//System.out.println(numberGenerated);
		
		return String.valueOf(numberGenerated);
		
	}
	
	public String generateStringOfDecimalRandomNumber(int numDigitos) {
		
		numDigitos = numDigitos - 6;
		int tamanhoRandom = (int) ((Math.random() * (numDigitos)) + 1);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		double numberConverted = (double) Math.round(Math.pow(10, tamanhoRandom - 1));
		
		double numberConverted2 = (double) Math.round(Math.pow(10, tamanhoRandom) - 1);
		
		double numberGenerated = (double) ((Math.random() * (numberConverted2 - numberConverted)) + numberConverted);
		
		//System.out.println(df.format(numberGenerated));
		
		return String.valueOf(df.format(numberGenerated).replace(".", ","));
		
	}

}
