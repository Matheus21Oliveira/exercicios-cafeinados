package cadastrodealuno;



public class Aluno {
    String nome, matricula;
    public Aluno(String nome, String matricula) {
       setNome(nome);
       setMatricula(matricula);
    }
    
    public Aluno() {
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    void listar() {
        System.out.println("Nome: " + this.getNome());
    }
}
