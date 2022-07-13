/* 
	Criar um vetor A com 10 elementos inteiros. Implementar um programa
	que defina e escreva a quantidade de elementos armazenados neste
	vetor que são pares.
 */
package aula19.labs;

public class exercicio011 {

	public static void main(String[] args) {
		int [] A = {  1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				System.out.println(A[i]);
			}			
		}
	}

}
