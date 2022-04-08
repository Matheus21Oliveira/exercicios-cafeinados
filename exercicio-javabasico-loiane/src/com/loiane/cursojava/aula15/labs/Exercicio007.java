package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio007 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero1, numero2, numero3;
		
		System.out.print("Insira um valor: ");
		numero1 = teclado.nextDouble();
		
		System.out.print("Insira outro valor: ");
		numero2 = teclado.nextDouble();
		
		System.out.print("Insira outro valor: ");
		numero3 = teclado.nextDouble();
		
		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O primeiro numero é maior");
			if (numero2 < numero3) {
				System.out.println("O segundo numero é o menor");
			} else {
				System.out.println("O terceiro numero é o menor");
			}
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O segundo numero é maior");
			if (numero1 < numero3) {
				System.out.println("O primeiro numero é o menor");
			} else {
				System.out.println("O terceiro numero é o menor");
			}
		}else {
			System.out.println("O terceiro numero é maior");
			if (numero1 < numero2) {
				System.out.println("O primeiro numero é o menor");
			} else {
				System.out.println("O segundo numero é o menor");
			}
		}
		teclado.close();
	}
}
