/*
 * Numa promocao exclusiva para o Dia da Mulher, uma loja quer dar descontos 
 * para todos, mas especialmente para mulheres. Faça um programa que leia nome, 
 * sexo e o valor das compras do cliente e calcule o preco com desconto. Sabendo 
 * que:
 * 	- Homens ganham 5% de desconto
 * 	- Mulheres ganham 13% de desconto
 */

import java.util.Scanner;

public class Exercicio023 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, sexo;
        float valor;

        System.out.println("qual e o seu nome?");
        nome = teclado.nextLine();

        System.out.println("qual e o seu sexo?");
        sexo = teclado.nextLine();

        System.out.println("qual e o valor de sua compra?");
        valor = teclado.nextFloat();

        if (sexo == "feminino") {
            valor -= (valor * 0.13);
        } else {
            valor -= (valor * 0.5);
        }
        System.out.println("preco promocional saira " + valor);
        
        teclado.close();
    }
}
