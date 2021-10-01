/*
 Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse 
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba 
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida
 */
package passo.pkg2;

import java.util.Scanner;


public class Exercicio17 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        double multa, vel;
        
        System.out.println("qual é a velocidade do veiculo? ");
        vel = teclado.nextDouble();
        
        if (vel > 80) {
            System.out.println("voce ultrapassou a velocidade permitida.");
            multa = (vel - 80) * 5;
            System.out.println("sua multa será de " + multa + " reais");
        } else {
            System.out.println("voce esta na velocidade permitida.");
        }
    }
    
}
