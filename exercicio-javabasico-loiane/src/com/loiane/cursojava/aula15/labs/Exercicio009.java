package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio009 {
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
			if (numero2 < numero3) {
				System.out.println(numero1+ " " + " " + numero3 + " " + numero2);
			} else {
				System.out.println(numero1+ " " + " " + numero2 + " " + numero3);
			}
		} else if (numero2 > numero1 && numero2 > numero3) {
			if (numero1 < numero3) {
				System.out.println(numero2+ " " + " " + numero3 + " " + numero1);
			} else {
				System.out.println(numero2+ " " + " " + numero1 + " " + numero3);
			}
		}else {
			if (numero1 < numero2) {
				System.out.println(numero3+ " " + " " + numero2 + " " + numero1);
			} else {
				System.out.println(numero3+ " " + " " + numero1 + " " + numero2);
			}
		}
		teclado.close();
	}
}
