package Java_Eclipse_Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio09_Curso {
    private String nome;
    private String horario;
    private List<Exercicio09_Aluno> alunos;
	private Exercicio09_Professora professora;

    public Exercicio09_Curso(String nome, String horario, Exercicio09_Professora professora) {
        this.nome = nome;
        this.horario = horario;
        this.professora = professora;
        this.alunos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Exercicio09_Professora getProfessora() {
        return professora;
    }

    public void setProfessor(Exercicio09_Professora professora) {
        this.professora = professora;
    }

    public List<Exercicio09_Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Exercicio09_Aluno> alunos) {
        this.alunos = alunos;
    }

    public void adicionarAluno(Exercicio09_Aluno aluno) {
        this.alunos.add(aluno);
    }

    public double calcularMediaTurma() {
        double soma = 0;
        for (Exercicio09_Aluno aluno : alunos) {
            soma += aluno.calcularMedia();
        }
        return soma / alunos.size();
    }
}
