package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio002 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero;
	
		System.out.println("Escolha um valor:");
		numero = teclado.nextDouble();
		
		if (numero < 0) {
			System.out.println("Este número é negativo!");
		}else {
			System.out.println("Este número é positivo!");
		}
		teclado.close();
	}
}
