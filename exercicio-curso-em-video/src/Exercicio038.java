/*  Escreva um programa que mostre na tela a seguinte contagem:
6 7 8 9 10 11 Acabou! 
*/

public class Exercicio038 {
	public static void main(String[] args) {
		int numero = 6;
		while (numero <= 11) {
			System.out.print(numero + " ");
			numero++;
		}
		System.out.println("Acabou!");
	}

}
