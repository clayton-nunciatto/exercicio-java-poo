/*
 Desafio 🌶️ Imc.java — leia nome, peso e altura do teclado; calcule o IMC (peso / (altura * altura)) e imprima assim: Maria, seu IMC é 21,45. 
 Use nextLine() depois do último número lido e explique num comentário por que ele foi necessário.
 */

package exercicio_5;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome: ");
        String nome = scanner.nextLine();
        
        System.out.println("Digite o peso: ");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura: ");
        double altura = scanner.nextDouble();
        
        System.out.printf("%s, seu IMC é %.2f ", nome, (peso / (altura * altura)));
                
        scanner.close();
	}

}
/*
 A pegadinha clássica do Scanner: nextInt() lê o número mas deixa o Enter para trás. 
 O nextLine() seguinte engole esse Enter e devolve uma string vazia — parece que o programa "pulou" a pergunta. 
 Solução: um scanner.nextLine() extra logo depois do nextInt().
 
 Porém neste caso não tive problemas e não foi preciso usar o comando citado
*/
