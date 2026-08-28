/*
 Calculadora.java — leia dois números double do teclado com Scanner e imprima soma, subtração, multiplicação, divisão e resto (use %.2f);
 */

package exercicio_4;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha a operação: ");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Resto da divisão");
        
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("Resultado da soma: " + (num1 + num2));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + (num1 - num2));
                break;
            case 3:                
                System.out.println("Resultado da multiplicação: " + (num1 * num2));
                break;
            
            case 4:
                if (num2 != 0) {                    
                    System.out.println("Resultado da divisão: " + (num1 / num2));
                } else {
                    System.out.println("Erro: Divisão por 0 não é permitida.");
                }
                break;
            case 5:
                if (num2 != 0) {                    
                    System.out.println("Resto da divisão: " + (num1 % num2));
                } else {
                    System.out.println("Erro: Divisão por 0 não é permitida.");
                }
                break;
            default:
                System.out.println("Operação inválida");
        }
        scanner.close();
    }

}
