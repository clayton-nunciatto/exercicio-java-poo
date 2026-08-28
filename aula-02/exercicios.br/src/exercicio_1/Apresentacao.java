
/*
 Apresentacao.java — declare variáveis com seu nome (String), idade (int), altura (double) e se estuda à noite (boolean); 
 imprima uma apresentação em uma frase usando printf, com a altura em 2 casas decimais;
 */
package exercicio_1;

public class Apresentacao {
	
	public static void main(String[] args) {
		
		String nome = "Clayton";
		int idade = 44;
		double altura = 1.82;
		boolean horarioNoturno = true;
			
		System.out.printf("Olá, Eu sou o %s, tenho %d anos, minha altura é %.2f e %s", nome, idade, altura, (horarioNoturno ? "estudo a noite." : "não estudo a noite."));
	}
}
