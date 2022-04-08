/*
 * Desenvolva um programa que leia uma distancia em metros e mostre os valores
 * relativos em outras medidas.
 * Ex:
 * 	Digite uma distancia em metros: 185.72	
 * 	A distancia de 185.7m corresponde a:
 * 	0.18572Km
 * 	1.8572Hm
 * 	18.572Dam
 * 	1857.2dm
 * 	18572.0cm
 * 	185720.0mm
 */

import java.util.Scanner;

public class Exercicio008 {
    public static void main(String[] args) {
         
        Scanner teclado = new Scanner(System.in); 
        double m, dam, hm, km, dm, cm, mm;
     
        System.out.println("digite uma distancia em metros");
        m = teclado.nextDouble();
        
        m = m * 10;
        km = m * 1000;
        hm = m * 100;
        dam = m * 10;
        dm  = m / 10;
        cm = m / 100;
        mm = m / 1000;

        System.out.println("a distancia em metros " + m + " corresponde a " + km + "km " 
        		+ hm + "hm " + dam + "dam " + dm + "dm " + cm + "cm " + mm + "mm");
        
        teclado.close();
    }
    
    
}
