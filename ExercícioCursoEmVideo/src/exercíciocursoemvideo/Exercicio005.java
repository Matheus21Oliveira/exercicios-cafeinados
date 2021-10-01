/*
 Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5
 */
package exercíciocursoemvideo;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);   
    double m1, m2, m;
        
        System.out.println("qual é a primeira nota do aluno?");
        m1 = teclado.nextDouble();
        
        System.out.println("qual é a segunda nota do aluno?");
        m2 = teclado.nextDouble();
        
        m = (m1 + m2)/2;
        
        System.out.println("a média entre " + m1 + " e " + m2 + " é igual á " + m);
    }
        
    
}
