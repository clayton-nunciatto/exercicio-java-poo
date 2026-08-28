/*
Conversor.java — dada final double COTACAO = 5.42; e um valor em dólares, imprima o valor em reais formatado. 
Depois converta uma temperatura de Celsius para Fahrenheit (F = C * 9/5 + 32) — cuidado: por que 9/5 dá 1? Conserte;
*/

package exercicio_2;

import java.util.Scanner;


public class Conversor {
	
	static final double COTACAO = 5.42;

	public static void main(String[] args) {
				
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor em Dólares: U$ ");
		double valorDollar = input.nextDouble();
			
		System.out.printf("O valor de U$ %.2f representa R$ %.2f\n\n\n", valorDollar, (valorDollar * COTACAO));
        
		System.out.print("Digite a temperatura em graus Celsius: ");
		double temperatura = input.nextDouble();
		
		System.out.printf("A temperatura de %.0fº Celsius representa %.0fº Fahrenheit\n", temperatura, ((temperatura * (9.0/5.0)) + 32));
		
        input.close();
	}

}
