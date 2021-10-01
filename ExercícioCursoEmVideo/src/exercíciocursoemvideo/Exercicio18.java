/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passo.pkg2;

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float ano, idade;
        
        System.out.println("Em que ano voce nasceu? ");
        ano = teclado.nextFloat();
        
        idade = 2021 - ano;
        
        if (idade > 18) {
            System.out.println("voto obrigatório.");
        } else if (idade >= 16) {
            System.out.println("voce pode votar, mas não é obrigatório.");       
        } else {
                System.out.println("voce nao tem a idade mínima de 16 anos para votar.");
                }
    }
    
}
