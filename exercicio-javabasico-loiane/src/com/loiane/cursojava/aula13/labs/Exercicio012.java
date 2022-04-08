package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio012 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double altura, peso;
		
		System.out.println("Qual é a sua altura? ");
		altura = teclado.nextDouble();
		
		peso = (72.7*altura)-58;
		
		System.out.print("O seu peso ideal será de: " + peso);
		
		teclado.close();
	}
}
