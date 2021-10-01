/*Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas
para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!*/


package exercíciocursoemvideo;

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        String nome;
        
        System.out.println("qual é o seu nome?");
        nome = teclado.next();
        
        System.out.println("olá " + nome + " é um prazer te conhecer.");
        
        teclado.close();
    }
    
}
