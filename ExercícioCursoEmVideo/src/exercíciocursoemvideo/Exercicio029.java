/*
 Desenvolva um programa que leia o nome de um funcionário, seu salário,
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
acordo com a tabela a seguir:
- Até 3 anos de empresa: aumento de 3%
- entre 3 e 10 anos: aumento de 12.5%
- 10 anos ou mais: aumento de 20%
 */
package Passo3;

import java.util.Scanner;

public class Exercicio29 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        String funcionario;
        double salario, anos, ns;
        
        System.out.print("qual o nome do funcionario? ");
        funcionario = teclado.nextLine();
        
        System.out.print("qual é salario atual de " + funcionario + "? ");
        salario = teclado.nextDouble();
        
        System.out.print("por quanto tempo " + funcionario + " trabalha na empresa? ");
        anos = teclado.nextDouble();
        
        if (anos < 3) {
            anos = anos * 0.03;
            System.out.println(funcionario + " receberá " + anos);
        } else if (anos <= 10) {
         anos = anos * 12.5;
            System.out.println(funcionario + " receberá " + anos);
    } else {
            anos = anos * 0.20;
            System.out.println(funcionario + " receberá " + anos);
        }
        
    }
    
}
