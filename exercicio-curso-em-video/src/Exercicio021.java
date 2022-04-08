/*
 * Faça um algoritmo que leia um determinado ano e mostre se ele é ou não 
 * BISSEXTO
 */

import java.util.Scanner;

public class Exercicio021 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ano;
        
        System.out.println("em que ano deseja se e bissexto ou nao?");
        ano = teclado.nextInt();
        
        if (ano % 4 == 0) {
            System.out.println("este ano e bissexto"); 
        } else {
            System.out.println("este ano nao e bissexto");
        }
        
        teclado.close();
    }
    
}
