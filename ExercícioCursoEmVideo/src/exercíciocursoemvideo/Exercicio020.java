/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passo.pkg2;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n;
        
        System.out.println("escreva um numero.");
        n = teclado.nextFloat();
        
        if (n % 2 ==0) {
            System.out.println("esse numero é par.");
        } else {
            System.out.println("esse numero é impar.");
        }
    }
    
}
