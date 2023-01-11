
/*   Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
qualquer e mostre uma contagem até esse valor:
Ex: Digite um valor: 35
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou!

*/
import java.util.Scanner;

public class Exercicio042 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 1;
		int pergunta = 0;
		System.out.println("Escreva um número inteiro: ");
		pergunta = teclado.nextInt();

		while (numero <= pergunta) {
			System.out.print(numero + " ");
			numero++;
		}
		System.out.println("Acabou!");
		teclado.close();
	}

}
