/*
	Criar um vetor A com 10 elementos inteiros. Implementar um programa
	que defina e escreva a média aritmética simples dos elementos
	ímpares armazenados neste vetor.
 */
package aula19.labs;

public class exercicio015 {

	public static void main(String[] args) {
		int [] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double media = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 != 0) 
			
			media +=A[i]; 
						
		} 
		
		media /= A.length;
		
		System.out.println(media);
	}
}
