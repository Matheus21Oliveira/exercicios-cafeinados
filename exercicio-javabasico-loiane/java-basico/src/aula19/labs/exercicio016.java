/*
	Criar um vetor A com 10 elementos inteiros. Implementar um programa
	que defina e escreva a média aritmética simples dos elementos
	ímpares armazenados neste vetor.
 */
package aula19.labs;

public class exercicio016 {

	public static void main(String[] args) {
		int [] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int menor = 0, igual = 0, maior = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] < 15) {
				menor -= A[i];
			}else if (A[i] > 15) {
				maior += A[i];
			} else if (A[i] == 15) {
				igual = A[i];
			}
		} 
		System.out.println("Valores menores de 15: " + menor);
		System.out.println("Valores maiores de 15: " + maior);
		System.out.println("Valores iguais á 15: " + igual);
	}
}
