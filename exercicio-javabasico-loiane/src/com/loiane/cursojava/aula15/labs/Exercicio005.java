package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio005 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		double nota1, nota2, media;
		
		System.out.print("Qual o nome do estudante?");
		nome = teclado.next();
		
		System.out.print("Qual a primeira nota de " + nome + "?");
		nota1 = teclado.nextDouble();
		
		System.out.print("Qual a segunda nota de " + nome + "?");
		nota2 = teclado.nextDouble();
		
		media = (nota1 + nota2)/2;
		
		System.out.println("A média de " + nome + " é de " + media);		
		
		if (media == 10) {
			System.out.println("O estudante " + nome + " foi APROVADO COM DISTINÇÃO!!!");			
		} else if (media >= 7) {
			System.out.println("O estudante " + nome + " foi APROVADO!!!");
		} else {
			System.out.println("O estudante " + nome + " foi reprovado!");
		}
		
		teclado.close();
	}
}
