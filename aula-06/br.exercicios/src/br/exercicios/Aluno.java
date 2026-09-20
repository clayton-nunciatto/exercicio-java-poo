/*
 * Aluno.java + Turma.java — na classe Aluno, o setter de nota deve rejeitar valores fora de 0–10; 
 * adicione um contador static de alunos matriculados e um toString() com nome, 
 * média e situação. Prove no main que o contador funciona;
 */
package br.exercicios;

public class Aluno {
    private static int totalMatriculados = 0;

    private String nome;
    private double nota;

    public Aluno(String nome, double notaInitial) {
        this.nome = nome;
        setNota(notaInitial);
        totalMatriculados++;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    // O setter valida se a nota está entre 0 e 10
    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Nota inválida (" + nota + ") para o aluno " + nome + ". Informe um valor entre 0 e 10.");
        }
    }

    public static int getTotalMatriculados() {
        return totalMatriculados;
    }

    public String getSituacao() {
        if (this.nota >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    @Override
    public String toString() {
        return String.format("Aluno: %s | Nota: %.1f | Situação: %s", nome, nota, getSituacao());
    }
}