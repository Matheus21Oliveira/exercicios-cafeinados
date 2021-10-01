/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passo.pkg2;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ano;
        
        System.out.println("em que ano deseja se é bissexto ou não?");
        ano = teclado.nextInt();
        
        if (ano % 4 == 0) {
            System.out.println("este ano é bissexto"); 
        } else {
            System.out.println("este ano não é bissesxto");
        }
    }
    
}
