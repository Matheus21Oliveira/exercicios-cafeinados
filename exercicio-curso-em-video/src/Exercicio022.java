/*
 *  Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua 
 *  situa��o em rela��o ao alistamento militar.
 *  	- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o 
 *  alistamento.
 *  	- Se j� tiver depois dos 18 anos, mostre quantos anos j� se passaram do 
 *  alistamento.

 */

import java.util.Scanner;

public class Exercicio022 {
     public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("escreva o nome: ");
        String nome = teclado.next();
        
        System.out.print("Qual � o ano atual? ");
        int anoAtual = teclado.nextInt();
        
        System.out.print("Em que ano " + nome + " nasceu: ");
        int anoNascimento = teclado.nextInt();
        
        int idade = anoAtual - anoNascimento;
        
        if (idade > 18) {        	
        	System.out.println(nome + " Voce est� atrasado " + idade + " anos.");
        } else if (idade == 18) {
        	System.out.println("Sua hora chegou!");
        } else {
        	System.out.println("Ainda n�o � sua hora falta: " +   " anos");
        }
         
        teclado.close();
    }
       
        
}
