package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio008 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario, horaTrabalhada, hora;
		
		System.out.print("Quanto voce recebe por hora? ");
		hora = teclado.nextDouble();
		
		System.out.print("Quantas horas voce trabalhou? ");
		horaTrabalhada = teclado.nextDouble();
		
		salario = hora * horaTrabalhada;
		
		System.out.println("Voce receberá no mês: " + salario);
		
		teclado.close();
	}
}
