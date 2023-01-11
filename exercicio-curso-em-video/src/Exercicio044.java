
/* Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
incremento, mostrando em seguida todos os valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou!
*/
import java.util.Scanner;

public class Exercicio044 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int inicio = 0;
		int fim = 0;
		int incremento = 0;

		System.out.println("Digite o primeiro valor: ");
		inicio = teclado.nextInt();

		System.out.println("Digite o último valor: ");
		fim = teclado.nextInt();

		System.out.println("Digite o incremento: ");
		incremento = teclado.nextInt();
		System.out.print("Contagem: ");
		while (inicio < fim) {
			System.out.print(inicio + " ");
			inicio += incremento;
		}
		System.out.println(" Acabou!");
		teclado.close();
	}
}
