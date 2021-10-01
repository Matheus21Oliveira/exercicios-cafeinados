/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passo.pkg2;

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome, sexo;
        float valor;

        System.out.println("qual é o seu nome?");
        nome = teclado.nextLine();

        System.out.println("qual é o seu sexo?");
        sexo = teclado.nextLine();

        System.out.println("qual é o valor de sua compra?");
        valor = teclado.nextFloat();

        if (sexo == "feminino") {
            valor -= (valor * 0.13);
        } else {
            valor -= (valor * 0.5);
        }
        System.out.println("preço promocional saira " + valor);
    }
}
