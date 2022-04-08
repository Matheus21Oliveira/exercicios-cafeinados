package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio001 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero1, numero2;
		
		System.out.print("Insira um valor: ");
		numero1 = teclado.nextDouble();
		
		System.out.print("Insira outro valor: ");
		numero2 = teclado.nextDouble();
		
		if (numero1 > numero2) {
			System.out.println("O primeiro nuimero é maior");
		}else {
			System.out.println("O segundo numero é maior");
		}
		
		teclado.close();
	}
}
