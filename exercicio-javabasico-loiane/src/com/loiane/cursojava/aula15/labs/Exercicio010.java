package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio010 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		char resposta;
		
		System.out.print("Em qual período de tempo voce estuda manha (m), tarde(v) ou noite(n)?" );
		resposta = teclado.next().charAt(0);
		
		if (resposta == 'm' || resposta == 'M') {
			System.out.println("Bom dia!");
		}else if (resposta == 'v' ||  resposta == 'V') {
			System.out.println("Boa tarde!");
		}else if (resposta == 'n' || resposta == 'M') {
			System.out.println("Boa noite!");
		}else {
			System.out.println("Valor inválido!");
		}
		teclado.close();
	}
}
