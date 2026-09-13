/*
 Menu.java — menu em do-while com as opções 
 1 - Somar, 
 2 - Ver histórico de resultados, 
 0 - Sair; 
 guarde os resultados num array de 10 posições e não deixe o programa quebrar ao passar do limite;
 */

package exercicios;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array fixo para no máximo 10 resultados e contador de inserções
        double[] historico = new double[10];
        int totalResultados = 0;
        
        int opcao;

        do {
            System.out.println("\n--- MENU DE OPÇÕES ---");
            System.out.println("1 - Somar");
            System.out.println("2 - Ver histórico de resultados");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // Trava de segurança para não ultrapassar as 10 posições
                    if (totalResultados >= historico.length) {
                        System.out.println("\n[Aviso] Histórico cheio! Não é possível guardar mais resultados.");
                        break;
                    }

                    System.out.print("Digite o primeiro número: ");
                    double n1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double n2 = scanner.nextDouble();

                    double soma = n1 + n2;
                    System.out.printf("Resultado da soma: %.2f%n", soma);

                    // Armazena no array e incrementa o contador
                    historico[totalResultados] = soma;
                    totalResultados++;
                    break;

                case 2:
                    System.out.println("\n--- HISTÓRICO DE RESULTADOS ---");
                    if (totalResultados == 0) {
                        System.out.println("Nenhum resultado registrado ainda.");
                    } else {
                        // Percorre apenas até o total de elementos inseridos
                        for (int i = 0; i < totalResultados; i++) {
                            System.out.printf("%dº resultado: %.2f%n", (i + 1), historico[i]);
                        }
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa... Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}