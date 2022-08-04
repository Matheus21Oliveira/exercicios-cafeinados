package cadastrodealuno;

import java.util.ArrayList;

public class Sala {
    ArrayList lista;
    
    
    public Sala() {
        this.lista = new ArrayList<>(); 
    }
    
    void inserirAluno(Aluno aluno) {
        lista.add(aluno);
    } 
    
    void listarAlunos() {
        System.out.println("Lista de Alunos");
        
        for (Aluno a:lista) {
            
        }
    }
}
