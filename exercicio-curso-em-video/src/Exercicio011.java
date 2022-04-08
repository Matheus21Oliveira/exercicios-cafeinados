/*
 * Desenvolva uma logica que leia os valores de A, B e C de uma equacao do 
 * segundo grau e mostre o valor de Delta.
 */

import java.util.Scanner;


public class Exercicio011 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
         double a, b, c, delta, x1, x2; 
         
         System.out.print("qual o valor de A? ");
         a = teclado.nextDouble();
         
         System.out.print("qual o valor de B? ");
         b = teclado.nextDouble();
         
         System.out.print("qual o valor de C? ");
         c = teclado.nextDouble();
         
         delta = Math.pow(b, 2) - 4*a*c;
              
         System.out.println("Delta da equação foi: " + delta);
         
         x1 = (-b + Math.sqrt(delta)) / 2*a;
         
         x2 = (-b - Math.sqrt(delta)) / 2*a;
         
         System.out.println("O valor de x' é de: " + x1);
         System.out.println("O valor de x'' é de: " + x2);
         
         teclado.close();
    }
    
    
}
