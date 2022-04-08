/*
 * Faca um programa que leia a largura e o comprimento de um terreno retangular, 
 * calculando e mostrando a sua area em m². O programa tambem
 * deve mostrar a classificacao desse terreno, de acordo com a lista abaixo:
 * 	- Abaixo de 100m² = TERRENO POPULAR
 * 	- Entre 100m² e 500m² = TERRENO MASTER
 * 	- Acima de 500m² = TERRENO VIP
 */

import java.util.Scanner;

public class Exercicio028 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double largura, comprimento, area;

		System.out.print("qual Ã© a largura do terreno? ");
		largura = teclado.nextDouble();

		System.out.println("qual Ã© o comprimento do terreno? ");
		comprimento = teclado.nextDouble();

		area = comprimento * largura;

		System.out.println("o valor da Ã¡rea Ã© de " + area + "mÂ²");

		if (area < 100) {
			System.out.println("o terreno Ã© popular");
		} else if (area <= 500) {
			System.out.println("o terreno Ã© master");
		} else {
			System.out.println("o terreno serÃ¡ vip");
		}
		
		teclado.close();
	}
}
