package br.exercicios;

public class Turma {
    public static void main(String[] args) {
        System.out.println("Total inicial de alunos: " + Aluno.getTotalMatriculados());

        Aluno a1 = new Aluno("João", 7.5);
        Aluno a2 = new Aluno("Maria", 4.0);
        Aluno a3 = new Aluno("Pedro", 11.0); // Nota inválida (permanece 0.0)

        System.out.println("\n--- Alunos Cadastrados ---");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println("\n--- Corrigindo nota do Pedro ---");
        a3.setNota(8.5);
        System.out.println(a3);

        System.out.println("\n--- Provando o contador de matriculados ---");
        System.out.println("Total de alunos matriculados: " + Aluno.getTotalMatriculados());
    }
}