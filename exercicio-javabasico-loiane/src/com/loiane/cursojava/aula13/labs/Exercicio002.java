package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio002 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		System.out.print("digite um número:_______");
		numero = teclado.nextInt();
		
		System.out.println("O número que você digitou foi " + numero);
		
		teclado.close();

	}

}
