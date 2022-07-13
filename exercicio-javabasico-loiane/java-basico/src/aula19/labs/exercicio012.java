/*
	Criar um vetor A com 10 elementos inteiros. Implementar um programa
	que defina e escreva a soma de todos os elementos armazenados
	neste vetor.
 */
package aula19.labs;

public class exercicio012 {

	public static void main(String[] args) {
		int [] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int soma = 0;
		
		for (int i = 0; i < A.length; i++) {
			 soma +=A[i]; 
						
		} 
		
		System.out.println(soma);
	}
}
