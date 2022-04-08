package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio014 {
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

		media = (nota1 + nota2) / 2;

		if (media >= 9 && media <= 10) {
			System.out.println("A média de " + nome + " é de " + media);
			System.out.println("o estudante " + nome + " teve conceito A  e foi aprovado!");
		} else if (media >= 7.5 && media < 9) {
			System.out.println("A média de " + nome + " é de " + media);
			System.out.println("o estudante " + nome + " teve conceito B  e foi aprovado!");
		} else if (media >= 6 && media < 7.5) {
			System.out.println("A média de " + nome + " é de " + media);
			System.out.println("o estudante " + nome + " teve conceito C e foi aprovado!");
		} else if (media > 4 && media < 6) {
			System.out.println("A média de " + nome + " é de " + media);
			System.out.println("o estudante " + nome + " teve conceito D e reprovou!");
		} else if (media <= 4 && media >= 0) {
			System.out.println("A média de " + nome + " é de " + media);
			System.out.println("o estudante " + nome + " teve conceito E e reprovou!");
		} else {
			System.out.println("notas inválidas!");
		}

		teclado.close();
	}
}
