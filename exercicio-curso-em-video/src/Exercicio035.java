/*
 * Uma empresa de aluguel de carros precisa cobrar pelos seus servicos. O 
 * aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para 
 * carro de luxo. Alem disso, o cliente paga por Km percorrido. Faca um programa
 * que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e 
 * quantos Km foram percorridos. No final mostre o preco a ser pago de acordo com a 
 * tabela a seguir:
 * 	- Carros populares (aluguel de R$90 por dia)
 * 		- Ate 100Km percorridos: R$0,20 por Km
 * 		- Acima de 100Km percorridos: R$0,10 por Km
 * 	- Carros de luxo (aluguel de R$150 por dia)
 * 		- Ate 200Km percorridos: R$0,30 por Km
 * 		- Acima de 200Km percorridos: R$0,25 por Km
 */

import java.util.Scanner;

public class Exercicio035 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float km;
        int dia, aluguel;
        String carro;
        
        System.out.println("que tipo de carro deseja alugar luxo ou popular?");
        carro = teclado.nextLine();
        
        System.out.println("por qunatos dias deseja alugar?");
        dia = teclado.nextInt();
        
        System.out.println("quantos quilometros sera utilizado com o carro?");
        km = teclado.nextFloat();
        
        aluguel = 0;
        
        if ("popular".equals(carro)) {
           aluguel = 90 * dia; 
           
           if (km <= 100) {
               aluguel += 0.20;
           } else if (km > 100) {
               aluguel += 0.10;
           }
         } else if ("luxo".equals(carro)) {
             aluguel = 150 * dia;
             if (km <= 200) {
                 aluguel += 0.30;
             } else if (km > 200) {
                 aluguel += 0.25;
             }
         } 
        System.out.println("o valor do aluguel do carro sera de " + aluguel);
        
        teclado.close();
    }
    
}
