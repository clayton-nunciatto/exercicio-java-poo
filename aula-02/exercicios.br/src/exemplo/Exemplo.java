package exemplo;

import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
			
		String nome = null;
					
		Scanner input = new Scanner(System.in);
			
		System.out.println("Digite seu nome: ");
		nome = input.nextLine();
			
		System.out.println("Olá, "+ nome + ". Bem vindo!");
		
		input.close();
	}

}