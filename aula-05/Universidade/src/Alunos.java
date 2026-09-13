public class Alunos {

    // Atributos
    public String nome;
    public int matricula;
    public double[] notas;

    //Construtor com parametros
    public Alunos(String nome, int matricula, double[] notas){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    //Construtor vazio
    public Alunos(){}
    
    // Comportamento
    public double calcularMedia() {
        double soma = 0;
        for (double nota: notas){
            soma += nota;
        }
        return soma / notas.length;
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }


    void imprimirBoletim() {
        System.out.printf("%s (%s) - média %.2f - %s%n",
                nome, matricula, calcularMedia(),
                estaAprovado() ? "APROVADO" : "REPROVADO");
    }
}
