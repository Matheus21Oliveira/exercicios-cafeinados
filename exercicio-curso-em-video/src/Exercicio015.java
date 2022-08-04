/*
 * Crie um programa que leia o numero de dias trabalhados em um mes e mostre o 
 * salario de um funcionario, sabendo que ele trabalha 8 horas por dia e ganha R$25 
 * por hora trabalhada.
 */

import java.util.Scanner;

public class Exercicio015 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         
         System.out.println("qual o nome do funcionario? ");
         String nome = teclado.next();    
         
         System.out.println("quantos dias " + nome + " trabalhou? ");
         int dia = teclado.nextInt();
         
         double salario = dia * 8 * 25;
         
         System.out.println(nome + " vai ganhar " + salario + "00 reais");
         
         teclado.close();
    }
    
    
}
