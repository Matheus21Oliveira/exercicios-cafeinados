/*
	Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C,
	onde cada elemento de C é a divisão dos respectivos
	elementos em Ae B, ou seja: C[i] = A[i] / float(B[i]).
 */
package aula19.labs;

public class exercicio009 {

	public static void main(String[] args) {
		int [] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] B = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] C = new int [10];
		
		for (int i = 0; i < A.length; i++) {
			C[i] = A[i] / B[i];
			
			System.out.println(C[i]);
		}
	}

}
