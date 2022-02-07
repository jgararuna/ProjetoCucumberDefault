package br.com.rabobank.ifd.cso.utils;

import java.text.DecimalFormat;
import java.util.Random;

public class RandomUtils {
	
	public void main(String[] args) {
		
//		Random rand = new Random();
//		//int randomTamanho = rand.nextInt((18+1) - 1) + 1;
//		int limite = 14;
//		int randomTamanho = 1 + rand.nextInt(limite);
//		
//		System.out.println("Random integer value from 0 to " + (limite-1) + " : "+ randomTamanho);
//		 
//		System.out.println(GenerateRandomNumber(randomTamanho));
//		//int randomNumber
		
		System.out.println(generateStringOfLongRandomNumber(5));
		
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
		
		System.out.println(numberGenerated);
		
		return String.valueOf(numberGenerated);
		
	}
	
	public String generateStringOfDecimalRandomNumber(int numDigitos) {
		
		numDigitos = numDigitos - 6;
		int tamanhoRandom = (int) ((Math.random() * (numDigitos)) + 1);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		double numberConverted = (double) Math.round(Math.pow(10, tamanhoRandom - 1));
		
		double numberConverted2 = (double) Math.round(Math.pow(10, tamanhoRandom) - 1);
		
		double numberGenerated = (double) ((Math.random() * (numberConverted2 - numberConverted)) + numberConverted);
		
		System.out.println(df.format(numberGenerated));
		
		return String.valueOf(df.format(numberGenerated).replace(".", ","));
		
	}

}
