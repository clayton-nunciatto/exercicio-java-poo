public class Aluno {
    String nome;
    double nota1;
    double nota2;

    // Construtor
    public Aluno(String nome, double nota1, double nota2) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2.0;
    }

    public String obterStatus() {
        return calcularMedia() >= 7.0 ? "Aprovado" : "Reprovado";
    }

    // Método exigido
    public void exibirBoletim() {
        System.out.println("Aluno: " + nome + " | Média: " + calcularMedia() + " | Status: " + obterStatus());
    }
}