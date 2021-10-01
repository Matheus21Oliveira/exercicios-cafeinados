/*
Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13.*/


package exercíciocursoemvideo;

import java.util.Scanner;


public class Exercicio4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2, s;
        
        
        System.out.println("escolha um valor: ");
        n1 = teclado.nextInt();
        
        System.out.println("certo, por favor escolha outro valor: ");
        n2 = teclado.nextInt();
        
        s = n1 + n2;
        
        System.out.println("a soma entre o valor " + n1 + " e " + n2 + " é " + s);
    }
     
           
}
