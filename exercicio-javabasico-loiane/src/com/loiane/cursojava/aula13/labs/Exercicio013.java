package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercicio013 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double impostoDeRenda, inss, sindicato, hora, horaTrabalhada, salario, liquido;
		
		System.out.print("Quanto voce recebe por hora? ");
		hora = teclado.nextDouble();
		
		System.out.print("Quantas horas voce trabalhou? ");
		horaTrabalhada = teclado.nextDouble();
		
		salario = hora * horaTrabalhada;
		
		impostoDeRenda = salario - 0.11;
		
		inss = salario - 0.08;
		
		sindicato = salario - 0.05;
		
		liquido = salario - 0.11 - 0.08 - 0.05;
		
		System.out.println("Voce receberá no mês: " + salario);
		System.out.println("O seu salário líquido é de: " + liquido);
		
		teclado.close();
	}
}
