
/* Um programa de vida saudável quer dar pontos atividades físicas que podem
ser trocados por dinheiro. O sistema funciona assim:
 - Cada hora de atividade física no mês vale pontos
 - até 10h de atividade no mês: ganha 2 pontos por hora
 - de 10h até 20h de atividade no mês: ganha 5 pontos por hora
 - acima de 20h de atividade no mês: ganha 10 pontos por hora
 - A cada ponto ganho, o cliente fatura R$0,05 (5 centavos) 
 
 Faça um programa que leia quantas horas de atividade uma pessoa teve por mês,
calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.
 */
import java.util.Scanner;

public class Exercicio036 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int hora = 0;
		int ponto = 0;
		double dinheiro = 0.05;

		System.out.println("Quantas horas você malhou?");
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
		System.out.println("Sua pontuação é: " + ponto);
		System.out.println("Valor = R$" + dinheiro);

		teclado.close();
	}

}
