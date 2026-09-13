/*
 Desafio 🌶️ Boletim.java — leia o nome e 3 notas de 3 alunos usando arrays paralelos (String[] nomes, double[][] notas), 
 calcule a média de cada um e imprima um boletim alinhado com printf. 
 Ao terminar, escreva num comentário o que foi mais chato nessa abordagem — na próxima aula você resolve isso com uma classe.
 */


package exercicios;

import java.util.Scanner;

public class Boletim {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays paralelos
        String[] nomes = new String[3];
        double[][] notas = new double[3][3];
        double[] medias = new double[3];

        // Leitura dos dados
        for (int i = 0; i < 3; i++) {
            System.out.printf("Digite o nome do %dº aluno: ", (i + 1));
            nomes[i] = scanner.nextLine();

            double soma = 0;
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite a %dª nota de %s: ", (j + 1), nomes[i]);
                notas[i][j] = scanner.nextDouble();
                soma += notas[i][j];
            }
            scanner.nextLine(); // Limpa o buffer do scanner após ler os doubles

            medias[i] = soma / 3.0;
            System.out.println();
        }

        // Impressão do Boletim Alinhado
        System.out.println("=======================================================");
        System.out.printf("%-15s | %-6s | %-6s | %-6s | %-6s%n", "ALUNO", "NOTA 1", "NOTA 2", "NOTA 3", "MÉDIA");
        System.out.println("-------------------------------------------------------");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s | %6.1f | %6.1f | %6.1f | %6.1f%n", 
                nomes[i], notas[i][0], notas[i][1], notas[i][2], medias[i]);
        }
        
        System.out.println("=======================================================");

        scanner.close();
    }
}

/*
 * ==============================================================================
 * O QUE FOI MAIS CHATO NESSA ABORDAGEM:
 * 
 * 1. Falta de coesão e risco de dessincronização: Os dados de um único aluno 
 *    (nome, notas e média) estão "desconectados" em 3 arrays diferentes. Se você 
 *    ordenar o array de nomes por ordem alfabética, terá que mover manualmente 
 *    as linhas equivalentes da matriz de notas e a posição do array de médias, 
 *    caso contrário os dados de um aluno passarão a pertencer a outro.
 * 
 * 2. Manipulação de índices: Ficar controlando múltiplos índices (i para aluno, 
 *    j para nota) deixa o código verboso e propenso a erros de vazamento de limites.
 * 
 * Com uma classe (ex: Aluno), poderíamos agrupar nome, notas e o método de calcular 
 * a média dentro de um único objeto, eliminando a necessidade desses arrays paralelos.
 * ==============================================================================
 */