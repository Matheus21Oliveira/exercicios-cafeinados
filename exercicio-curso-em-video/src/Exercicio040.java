/*  Crie um aplicativo que mostre na tela a seguinte contagem:
0 3 6 9 12 15 18 Acabou!

*/

public class Exercicio040 {
	public static void main(String[] args) {
		int numero = 0;
		while (numero <= 18) {
			System.out.print(numero + " ");
			numero += 3;
		}
		System.out.println("Acabou!");
	}

}
