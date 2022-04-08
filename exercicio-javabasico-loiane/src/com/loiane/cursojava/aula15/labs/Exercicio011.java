package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exercicio011 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salario, novoSalario = 0, aumento = 0, porcentagem = 0;
				
		System.out.print("Qual é o salário atual do colaborador? ");
		salario = teclado.nextDouble();
		
		if (salario <= 280) {
			aumento = salario * 0.20;
			porcentagem = 0.20;
		} else if (salario > 280 && salario <= 700) {			
			aumento = salario * 0.15;
			porcentagem = 0.15;
		}else if (salario > 700 && salario <= 1500) {			
			aumento = salario * 0.10;
			porcentagem = 0.10;
		}else {			
			aumento = salario * 0.05;
			
			porcentagem = 0.05;
		}
		
		novoSalario = salario + aumento;
		
		System.out.println("O salario antes do ajuste é: " + salario);
		System.out.println("A porcentagem foi de: " + porcentagem);
		System.out.println("O aumento foi de: " + aumento);
		System.out.println("O salario depois do ajuste é: "+ novoSalario);
		teclado.close();
	}
}
