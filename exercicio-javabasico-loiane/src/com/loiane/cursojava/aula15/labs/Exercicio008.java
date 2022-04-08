package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio008 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double produto1, produto2, produto3; 
		
		System.out.print("Insira um valor de um produto: ");
		produto1 = teclado.nextDouble(); 
		

		System.out.print("Insira outro valor de um produto: ");
		produto2= teclado.nextDouble();
		

		System.out.print("Insira mais um valor de um produto: ");
		produto3 = teclado.nextDouble();
		
		if (produto1 < produto2 && produto1 < produto3) {
			System.out.println("O primeiro produto é mais barato");
		}else if (produto2 < produto1 && produto2 < produto3){
			System.out.println("O segundo produto é mais barato");
		}else {
			System.out.println("O terceiro produto é mais barto");
		}
		teclado.close();
	}
}
