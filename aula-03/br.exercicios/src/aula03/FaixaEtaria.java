/* FaixaEtaria.java — leia a idade do teclado e classifique: 
criança (0–12), adolescente (13–17), adulto (18–59), idoso (60+). Valide idade negativa;
*/

// sysout + ctrl + spaço = System.out.print
package aula03;

import java.util.Scanner;

public class FaixaEtaria {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a idade: ");
		int idade = scanner.nextInt();
		
		if (idade < 0) {
			System.out.print("Idade inválida ");
		} else if ( idade <= 12) {
			System.out.print("Você é uma criança ");
		} else if ( idade <= 17) {
			System.out.print("Você é um adolescente ");
		} else if ( idade <= 59) {
			System.out.print("Você é um adulto ");
		} else {
			System.out.print("Você é um idoso ");			
		}
	}
}

