/*
O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no 
peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o 
indivíduo dentro de certas faixas.
 - abaixo de 18.5: Abaixo do peso
 - entre 18.5 e 25: Peso ideal
 - entre 25 e 30: Sobrepeso
 - entre 30 e 40: Obesidade
 - acima de 40: Obseidade mórbida
 */
package exercicio034;

import java.util.Scanner;

public class Exercicio034 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float peso, altura, imc;
        
        System.out.println("qual é o seu peso? ");
        peso = teclado.nextFloat();
        
        System.out.println("qual é o sua altura? ");
        altura = teclado.nextFloat();
        
        imc = (float) (peso / (Math.pow (altura,2)));
        
       if (imc < 18.5) {
           System.out.println("voce esta abaixo do peso");
       } else if (imc <= 25) {
               System.out.println("voce esta com peso ideal");
               } else if (imc <= 30){
                   System.out.println("voce esta com sobrepeso");
               } else if (imc < 40) {
                   System.out.println("voce esta com obesidade");
               } else {
                   System.out.println("voce esta com obesidade mórbida");
               }
    }
    
}
