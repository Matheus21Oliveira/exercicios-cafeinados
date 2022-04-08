package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio011 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero1, numero2, resposta1, resposta2, numero3, resposta3;
		
		System.out.print("Me fale um valor inteiro: ");
		numero1 = teclado.nextInt();
		
		System.out.print("Me fale outro valor inteiro: ");
		numero2 = teclado.nextInt();
		
		System.out.print("Me fale um numero real: ");
		numero3 = teclado.nextDouble();		
		
		
		resposta1 = (numero1 * 2) * (numero2/2);
		
		resposta2 = (numero1 * 3) + numero3;
		
		resposta3 = Math.pow(numero3, 3); 
		
		System.out.println("O produto do dobro do primeiro com metade do segundo é: " + resposta1);
		System.out.println("A soma do triplo do primeiro com o terceiro é: " + resposta2);
		System.out.println("O terceiro elevado ao cubo é: " + resposta3);
		
		teclado.close();
	}
}
