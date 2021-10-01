/*
A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva 
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a 
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar, 
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.
 */
package exercicios;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int d;
        double km, p;
        
        System.out.println("quantos quilômetros rodados o carro andou? ");
         km = teclado.nextDouble();
         
         System.out.println("por quantos dias ele andou? ");
         d = teclado.nextInt();
         
         p = km*0.20+d*90;
         
         System.out.println("ao total o cliente vai pagar R$" + p + "00");
    }
    
}
