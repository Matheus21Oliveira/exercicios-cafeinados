/*
 Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666
 */
package exercíciocursoemvideo;

import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class Exercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        double n, d, t;
        
         System.out.print("escolha um numero ");
        n = teclado.nextDouble();
        
        d = n * 2;
        
        t = n / 3;
        
         System.out.println("o dobro de " + n + " é " + d + " e a terça parte de " + n + " é " + t);
    }
    
}
