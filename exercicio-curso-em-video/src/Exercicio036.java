
/* Um programa de vida saud�vel quer dar pontos atividades f�sicas que podem
ser trocados por dinheiro. O sistema funciona assim:
 - Cada hora de atividade f�sica no m�s vale pontos
 - at� 10h de atividade no m�s: ganha 2 pontos por hora
 - de 10h at� 20h de atividade no m�s: ganha 5 pontos por hora
 - acima de 20h de atividade no m�s: ganha 10 pontos por hora
 - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos) 
 
 Fa�a um programa que leia quantas horas de atividade uma pessoa teve por m�s,
calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.
 */
import java.util.Scanner;

public class Exercicio036 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int hora = 0;
		int ponto = 0;
		double dinheiro = 0.05;

		System.out.println("Quantas horas voc� malhou?");
		hora = teclado.nextInt();

		if (hora > 0 && hora < 10) {
			ponto = 2;
		} else if (hora >= 10 && hora < 20) {
			ponto = 5;
		} else {
			ponto = 10;
		}

		ponto *= hora;

		dinheiro *= ponto;
		System.out.println("Sua pontua��o �: " + ponto);
		System.out.println("Valor = R$" + dinheiro);

		teclado.close();
	}

}
