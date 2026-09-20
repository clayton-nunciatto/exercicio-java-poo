package br.exercicios;

/*
ContaBancaria.java + Banco.java — atributos titular, numero e saldo; métodos depositar(double valor), 
sacar(double valor) (que só saca se houver saldo, imprimindo aviso caso contrário) e exibirExtrato(). 
Teste os dois cenários de saque;
*/

public class ContaBancaria {
    String titular;
    int numero;
    double saldo;

    public ContaBancaria(String titular, int numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("AVISO: Saldo insuficiente para realizar o saque de R$ " + valor);
        }
    }

    public void exibirExtrato() {
        System.out.println("--- EXTRATO ---");
        System.out.println("Titular: " + titular);
        System.out.println("Conta: " + numero);
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("---------------");
    }
}
