/*
Escreva um programa para aprovar ou não o empréstimo bancário para a compra 
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e 
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que 
ela não pode exceder 30% do salário ou então o empréstimo será negado.
 */
package Passo3;

import java.util.Scanner;

public class Exercicio033 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        double casa, salario, ano, meses, valor, porcento;
        
        System.out.print("qual é o valor da casa? ");
        casa = teclado.nextDouble();
        
        System.out.print("qual o seu salário? ");
        salario = teclado.nextDouble();
        
        System.out.print("por quantos anos voce vai pagar o valor da casa? ");
        ano = teclado.nextDouble();
        
         meses = ano;
        
        meses *= 12;
        
        valor = casa / meses;
        
        porcento = salario*0.3;
        
        if (valor > porcento) {
            System.out.print("voce nao conseguirá fazer o emprestimo");
        } else {
            System.out.print("voce conseguirá fazer o emprestimo");
        }
    }
    
}
