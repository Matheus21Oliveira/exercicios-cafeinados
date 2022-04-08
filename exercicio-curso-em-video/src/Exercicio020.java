/*
 *  Desenvolva um programa que leia um numero inteiro e mostre se ele é PAR ou 
 *  IMPAR.
 */

import java.util.Scanner;

public class Exercicio020 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float n;

		System.out.println("escreva um numero:");
		n = teclado.nextFloat();

		if (n % 2 == 0) {
			System.out.println("esse numero e par.");
		} else {
			System.out.println("esse numero e impar.");
		}

		teclado.close();
	}

}
