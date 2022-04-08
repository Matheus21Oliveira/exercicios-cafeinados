/*
 * Faca um programa que leia o nome de uma pessoa e mostre uma mensagem de boasvindas
 * para ela:
 * Ex:
 * 	Qual e o seu nome? Joao da Silva
 * 	Ola Joao da Silva, e um prazer te conhecer!*/


import java.util.Scanner;


public class Exercicio002 {
    public static void main(String[] args) { 
        Scanner teclado = new Scanner(System.in);
        String nome;
        
        System.out.println("Qual e o seu nome?");
        nome = teclado.next();
        
        System.out.println("ola " + nome + " e um prazer te conhecer.");
        
        teclado.close();
    }
    
}
