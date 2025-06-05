import java.util.ArrayList;
import java.util.List;

class Turma {
    private String nome;
    private String termo;
    private List<Aluno> alunos;

    public Turma(String nome, String termo) {
        this.nome = nome;
        this.termo = termo;
        this.alunos = new ArrayList<>();
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public String getNome() {
        return nome;
    }

    public String getTermo() {
        return termo;
    }

    @Override
    public String toString() {
        return nome + " - " + termo + "º termo";
    }
}
