/*
 Desafio 🌶️ Ingresso.java — leia idade, se é estudante (s/n) e o dia da semana; calcule o preço a partir de final double INTEIRA = 40.0: 
 meia para menores de 18, idosos e estudantes; terça-feira tem 20% de desconto adicional sobre o valor já calculado. 
 Imprima com printf e uma linha explicando quais descontos foram aplicados.
 */

package aula03;

import java.util.Scanner;

public class Ingresso {
    
    static final double INTEIRA = 40.0;

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();

        System.out.print("É estudante? (s/n): ");
        char estudante = scanner.next().charAt(0);
        
        scanner.nextLine();
        
        String diaSemana = "";
        boolean diaValido = false;
        
        while (!diaValido) {
            System.out.print("Digite o dia da semana (ex: terça-feira): ");
            diaSemana = scanner.nextLine().trim().toLowerCase();

            switch (diaSemana) {
                case "segunda-feira", "terça-feira", "quarta-feira", 
                     "quinta-feira", "sexta-feira", "sábado", "domingo" -> diaValido = true;
                default -> System.out.println("Erro: Dia inválido! Tente novamente.\n");
            }
        }    
        
        double preco = INTEIRA;
        boolean temMeia = (idade < 18 || idade >= 60 || estudante == 's' || estudante == 'S');
        boolean temDescontoTerca = diaSemana.equalsIgnoreCase("terça-feira");
        
        if (temMeia) {
            preco /= 2.0; 
        }        
        
        if (temDescontoTerca) {
            preco *= 0.8; 
        }
        
        System.out.printf("\nO valor do ingresso é: R$ %.2f\n", preco);
        
        System.out.print("Descontos aplicados: ");
        if (temMeia && temDescontoTerca) {
            System.out.println("Meia-entrada (idade/estudante) + 20% adicional de Terça-feira.");
        } else if (temMeia) {
            System.out.println("Meia-entrada (idade/estudante).");
        } else if (temDescontoTerca) {
            System.out.println("20% de desconto de Terça-feira.");
        } else {
            System.out.println("Nenhum desconto aplicado (Ingresso Inteira).");
        }
        
        scanner.close();
    }
}