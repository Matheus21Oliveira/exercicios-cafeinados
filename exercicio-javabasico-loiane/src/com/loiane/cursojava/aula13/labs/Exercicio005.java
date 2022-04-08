package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio005 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double centimetro, metros;

		System.out.print("qual valor em metros voce gostaria de converter para centimetro?");
		metros = teclado.nextDouble();

		centimetro = metros * 100;

		System.out.println("O valor em centimetro é de: " + centimetro + "cm");

		teclado.close();
	}
}
