/*
 Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$) 
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
 */
package exercíciocursoemvideo;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double dl, dn;
        
        System.out.println("quanto de dinheiro voce tem na carteira? ");
        dn = teclado.nextDouble();
        
        dl = dn * 3.45;
        
        System.out.println("voce tem na carteira " + dn + " e conseguirar comprar " + dl + "US$ em dolar");
        
        
        
    }
    
}
