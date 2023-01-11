/*  Faça um algoritmo que mostre na tela a seguinte contagem:
10 9 8 7 6 5 4 3 Acabou!
*/

public class Exercicio039 {
	public static void main(String[] args) {
		int numero = 10;
		while (numero >= 3) {
			System.out.print(numero + " ");
			numero--;
		}
		System.out.println("Acabou!");
	}

}
