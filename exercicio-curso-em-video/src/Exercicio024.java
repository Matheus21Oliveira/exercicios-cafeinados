/*
 * Faca um algoritmo que pergunte a distancia que um passageiro deseja 
 * percorrer em Km. Calcule o preco da passagem, cobrando R$0.50 por Km para 
 * viagens ate 200Km e R$0.45 para viagens mais longas.
 */
import java.util.Scanner;

public class Exercicio024 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        double p, km;
        
        System.out.println("qual e a distancia que deseja percorrer em kilometro? ");
        km = teclado.nextDouble();
        
        if (km <= 200) {
            p = km * 0.50;
        } else {
            p = km * 0.45;
        }
        
        System.out.println("o valor da passagem sera de R$" + p + " reais");
        
        teclado.close();
    } 
    
}
