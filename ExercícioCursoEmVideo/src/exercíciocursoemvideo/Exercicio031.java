//Crie um jogo de JoKenPo (Pedra-Papel-Tesoura)
package Passo3;

import java.util.Scanner;

public class Exercicio31 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String resposta1, resposta2, nome1, nome2;

        System.out.print("nome do jogador 1 ");
        nome1 = teclado.nextLine();

        System.out.print("nome do jogador 2 ");
        nome2 = teclado.nextLine();

        System.out.print(nome1 + " pedra, papel ou tesoura? ");
        resposta1 = teclado.nextLine();

        System.out.print(nome2 + " pedra, papel ou tesoura? ");
        resposta2 = teclado.nextLine();

        if ("pedra".equals(resposta1)) {
            if ("pedra".equals(resposta2)) {
                System.out.println("empate!");
            } else if ("papel".equals(resposta2)) {
                System.out.println(nome2 + " venceu!");
            } else if ("tesoura".equals(resposta2)) {
                System.out.println(nome1 + " venceu!");
            } else {
                System.out.println("Algo deu errado tente novamente!");
            }
        } else if ("papel".equals(resposta1)) {
            if ("pedra".equals(resposta2)) {
                System.out.println(nome1 + " venceu!");
            } else if ("papel".equals(resposta2)) {
                System.out.println("empate!");
            } else if ("tesoura".equals(resposta2)) {
                System.out.println(nome2 + " venceu!");
            } else {
                System.out.println("Algo deu errado tente novamente!");
            }
        } else if ("tesoura".equals(resposta1)) {
            if ("pedra".equals(resposta2)) {
                System.out.println(nome2 + " venceu!");
            } else if ("tesoura".equals(resposta2)) {
                System.out.println("empate!");
            } else if ("papel".equals(resposta2)) {
                System.out.println(nome1 + " venceu!");
            } else {
                System.out.println("Algo deu errado tente novamente!");
            }
        } else {
            System.out.println("Algo deu errado tente novamente!");
        }

    }

}
