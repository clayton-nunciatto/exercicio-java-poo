/*
Corrigir.java — crie um arquivo Corrigir.java cuja classe se chama Consertar. 
Rode javac, leia o erro, e escreva num comentário qual é a regra do Java que foi violada. Depois corrija;


public class Consertar {
	public static void main(String[] args) {
		System.out.println("Testando erro");
	}
}

Corrigir.java:6: error: class Consertar is public, should be declared in a file named Consertar.java
public class Consertar {
       ^
1 error

*/

// Este erro se deu por conta da classe estar com o nome diferente do nome do arquivo

// Segue arquivo corrigido


public class Corrigir {
	public static void main(String[] args) {
		System.out.println("Testando erro");
	}
}