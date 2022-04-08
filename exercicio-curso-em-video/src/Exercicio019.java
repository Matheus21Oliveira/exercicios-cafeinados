/*
 * Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua 
 * media e mostre na tela. No final, analise a media e mostre se o aluno teve ou 
 * nao um bom aproveitamento (se ficou acima da media 7.0)
 */

import java.util.Scanner;

public class Exercicio019 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        double m, n1, n2;
        
        System.out.println("qual o nome do aluno(a)? ");
        nome = teclado.nextLine();
        
        System.out.println("qual e a primeira nota do(a) " + nome +"?");
        n1 = teclado.nextDouble();
        
        System.out.println("qual e a segunda nota do(a) " + nome +"?");
        n2 = teclado.nextDouble();
         
        m = (n1 + n2) / 2;
        
        System.out.println("");
        
        if (m >= 7) {
            System.out.println(nome + " esta acima da media com " + m);
        } else {
            System.out.println(nome + " esta abaixo da media com " + m);
        }
        
        teclado.close();
    }
    
}
