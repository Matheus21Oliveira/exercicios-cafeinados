/*
 * Escreva um programa para aprovar ou nao o emprestimo bancario para a compra 
 * de uma casa. O programa vai perguntar o valor da casa, o salario do comprador e 
 * em quantos anos ele vai pagar. Calcule o valor da prestacao mensal, sabendo que 
 * ela nao pode exceder 30% do salario ou entao o emprestimo sera negado.
 */

import java.util.Scanner;

public class Exercicio033 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double casa, salario, ano, meses, valor, porcento;

		System.out.print("qual e o valor da casa? ");
		casa = teclado.nextDouble();

		System.out.print("qual o seu salario? ");
		salario = teclado.nextDouble();

		System.out.print("por quantos anos voce vai pagar o valor da casa? ");
		ano = teclado.nextDouble();

		meses = ano;

		meses *= 12;

		valor = casa / meses;

		porcento = salario * 0.3;

		if (valor > porcento) {
			System.out.print("voce nao conseguira fazer o emprestimo");
		} else {
			System.out.print("voce conseguira fazer o emprestimo");
		}
		
		teclado.close();
	}

}
