package Java_Eclipse_Exercicios;

import java.util.Scanner;

public class Exercicio09_Teste {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Exercicio09_Professora professora = new Exercicio09_Professora("Dra. Marcella", "Ciência da Computação", "marcella@universidade.com");
        Exercicio09_Curso curso = new Exercicio09_Curso("Programação Java", "Noturno", professora);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Informe o nome do(a) aluno(a) " + i + ": ");
            String nome = leitor.nextLine();
            System.out.println("Digite a matrícula do(a) aluno(a) " + i + ": ");
            String matricula = leitor.nextLine();
            Exercicio09_Aluno aluno = new Exercicio09_Aluno(nome, matricula);

            double[] notas = new double[4];
            
            for (int j = 0; j < 4; j++) {
                System.out.println("Informe a nota " + (j + 1) + " do(a) aluno(a) " + i + ": ");
                notas[j] = leitor.nextDouble();
            }
            
            leitor.nextLine(); 
            aluno.setNotas(notas);
            curso.adicionarAluno(aluno);
        }

        for (Exercicio09_Aluno aluno : curso.getAlunos()) {
            System.out.println("Aluno(a): " + aluno.getNome());
            System.out.println("Média: " + aluno.calcularMedia());
            
            if (aluno.estaAprovado()) {
                System.out.println("Situação: Aprovado");
            } else {
                System.out.println("Situação: Reprovado");
            }
            System.out.println();
        }

        System.out.println("Média da turma: " + curso.calcularMediaTurma());
        
        leitor.close();
    }
}
