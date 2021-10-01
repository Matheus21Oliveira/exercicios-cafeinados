/*
Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
na tela uma das mensagens abaixo:
- O primeiro valor é o maior
- O segundo valor é o maior
- Não existe valor maior, os dois são iguais
 */
package Passo3;

import java.util.Scanner;

public class Exercicio26 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2;
        
        System.out.println("escolha um valor. ");
        n1 = teclado.nextInt();
        
        System.out.println("certo, escolha outro valor. ");
        n2 = teclado.nextInt();
        
        if (n1>n2) {
            System.out.println("o valor " + n1 + " é maior que " + n2);
        } else if(n2>n1) {
            System.out.println("o valor " + n2 + " é maior que " + n1);
        } else {
            System.out.println("os valores " + n1 + " e " + n2 + " sao iguais.");
        }
            
        
       
    }
    
}
