import java.util.Random;
import java.util.Scanner;

public class Exercicio032 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random aleatorio = new Random();
		
		System.out.print("tente acertar o numero que eu escolher de 1 a 5: ");
		int numero = teclado.nextInt(); 
		
		int desconhecido = aleatorio.nextInt(5);
		
		desconhecido += 1;
		
		if (desconhecido == numero) {
			System.out.println("Você Acertou! ");
		} else {
			System.out.println("Não foi desta vez, tente novamente! "); 
		}
		
		System.out.println("O numero escolhido foi: " + desconhecido);
		
		teclado.close();
	}
}
