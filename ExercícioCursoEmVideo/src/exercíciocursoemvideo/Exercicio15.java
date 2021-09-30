/*
Crie um programa que leia o número de dias trabalhados em um mês e mostre o 
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25 
por hora trabalhada.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author mathe
 */
public class Exercicio15 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         String n;
         int d, m;
         double s;
         
         System.out.println("qual o nome do funcionario? ");
         n = teclado.next();    
         
         System.out.println("quantos dias tem o mes atual? ");
         m = teclado.nextInt();
         
         System.out.println("quantos dias " + n + " trabalhou? ");
         d = teclado.nextInt();
         
         s = d * 8 * 25;
         
         System.out.println(n + " vai ganhar " + s + "00 reais");
         
    
    }
    
    
}
