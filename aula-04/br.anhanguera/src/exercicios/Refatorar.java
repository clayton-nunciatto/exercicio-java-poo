/*
 Refatorar.java — copie o código abaixo (que faz tudo dentro do main) 
 e extraia pelo menos 3 métodos com nomes claros; 
 o main final deve ter no máximo 6 linhas:
 
 public static void main(String[] args) {
    int[] valores = {4, 7, 2, 9, 3};
    int soma = 0;
    for (int v : valores) soma += v;
    int maior = valores[0];
    for (int v : valores) if (v > maior) maior = v;
    int pares = 0;
    for (int v : valores) if (v % 2 == 0) pares++;
    System.out.println(soma + " " + maior + " " + pares);
}
*/

package exercicios;

public class Refatorar {
    
    public static int somarValores(int[] valores) {
        int soma = 0;
        for (int v : valores) 
        	soma += v;
        return soma;
    }
    
    public static int maiorValor(int[] valores) {
        int maior = valores[0];
        for (int v : valores) 
        	if (v > maior) 
        		maior = v;
        return maior;
    }
    
    public static int contarPares(int[] valores) {
        int pares = 0;
        for (int v : valores) 
        	if (v % 2 == 0) 
        		pares++;
        return pares;
    }

    public static void main(String[] args) {
        int[] valores = {4, 7, 2, 9, 3};
        int soma = somarValores(valores);
        int maior = maiorValor(valores);
        int pares = contarPares(valores);
        System.out.println(soma + " " + maior + " " + pares);
    }
}