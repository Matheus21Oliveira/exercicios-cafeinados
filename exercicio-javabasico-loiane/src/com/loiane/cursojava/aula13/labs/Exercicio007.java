package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio007 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double area, lado;
		
		System.out.println("Qual é o valor do lado do quadrado? ");
		lado = teclado.nextDouble();
		
		area = lado * lado;
		
		area *=2;
		
		System.out.println("A area do quadrado dobrado é de: " + area);
		
		teclado.close();
	}
}
