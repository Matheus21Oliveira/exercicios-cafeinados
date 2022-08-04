package cadastrodealuno;

import java.util.Scanner;

public class CadastroDeAluno {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno aluno = new Aluno();
        int opçao, quantidade;
        float nota = 0;
        String nome,  matricula;
        
        do {
            System.out.println("\n--------------------------");
            System.out.println("         Menu");
            System.out.println("Escolha uma opção: ");
            System.out.println("1- inserir aluno");
            System.out.println("2- listar aluno");
            System.out.println("3- situações");
            System.out.println("0- sair");
            
            opçao = teclado.nextInt();
            teclado.nextLine();
            
            switch (opçao) {
                case 1:
                    System.out.println("Nome: ");
                    nome = teclado.nextLine();
                    System.out.println("Matrícula: ");
                    matricula = teclado.nextLine();
                    
                    System.out.println("Quantas notas voce quer colocar para " + nome + ":");
                    quantidade = teclado.nextInt();
                    
                    for (int i = 0; i < quantidade; i++) {
                        System.out.println("Nota " + (i + 1));
                        nota = teclado.nextFloat();
                }
                    break;
                
                case 2:
                    break;
                 
                case 3:
                   break;    
                    
                case 0:
                   System.out.println("\nSaindo...");
                   break;    
                 
                default:
                    System.out.println("\n Opção errada!");
            }
            
            
            
        } while (opçao != 0);
    }
    
}
