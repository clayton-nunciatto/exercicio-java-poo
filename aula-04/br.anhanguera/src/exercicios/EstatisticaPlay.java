package exercicios;

public class EstatisticaPlay {

	public static void main(String[] args) {
		double[] notas = {8.5, 6.0, 9.5, 7.0, 4.5};

	    double maior = Estatistica.maiorValor(notas);
	    System.out.println("o maior valor é: "+ maior);
	    
	    double menor = Estatistica.menorValor(notas);
	    System.out.println("o menor valor é: "+ menor);
	    
	    double soma = Estatistica.somaValor(notas);
	    System.out.println("a soma dos valores são: "+ soma);
	    
	    double media = Estatistica.mediaValor(notas);
	    System.out.println("a média dos valores são: "+ media);
	    
	    double media2 = Estatistica.media2Valor(notas);
	    System.out.println("a média dos valores são: "+ media2);
	}
}
