package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio006 {
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
			System.out.println("O primeiro numero � maior");
		}else if (numero2 > numero1 && numero2 > numero3){
			System.out.println("O segundo numero � maior");
		}else {
			System.out.println("O terceiro numero � maior");
		}
		
		teclado.close();
	}
}
