package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio013 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero;

		System.out.print("Escolha um numero de 1 ao 7 pra escolher o dia da semana: ");
		numero = teclado.nextDouble();

		if (numero == 1) {
			System.out.println("Este dia � um domingo!");
		} else if (numero == 2) {
			System.out.println("Este dia � segunda!");
		} else if (numero == 3) {
			System.out.println("Esete dia � ter�a!");
		} else if (numero == 4) {
			System.out.println("Este dia � quarta!");
		} else if (numero == 5) {
			System.out.println("Este dia � quinta!");
		} else if (numero == 6) {
			System.out.println("Este dia � sexta!");
		} else if (numero == 7) {
			System.out.println("Este dia � sabado!");
		} else {
			System.out.println("Dia inv�lido!");
		}
		teclado.close();
	}
}
