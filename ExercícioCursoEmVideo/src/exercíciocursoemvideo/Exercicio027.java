/*
Crie um programa que leia duas notas de um aluno e calcule a sua média,
mostrando uma mensagem no final, de acordo com a média atingida:
- Média até 4.9: REPROVADO
- Média entre 5.0 e 6.9: RECUPERAÇÃO
- Média 7.0 ou superior: APROVADO.
 */
package Passo3;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n1, n2, m;
        String nome;
        
        System.out.print("qual é nome do(a) aluno(a)? ");
        nome = teclado.nextLine();
        
        System.out.print("qual é a primeira nota do(a) " + nome + "? ");
        n1 = teclado.nextFloat();
        
        System.out.print("qual é a segunda nota do(a) " + nome + "? ");
        n2 = teclado.nextFloat();
        
        m = (n1 + n2)/2;
        
        System.out.println("a nota de " + nome + " foi " + m);
        
        if (m>7.0) {
            System.out.println("o aluno(a) " + nome + " foi aprovado");
        } else {
            System.out.println("o aluno(a) " + nome + " foi reprovado");
        }
    
    }
    
}
