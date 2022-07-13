/* 
	 Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, 
	 sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado 
 por sua posição (ou índice), ou seja: B[i] = A[i] * i.
 */
package aula19.labs;

public class exercicio005 {

	public static void main(String[] args) {
		int [] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int [] B = new int [10];
		
		for (int i = 0; i < A.length; i++) {
			B[i] = A[i] * i; 
			
			System.out.println(B[i]);
		}
	}

}
