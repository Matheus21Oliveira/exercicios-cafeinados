/*
 *  Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua 
 *  situação em relação ao alistamento militar.
 *  	- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o 
 *  alistamento.
 *  	- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do 
 *  alistamento.

 */

import java.util.Scanner;

public class Exercicio022 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("escreva o nome: ");
        String nome = teclado.next();
        
        System.out.print("Qual é o ano atual? ");
        int anoAtual = teclado.nextInt();
        
        System.out.print("Em que ano " + nome + " nasceu: ");
        int anoNascimento = teclado.nextInt();
        
        int idade = anoAtual - anoNascimento;
        
        if (idade > 18) {        	
        	System.out.println(nome + " Voce está atrasado " + idade + " anos.");
        } else if (idade == 18) {
        	System.out.println("Sua hora chegou!");
        } else {
        	System.out.println("Ainda não é sua hora falta: " +   " anos");
        }
         
        teclado.close();
    }
       
        
}
