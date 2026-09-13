package exercicios;

public class Runner {

	public static void main(String[] args) {
		double[] notas = {8.5, 7.0, 9.5, 6.0};

	    double media = Media.calcularMedia(notas);      // chama e guarda o retorno
	    System.out.printf("Média: %.2f%n", media);
	    Media.imprimirSituacao(media);
	}
}


