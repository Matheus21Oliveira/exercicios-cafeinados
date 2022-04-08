/*
 * Faca um algoritmo que leia o salario de um funcionario, calcule e mostre o 
 * seu novo salario, com 15% de aumento.
 */

import java.util.Scanner;

public class Exercicio013 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String f;
        double a, s, p;
        
        System.out.println("qual e o nome do funcionario? ");
        f = teclado.next();
        
        System.out.println("qual o valor do salario de " + f + "?");
        s = teclado.nextDouble();
        
        a = s * 0.15;
        
        p = s + a;
        
        System.out.println("valor do salario de " + f + " e R$" + p);
        
        teclado.close();
        
    }
    
}
