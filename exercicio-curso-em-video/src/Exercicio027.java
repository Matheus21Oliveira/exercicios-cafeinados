/*
 * Crie um programa que leia duas notas de um aluno e calcule a sua media,
 * mostrando uma mensagem no final, de acordo com a media atingida:
 * 	- Media até 4.9: REPROVADO
 * 	- Media entre 5.0 e 6.9: RECUPERAÇÃO
 * 	- Media 7.0 ou superior: APROVADO.
 */

import java.util.Scanner;

public class Exercicio027 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float n1, n2, m;
        String nome;
        
        System.out.print("qual e nome do(a) aluno(a)? ");
        nome = teclado.nextLine();
        
        System.out.print("qual e a primeira nota do(a) " + nome + "? ");
        n1 = teclado.nextFloat();
        
        System.out.print("qual e a segunda nota do(a) " + nome + "? ");
        n2 = teclado.nextFloat();
        
        m = (n1 + n2)/2;
        
        System.out.println("a nota de " + nome + " foi " + m);
        
        if (m>7.0) {
            System.out.println("o aluno(a) " + nome + " foi aprovado");
        } else {
            System.out.println("o aluno(a) " + nome + " foi reprovado");
        }
    
        teclado.close();
    }
    
}
