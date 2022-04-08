/*
 * Desenvolva um programa que leia o nome de um funcionario, seu salario,
 * quantos anos ele trabalha na empresa e mostre seu novo salario, reajustado de
 * acordo com a tabela a seguir:
 * 	- Ate 3 anos de empresa: aumento de 3%
 * 	- entre 3 e 10 anos: aumento de 12.5%
 * 	- 10 anos ou mais: aumento de 20%
 */

import java.util.Scanner;

public class Exercicio029 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String funcionario;
		double salario, anos, ns;

		System.out.print("qual o nome do funcionario? ");
		funcionario = teclado.nextLine();

		System.out.print("qual e salario atual de " + funcionario + "? ");
		salario = teclado.nextDouble();

		System.out.print("por quanto tempo " + funcionario + " trabalha na empresa? ");
		anos = teclado.nextDouble();

		if (anos < 3) {
			anos = anos * 0.03;
			System.out.println(funcionario + " recebera " + anos);
		} else if (anos <= 10) {
			anos = anos * 12.5;
			System.out.println(funcionario + " recebera " + anos);
		} else {
			anos = anos * 0.20;
			System.out.println(funcionario + " recebera " + anos);
		}
		
		teclado.close();

	}

}
