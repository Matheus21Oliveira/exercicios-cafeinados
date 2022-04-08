package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio004 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String nome;
		double nota1, nota2, nota3, nota4, media;
		
		System.out.print("Qual o nome do estudante?");
		nome = teclado.next();
		
		System.out.print("Qual a primeira nota de " + nome + "?");
		nota1 = teclado.nextDouble();
		
		System.out.print("Qual a segunda nota de " + nome + "?");
		nota2 = teclado.nextDouble();
		
		System.out.print("Qual a terceira nota de " + nome + "?");
		nota3 = teclado.nextDouble();
		
		System.out.print("Qual a última nota de " + nome + "?");
		nota4 = teclado.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("A média de " + nome + " é de " + media);		
		
		teclado.close();
	}
}
