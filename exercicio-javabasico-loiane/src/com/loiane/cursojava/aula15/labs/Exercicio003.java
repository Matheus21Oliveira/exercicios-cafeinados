package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio003 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char resposta;
		
		System.out.print("Qual sexo voce é f ou m?" );
		resposta = teclado.next().charAt(0);
		
		if (resposta == 'f' || resposta == 'F') {
			System.out.println("Voce se considera feminino!");
		}else if (resposta == 'm' ||  resposta == 'M') {
			System.out.println("Voce se considera masculino!");
		}else {
			System.out.println("Sexo inválido!");
		}
		teclado.close();
	}
}
