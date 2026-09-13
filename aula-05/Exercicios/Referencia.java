/*
Referencia.java — crie um objeto ContaBancaria, atribua a uma segunda variável, 
deposite pela segunda variável e imprima o saldo pela primeira. Explique num comentário o resultado. 
Depois provoque um NullPointerException de propósito e copie a mensagem;
*/

public class Referencia {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("João", 2002, 100.0);
        ContaBancaria c2 = c1;

        c2.depositar(150.0);

        System.out.println("Saldo da primeira variável (c1): R$ " + c1.saldo);

        /*
         * EXPLICAÇÃO DO RESULTADO:
         * O saldo impresso por c1 é R$ 250.0. Isso acontece porque variáveis do tipo objeto guardam 
         * apenas uma referência (endereço de memória) para o objeto. Ao fazer "c2 = c1", c2 passa a 
         * apontar para o mesmo objeto na memória que c1. Assim, qualquer alteração feita por c2 reflete em c1.
         */

        // Provocando NullPointerException de propósito:
        ContaBancaria c3 = null;
        c3.exibirExtrato();

        /*
         * MENSAGEM DO NULLPOINTEREXCEPTION:
         * Exception in thread "main" java.lang.NullPointerException: Cannot invoke "ContaBancaria.exibirExtrato()" because "c3" is null
         *     at Referencia.main(Referencia.java:21)
         */
    }
}