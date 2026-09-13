/*
 Estatisticas.java — dado double[] notas = {8.5, 6.0, 9.5, 7.0, 4.5};, 
 calcule e imprima maior, menor, soma e média — sem usar biblioteca pronta, 
 e cada cálculo em seu próprio método static;
 */

package exercicios;

public class Estatistica {
	
    public static double maiorValor(double[] valores) {
        double maior = valores[0];
        for (double v : valores) {
            if (maior < v) {
            	maior = v;
            }
        }
        return maior;
    }
    
    public static double menorValor(double[] valores) {
        double menor = valores[0];
        for (double v : valores) {
            if (menor > v) {
            	menor = v;
            }
        }
        return menor;
    }
    
    public static double somaValor(double[] valores) {
    	double soma = 0;
        for (double v : valores) {
            soma += v;
        }
        return soma;
    }
    
    public static double mediaValor(double[] valores) {
    	double soma = 0;
        for (double v : valores) {
            soma += v;
        }
        return soma / valores.length;
    }
    
    public static double media2Valor(double[] valores) {
        return somaValor(valores) / valores.length;
    }
}