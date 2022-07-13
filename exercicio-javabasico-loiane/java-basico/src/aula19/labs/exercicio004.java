/* 
Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
mesmo tamanho, sendo que cada elemento do vetor B deverá ser a
raiz quadrada do respectivo elemento de A, ou seja: B[i] = sqrt(A[i]).
 */

package aula19.labs;

public class exercicio004 {

	public static void main(String[] args) {		
		int [] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		double [] B = new double [15];
		
		for (int i = 0; i < A.length; i++) {
			B[i] = Math.sqrt(A[i]);
			
			System.out.println(B[i]);
						
		}
	}
}
