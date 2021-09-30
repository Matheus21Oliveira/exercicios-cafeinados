/*
Faça um programa que leia a largura e o comprimento de um terreno retangular, 
calculando e mostrando a sua área em m². O programa também
deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
- Abaixo de 100m² = TERRENO POPULAR
- Entre 100m² e 500m² = TERRENO MASTER
- Acima de 500m² = TERRENO VIP
 */
package Passo3;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double largura, comprimento, area;
        
        System.out.print("qual é a largura do terreno? ");
        largura = teclado.nextDouble();
        
        System.out.println("qual é o comprimento do terreno? ");
        comprimento = teclado.nextDouble();
        
        area = comprimento * largura;
        
        System.out.println("o valor da área é de " + area + "m²");
        
        if (area < 100) {
            System.out.println("o terreno é popular");
        } else if (area <= 500) {
            System.out.println("o terreno é master");
        } else {
            System.out.println("o terreno será vip");
        }
    }
}
