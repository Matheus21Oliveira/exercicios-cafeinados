/*
 * Crie um programa que leia o nome e o salario de um funcionario, mostrando no
 * final uma mensagem.
 * Ex:
 * 	Nome do Funcionario: Maria do Carmo
 * 	Salario: 1850,45
 * 	O funcionario Maria do Carmo tem um salario de R$1850,45 em Junho.
 */

import java.util.Scanner;

public class Exercicio003 { 
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        String nome;  
        double salario;
       
        System.out.print("qual e o seu nome?");
        nome = teclado.next();
        
        System.out.print("qual e o seu salario?");
        salario = teclado.nextDouble();
        
        System.out.println("o funcionario(a) " + nome + " tem um salário de R$" + salario + " em junho");
        
        teclado.close();
    }
    
}
