/*
 * Desafio 🌶️ CofrePorcos.java — um cofre que aceita moedas de 5, 10, 25, 50 centavos e R$ 1,00 
 * (qualquer outro valor é rejeitado com aviso), guarda o total, 
 * conta quantas moedas de cada tipo entraram e só permite quebrar() se o total passar de R$ 20,00 — zerando tudo e devolvendo o valor. 
 * Nenhum atributo público, nenhum setter.
 */
package br.exercicios;

public class CofrePorcos {
    private double saldoTotal;
    
    // Contadores de cada tipo de moeda
    private int qtd5centavos;
    private int qtd10centavos;
    private int qtd25centavos;
    private int qtd50centavos;
    private int qtd1real;

    public CofrePorcos() {
        this.saldoTotal = 0.0;
        this.qtd5centavos = 0;
        this.qtd10centavos = 0;
        this.qtd25centavos = 0;
        this.qtd50centavos = 0;
        this.qtd1real = 0;
    }

    // Método para depositar moedas aceitando apenas valores válidos
    public void depositar(double valor) {
        if (valor == 0.05) {
            qtd5centavos++;
            saldoTotal += valor;
            System.out.println("Moeda de R$ 0,05 depositada.");
        } else if (valor == 0.10) {
            qtd10centavos++;
            saldoTotal += valor;
            System.out.println("Moeda de R$ 0,10 depositada.");
        } else if (valor == 0.25) {
            qtd25centavos++;
            saldoTotal += valor;
            System.out.println("Moeda de R$ 0,25 depositada.");
        } else if (valor == 0.50) {
            qtd50centavos++;
            saldoTotal += valor;
            System.out.println("Moeda de R$ 0,50 depositada.");
        } else if (valor == 1.00) {
            qtd1real++;
            saldoTotal += valor;
            System.out.println("Moeda de R$ 1,00 depositada.");
        } else {
            System.out.printf("AVISO: Valor R$ %.2f não aceito. Aceitamos apenas moedas de 0.05, 0.10, 0.25, 0.50 e 1.00.\n", valor);
        }
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }

    // Só permite quebrar se o total passar de R$ 20,00
    public double quebrar() {
        if (saldoTotal > 20.00) {
            double valorDevolvido = saldoTotal;
            
            // Reseta o cofre
            saldoTotal = 0.0;
            qtd5centavos = 0;
            qtd10centavos = 0;
            qtd25centavos = 0;
            qtd50centavos = 0;
            qtd1real = 0;

            System.out.println("\n*** COFRE QUEBRADO! ***");
            return valorDevolvido;
        } else {
            System.out.printf("O cofre ainda não pode ser quebrado. Saldo atual: R$ %.2f (Necessário mais de R$ 20,00).\n", saldoTotal);
            return 0.0;
        }
    }

    @Override
    public String toString() {
        return String.format(
            "--- Status do Cofre ---\n" +
            "Moedas de 5c: %d\n" +
            "Moedas de 10c: %d\n" +
            "Moedas de 25c: %d\n" +
            "Moedas de 50c: %d\n" +
            "Moedas de R$ 1: %d\n" +
            "Total acumulado: R$ %.2f\n" +
            "-----------------------",
            qtd5centavos, qtd10centavos, qtd25centavos, qtd50centavos, qtd1real, saldoTotal
        );
    }
}