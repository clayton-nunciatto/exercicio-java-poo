/*
 Igualdade.java — leia uma palavra do teclado e compare com "java" de três formas: ==, .equals() e .equalsIgnoreCase().
 Imprima os três resultados e explique num comentário por que o primeiro deu o que deu;
 */

package aula03;

import java.util.Scanner;

public class Igualdade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a palavra java: ");
		String palavra = scanner.nextLine();
		
		boolean teste1 = (palavra == "java");
		System.out.println("Com ==: " + teste1);		
		/* 
        TESTE 1 (==):
        O operador '==' deu 'false' porque ele compara o endereço de memória dos objetos, 
        e não o conteúdo do texto. A String lida pelo Scanner é um novo objeto criado no Heap,
        enquanto "java" é uma constante guardada no String Pool. Como estão em locais de 
        memória diferentes, a comparação 'palavra == "java"' é falsa.
        */
		
		boolean teste2 = (palavra .equals("java"));
		System.out.println("Com .equals(): " + teste2);		
		/* 
        TESTE 2 (.equals()):
        Retorna 'true' apenas se o texto for EXATAMENTE igual (diferencia maiúsculas e minúsculas).
        Compara o CONTEÚDO caractere por caractere.
        Se você digitar "java", dá true. Se digitar "Java" ou "JAVA", dá false.
        */
		
		boolean teste3 = (palavra .equalsIgnoreCase("java"));
		System.out.println("Com .equalsIgnoreCase(): " + teste3);		
		/* 
        TESTE 3 (.equalsIgnoreCase()):
        Retorna 'true' se o texto for igual, IGNORANDO maiúsculas e minúsculas.
        Compara o CONTEÚDO sem diferenciar letras grandes ou pequenas.
        Se você digitar "java", "Java", "JAVA" ou "jAvA", dará sempre true.
        */
	}
}
