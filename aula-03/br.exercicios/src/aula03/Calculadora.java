/*
 Calculadora.java — leia dois números e um operador (+, -, *, /) e use switch moderno para calcular. 
 Trate a divisão por zero com uma mensagem em vez de deixar quebrar;
 */

package aula03;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Digite a operação: +, -, * ou /");
        String operacao = scanner.next();

        switch (operacao) {
            case "+" -> System.out.println("Resultado da soma: " + (num1 + num2));
            case "-" -> System.out.println("Resultado da subtração: " + (num1 - num2));
            case "*" -> System.out.println("Resultado da multiplicação: " + (num1 * num2));
            case "/" -> {
            	if (num2 != 0) {                    
                    System.out.println("Resultado da divisão: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Divisão por 0 não é permitida.");
                }
            }   
            default -> System.out.println("Operação inválida");
        }
        scanner.close();
		
	}

}
