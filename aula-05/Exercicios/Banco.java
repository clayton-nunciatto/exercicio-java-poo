public class Banco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Maria Silva", 1001, 500.0);

        System.out.println("--- Cenário 1: Saque permitido ---");
        conta.sacar(200.0);
        conta.exibirExtrato();

        System.out.println("\n--- Cenário 2: Saque não permitido ---");
        conta.sacar(400.0);
        conta.exibirExtrato();
    }
}