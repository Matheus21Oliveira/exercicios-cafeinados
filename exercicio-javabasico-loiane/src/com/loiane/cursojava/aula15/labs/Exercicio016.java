package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio016 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double a, b, c;

		System.out.println("coloque o valor de 'a' da equa��o do segundo grau.");
		a = teclado.nextDouble();

		System.out.println("coloque o valor de 'b' da equa��o do segundo grau.");
		b = teclado.nextDouble();

		System.out.println("coloque o valor de 'c' da equa��o do segundo grau.");
		c = teclado.nextDouble();
		
		teclado.close();
	}
}
