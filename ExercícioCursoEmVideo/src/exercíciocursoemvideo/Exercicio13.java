/*
   Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o 
seu novo salário, com 15% de aumento.
 */
package exercicios;

import java.util.Scanner;


public class Exercicio13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String f;
        double a, s, p;
        
        System.out.println("qual é o nome do funcionário? ");
        f = teclado.next();
        
        System.out.println("qual o valor do salário de " + f + "?");
        s = teclado.nextDouble();
        
        a = s * 0.15;
        
        p = s + a;
        
        System.out.println("valor do salario de " + f + " é R$" + p);
        
    }
    
}
