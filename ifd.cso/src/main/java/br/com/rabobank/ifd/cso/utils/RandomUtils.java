package br.com.rabobank.ifd.cso.utils;

import java.util.Random;

public class RandomUtils {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		//int randomTamanho = rand.nextInt((18+1) - 1) + 1;
		int limite = 14;
		int randomTamanho = 1 + rand.nextInt(limite);
		
		System.out.println("Random integer value from 0 to " + (limite-1) + " : "+ randomTamanho);
		 
		System.out.println(GenerateRandomNumber(randomTamanho));
		//int randomNumber
		
	}
	
	
	public static String GenerateRandomNumber(int charLength) {
        return String.valueOf(charLength < 1 ? 0 : Math.abs(new Random()
                .nextInt((9 * (int) Math.pow(10, charLength - 1)) - 1)
                + (int) Math.pow(10, charLength - 1)));
    }

}
