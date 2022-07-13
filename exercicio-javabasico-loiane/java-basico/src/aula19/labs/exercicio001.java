/* 
	Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
	mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
	seja, B[i] = A[i]. 
*/

package aula19.labs;

public class exercicio001 {

	public static void main(String[] args) {		
		int [] A = {1, 2, 3, 4, 5};		
		
		int [] B = new int [5]; 
		
		for (int i = 0; i < A.length; i++) {
			B[i] = A[i];
			
			System.out.println(B[i]);
		}
	}

}
