/*
 * Crie um programa que leia o preco de um produto, calcule e mostre o seu 
 * PRECO PROMOCIONAL, com 5% de desconto.
 */
import java.util.Scanner;


public class Exercicio012 { 
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         String p;
         double d, v, pr;
         
         System.out.println("qual o nome do produto? ");
         p = teclado.next();
         
         System.out.println("qual e o valor de " + p + "? ");
         v = teclado.nextDouble();
         
         d = v * 0.5;
         
         pr = v - d;
         
         System.out.println("valor promocional de " + p + " e R$" + pr);
         
         teclado.close();
        }

    
    }
    

