package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio006 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double area, raio;
		
		System.out.print("Qual � o raio do circulo? ");
		raio = teclado.nextDouble();
		
		area = Math.PI * Math.pow(raio,2);
		
		System.out.print("A �rea do circulo � de: " + area);
		
		teclado.close();
		
	}
}
