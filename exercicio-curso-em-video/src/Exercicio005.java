/*
 * Faca um programa que leia as duas notas de um aluno em uma materia e mostre
 * na tela a sua media na disciplina. Ex:
 * 	Nota 1: 4.5
 * 	Nota 2: 8.5
 * 	A media entre 4.5 e 8.5 e igual a 6.5
 */

import java.util.Scanner;

public class Exercicio005 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);   
    double m1, m2, m;
        
        System.out.println("qual e a primeira nota do aluno?");
        m1 = teclado.nextDouble();
        
        System.out.println("qual e a segunda nota do aluno?");
        m2 = teclado.nextDouble();
        
        m = (m1 + m2)/2;
        
        System.out.println("a media entre " + m1 + " e " + m2 + " e igual a " + m);
        
        teclado.close();
    }
        
    
}
