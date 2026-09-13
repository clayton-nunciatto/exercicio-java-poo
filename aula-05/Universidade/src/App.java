public class App {
    public static void main(String[] args) throws Exception {

        // utilizando o construtor
        Aluno joao = new Aluno(
        "João", 
        12345,
        new double[] {8.5, 7.0, 9.0}
        );
       

        // passando parametro por parametro, somente se tiver um construtor vazio ou não tiver construtor
        Aluno maria = new Aluno();
        maria.nome = "Maria";
        maria.matricula = 12346;
        maria.notas = new double[] {6.0, 5.5, 7.0};

        joao.imprimirBoletim();
        maria.imprimirBoletim();

        System.out.println(joao); // imprime o endereço de memória onde o objeto joão está

    }
}
