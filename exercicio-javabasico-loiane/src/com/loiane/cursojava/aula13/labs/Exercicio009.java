package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio009 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double celsius, temperatura;
		

		System.out.print("Quantos graus em Farenheit voce quer converter pra Celsius? ");
		temperatura = teclado.nextDouble();
		
		celsius = (temperatura - 32)/1.8; 
		
		System.out.print("O valor da temperatura em Celsius é: " + celsius);
		
		teclado.close();
	}
}
