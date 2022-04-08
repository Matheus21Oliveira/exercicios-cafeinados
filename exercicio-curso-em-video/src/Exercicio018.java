/*
 * Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade 
 * dela e depois mostre se ela pode ou nao votar
 */

import java.util.Scanner;

public class Exercicio018 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float ano, idade;

		System.out.println("Em que ano voce nasceu? ");
		ano = teclado.nextFloat();

		idade = 2021 - ano;

		if (idade > 18) {
			System.out.println("voto obrigatorio.");
		} else if (idade >= 16) {
			System.out.println("voce pode votar, mas nao e obrigatorio.");
		} else {
			System.out.println("voce nao tem a idade minima de 16 anos para votar.");
		}
		
		teclado.close();
	}

}
