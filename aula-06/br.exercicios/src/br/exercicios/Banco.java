package br.exercicios;

public class Banco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Maria Silva", 1001);
        conta.exibirExtrato();
        
        System.out.println("\n--- Cenário 1: Depósito ---");
        conta.depositar(500.0);
        conta.exibirExtrato();

        System.out.println("\n--- Cenário 2: Saque permitido ---");
        conta.sacar(200.0);
        conta.exibirExtrato();

        System.out.println("\n--- Cenário 3: Saque não permitido ---");
        conta.sacar(400.0);
        conta.exibirExtrato();
        
        System.out.println("\n--- Cenário 4: Exibindo o objeto com toString() ---");
        System.out.println(conta);
        
        /* Tentando acessar o saldo diretamente, gera o erro de compilação:
        
        conta.saldo = 1500;
        
        Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
        	The field ContaBancaria.saldo is not visible
        	at br.exercicios/br.exercicios.Banco.main(Banco.java:23)
        */
        
        System.out.println("\n--- Cenário 5: Depósito final ---");
        conta.depositar(600.0);
        conta.exibirExtrato();
    }
}