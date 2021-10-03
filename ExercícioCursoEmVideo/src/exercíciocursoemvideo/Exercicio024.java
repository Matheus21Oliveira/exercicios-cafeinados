/*
Faça um algoritmo que pergunte a distância que um passageiro deseja 
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para 
viagens até 200Km e R$0.45 para viagens mais longas
 */
package Passo3;

import java.util.Scanner;

public class Exercicio24 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        double p, km;
        
        System.out.println("qual é a distancia que deseja percorrer em kilometro? ");
        km = teclado.nextDouble();
        
        if (km <= 200) {
            p = km * 0.50;
        } else {
            p = km * 0.45;
        }
        System.out.println("o valor da passagem será de R$" + p + " reais");
    } 
    
}
