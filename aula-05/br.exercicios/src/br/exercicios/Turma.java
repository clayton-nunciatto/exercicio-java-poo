package br.exercicios;

public class Turma {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[] {
            new Aluno("Ana", 8.5, 7.0),
            new Aluno("Bruno", 5.0, 6.0),
            new Aluno("Carla", 9.0, 9.5)
        };

        System.out.println("--- BOLETIM DA TURMA ---");
        for (Aluno aluno : alunos) {
            aluno.exibirBoletim();
        }
    }
}