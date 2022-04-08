package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio004 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char resposta;
		
		System.out.println("Digite uma letra:");
		resposta = teclado.next().charAt(0);
		
		if (resposta == 'a' || resposta == 'e' || resposta == 'i' || resposta == 'o' || resposta == 'u') {
			System.out.println("Esta letra é uma vogal!");
		}else {
			System.out.println("Esta letra é uma consoante!");
		}
				
		teclado.close();
	}
}
