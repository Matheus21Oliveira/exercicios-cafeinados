/*
Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
 */
package exercíciocursoemvideo;

import java.util.Scanner;

public class Exercicio3 { 
    public static void main(String[] args) {
       
        Scanner teclado = new Scanner(System.in);
        String nome;  
        double salario;
       
        System.out.print("qual é o seu nome?");
        nome = teclado.next();
        
        System.out.print("qual é o seu salário?");
        salario = teclado.nextDouble();
        
        System.out.println("o funcionário(a) " + nome + " tem um salário de R$" + salario + " em junho");
    }
    
}
