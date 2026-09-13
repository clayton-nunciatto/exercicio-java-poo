package exercicios;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int contador = 1;

		while (contador <= 5) {          // testa ANTES de cada repetição
		    System.out.println("Repetição " + contador);
		    contador++;                  // 😱 esquecer esta linha = laço infinito
		}
		int opcao;

		do {
		    System.out.println("1 - Cadastrar | 2 - Listar | 0 - Sair");
		    opcao = scanner.nextInt();
		} while (opcao != 0);
		
		for (int i = 1; i <= 5; i++) {
		    System.out.println("Repetição " + i);
		}
		
		for (int i = 1; i <= 10; i++) {
		    System.out.printf("7 x %d = %d%n", i, 7 * i);
		}
		
		for (int i = 1; i <= 10; i++) {
		    if (i % 2 != 0) continue;    // ímpar? pula
		    if (i > 8) break;            // passou de 8? encerra
		    System.out.println(i);       // 2 4 6 8
		}
				
		double[] notas = new double[4];        // 4 posições, todas valendo 0.0
		notas[0] = 8.5;                        // índices começam em ZERO
		notas[1] = 7.0;
		notas[2] = 9.5;
		notas[3] = 6.0;
		for (double n: notas) { 
			System.out.println(n);      
		}

		String[] nomes = {"Ana", "Bruno", "Carla"};   // criando já com valores
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println(nomes[1]);      // mostra a posição 2 do array
		System.out.println(nomes.length);      // 3  ← length é PROPRIEDADE (sem parênteses!)
		//System.out.println(notas[4]);          // 💥 ArrayIndexOutOfBoundsException - exceção não existe esta posição no array
		
		
		// for clássico: quando você precisa do índice
		for (int i = 0; i < notas.length; i++) {
		    System.out.printf("Nota %d: %.1f%n", i + 1, notas[i]);
		}

		// for-each: quando você só quer os valores (mais limpo)
		double soma = 0;
		for (double nota : notas) {            // lê-se "para cada nota em notas"
		    soma += nota;
		}
		System.out.printf("Média: %.2f%n", soma / notas.length);

	}

}
