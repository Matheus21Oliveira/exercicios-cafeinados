package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio010 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double farenheit, temperatura;
		

		System.out.print("Quantos graus em Celsius voce quer converter pra Farenheit? ");
		temperatura = teclado.nextDouble();
		
		farenheit = (temperatura * 1.8) + 32; 
		
		System.out.print("O valor da temperatura em Celsius é: " + farenheit);
		
		teclado.close();
	}
}
