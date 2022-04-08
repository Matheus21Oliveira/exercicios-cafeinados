/*
 * Faca um algoritmo que leia a largura e altura de uma parede, calcule e mostre a 
 * area a ser pintada e a quantidade de tinta necessaria para o servico, sabendo 
 * que cada litro de tinta pinta uma area de 2 metros quadrados.
 */

import java.util.Scanner;

public class Exercicio010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         double alt, l, ar, t;
         
         System.out.println("quanto de altura tem sua parede? ");
         alt = teclado.nextDouble();
         
         System.out.println("quanto de largura tem a sua parede? ");
         l = teclado.nextDouble();
         
         ar = alt * l;
         
         t = ar / 2;
         
         System.out.println("na parede tem " + ar + " metros quadrados de area");
         System.out.println("nela sera usado " + t + " litros de tinta");
         
         teclado.close();
    }
    
}
