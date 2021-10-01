/*
 Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10
 */
package exercíciocursoemvideo;

import java.util.Scanner;
/**
 *
 * @author mathe
 */
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        int n, a, s;
        
        System.out.print("escolha um numero ");
        n = teclado.nextInt();
        
        a = n - 1;
       
        s = n + 1;
        
        System.out.println("o antecessor de " + n + " é " + a + " e o sucessor de " + n + " é " + s);
        
    }
}
