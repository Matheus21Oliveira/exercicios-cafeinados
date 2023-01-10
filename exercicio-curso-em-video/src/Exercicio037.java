
/* Uma empresa precisa reajustar o sal�rio dos seus funcion�rios, dando um
aumento de acordo com alguns fatores. Fa�a um programa que leia o sal�rio atual,
o g�nero do funcion�rio e h� quantos anos esse funcion�rio trabalha na empresa.
No final, mostre o seu novo sal�rio, baseado na tabela a seguir:
- Mulheres
 - menos de 15 anos de empresa: +5%
 - de 15 at� 20 anos de empresa: +12%
 - mais de 20 anos de empresa: +23%
- Homens
 - menos de 20 anos de empresa: +3%
 - de 20 at� 30 anos de empresa: +13%
 - mais de 30 anos de empresa: +25%
 */
import java.util.Scanner;

public class Exercicio037 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double novoSalario = 0;
		int ano;
		String genero;

		System.out.print("Sal�rio atual: ");
		double salarioAtual = teclado.nextDouble();

		System.out.println("Homem ou Mulher: ");
		teclado.nextLine();
		genero = teclado.nextLine();

		System.out.println("Tempo na empresa: ");
		ano = teclado.nextInt();

		if (genero.equals("mulher")) {
			if (ano > 0 && ano < 15) {
				novoSalario = salarioAtual + (salarioAtual * 0.05);
			} else if (ano >= 15 && ano < 20) {
				novoSalario = salarioAtual + (salarioAtual * 0.12);
			} else if (ano > 20) {
				novoSalario = salarioAtual + (salarioAtual * 0.23);
			}
		} else if (genero.equals("homem")) {
			if (ano > 0 && ano < 20) {
				novoSalario = salarioAtual + (salarioAtual * 0.03);
			} else if (ano >= 20 && ano < 30) {
				novoSalario = salarioAtual + (salarioAtual * 0.13);
			} else if (ano > 30) {
				novoSalario = salarioAtual + (salarioAtual * 0.25);
			}
		}

		System.out.println("Novo sal�rio = R$" + novoSalario);

		teclado.close();
	}

}
