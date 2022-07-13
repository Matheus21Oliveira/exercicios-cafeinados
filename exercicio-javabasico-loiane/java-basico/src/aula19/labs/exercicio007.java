/*
	 Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, 
	 onde cada elemento de C é a subtração dos respectivos elementos em A e B, ou seja: C[i] = A[i] - B[i].
 */
package aula19.labs;

public class exercicio007 {

	public static void main(String[] args) {
		int [] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] B = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] C = new int [10];
		
		for (int i = 0; i < A.length; i++) {
			C[i] = A[i] - B[i];
			
			System.out.println(C[i]);
		}
	}

}
