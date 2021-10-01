/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passo.pkg2;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        double m, n1, n2;
        
        System.out.println("qual o nome do aluno(a)? ");
        nome = teclado.nextLine();
        
        System.out.println("qual é a primeira nota do(a) " + nome +"?");
        n1 = teclado.nextDouble();
        
        System.out.println("qual é a segunda nota do(a) " + nome +"?");
        n2 = teclado.nextDouble();
         
        m = (n1 + n2) / 2;
        
        System.out.println("");
        
        if (m >= 7) {
            System.out.println(nome + " esta acima da média com " + m);
        } else {
            System.out.println(nome + " esta abaixo da média com " + m);
        }
    }
    
}
