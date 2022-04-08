package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio003 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, soma;
		
		System.out.print("escolha um número: ");
		numero1 = teclado.nextInt();
		
		System.out.print("escolha outro número: ");
		numero2 = teclado.nextInt();
		
		soma = numero1 + numero2;
		
		System.out.println("A soma desses dois números é: " + soma);
		
		teclado.close();
	}
}
