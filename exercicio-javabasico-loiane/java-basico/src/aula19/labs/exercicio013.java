/*
	Criar um vetor A com 10 elementos inteiros. Implementar um programa
	que determine a soma dos elementos armazenados neste vetor que
	são múltiplos de 5..
 */
package aula19.labs;

public class exercicio013 {

	public static void main(String[] args) {
		int [] A = { 5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
		int soma = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 5 == 0) 
			
			soma +=A[i]; 
						
		} 
		
		System.out.println(soma);
	}
}
