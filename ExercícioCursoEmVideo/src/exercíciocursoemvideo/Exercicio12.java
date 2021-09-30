/*
 Crie um programa que leia o preço de um produto, calcule e mostre o seu 
PREÇO PROMOCIONAL, com 5% de desconto.
 */
package exercicios;

import java.util.Scanner;


public class Exercicio12 { 
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         String p;
         double d, v, pr;
         
         System.out.println("qual o nome do produto? ");
         p = teclado.next();
         
         System.out.println("qual é o valor de " + p + "? ");
         v = teclado.nextDouble();
         
         d = v * 0.5;
         
         pr = v - d;
         
         System.out.println("valor promocional de " + p + " é R$" + pr);
        }

    
    }
    

