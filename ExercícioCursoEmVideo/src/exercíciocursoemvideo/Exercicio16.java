/*
 Escreva um programa para calcular a redução do tempo de vida de um 
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele 
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule 
quantos dias de vida um fumante perderá e exiba o total em dias.
 */
package exercicios;

import java.util.Scanner;


public class Exercicio16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int d, a;
        float c, aed, v;
        
        System.out.println("quantos cigarros voce fuma ao dia? ");
        d = teclado.nextInt(); 
        
        System.out.println("por quantos anos voce usa cigarro? ");
        a = teclado.nextInt();
        
        c = d * 10;
        
        c = c * 365;
         
        c = c/60;
         
        c = c * 24;
         
        aed = a*365;
         
        v = aed - c;
          
        System.out.println("voce perdera ao total de" + v + " dias"); 
        
    }
    
}
