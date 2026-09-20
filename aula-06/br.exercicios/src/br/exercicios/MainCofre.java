package br.exercicios;

public class MainCofre {
    public static void main(String[] args) {
        CofrePorcos cofre = new CofrePorcos();

        System.out.println("--- Testando Depósitos ---");
        cofre.depositar(1.00);
        cofre.depositar(0.50);
        cofre.depositar(0.20); // Rejeitado
        cofre.depositar(0.25);

        System.out.println("\n" + cofre);

        System.out.println("\n--- Tentando quebrar com menos de R$ 20,00 ---");
        cofre.quebrar();

        System.out.println("\n--- Adicionando mais moedas para passar de R$ 20,00 ---");
        for (int i = 0; i < 20; i++) {
            cofre.depositar(1.00);
        }

        System.out.println("\n" + cofre);

        System.out.println("\n--- Tentando quebrar novamente ---");
        double valorResgatado = cofre.quebrar();
        System.out.printf("Valor resgatado: R$ %.2f\n", valorResgatado);

        System.out.println("\n" + cofre);
    }
}