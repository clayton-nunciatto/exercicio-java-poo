/*
 Bissexto.java — leia um ano e diga se é bissexto: divisível por 4, exceto se divisível por 100, 
 a não ser que seja divisível por 400. Monte a expressão com &&, || e % (teste com 2024 ✅, 1900 ❌, 2000 ✅);
 */

package aula03;

import java.time.Year;
import java.util.Scanner;

public class Bissexto {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o ano: ");
		int ano = scanner.nextInt();
		
		if (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0)) {
			System.out.printf("%d é um ano bissexto.\n", ano);
	    } else {
	    	System.out.printf("%d não é um ano bissexto.\n", ano);
	    }
		
		// O método static Year.isLeap() faz exatamente a checagem de ano bissexto
        if (Year.isLeap(ano)) {
            System.out.printf("%d é um ano bissexto.\n", ano);
        } else {
            System.out.printf("%d não é um ano bissexto.\n", ano);
        }
		scanner.close();
	}
}
