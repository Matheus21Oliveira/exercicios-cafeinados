/*
 * Faca um programa que leia um numero inteiro e mostre o seu antecessor e seu
 * sucessor. Ex:
 * 	Digite um numero: 9
 * 	O antecessor de 9 e 8
 * 	O sucessor de 9 e 10
 */


import java.util.Scanner;

public class Exercicio006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        int n, a, s;
        
        System.out.print("escolha um numero ");
        n = teclado.nextInt();
        
        a = n - 1;
       
        s = n + 1;
        
        System.out.println("o antecessor de " + n + " e " + a + " e o sucessor de " + n + " e " + s);
        
        teclado.close();
    }
}
