/*   Desenvolva um programa que mostre na tela a seguinte contagem:
100 95 90 85 80 ... 0 Acabou!

*/

public class Exercicio041 {
	public static void main(String[] args) {
		int numero = 100;
		while (numero >= 0) {
			System.out.print(numero + " ");
			numero -= 5;
		}
		System.out.println("Acabou!");
	}

}
