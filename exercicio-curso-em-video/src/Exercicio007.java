/*
 * Crie um algoritmo que leia um numero real e mostre na tela o seu dobro e a 
 * sua terca parte.
 * Ex: 
 * 	Digite um numero: 3.5
 * 	O dobro de 3.5 e 7.0
 * 	A terca parte de 3.5 e 1.16666
 */

import java.util.Scanner;

public class Exercicio007 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        double n, d, t;
        
         System.out.print("escolha um numero ");
        n = teclado.nextDouble();
        
        d = n * 2;
        
        t = n / 3;
        
         System.out.println("o dobro de " + n + " e " + d + " e a terca parte de " + n + " e " + t);
         
         teclado.close();
    }
    
}
