/*
 * ContaBancaria.java + Banco.java — reescreva a conta da Aula 05 com todos os atributos private; ofereça getSaldo() sem setSaldo(), 
 * mais depositar, sacar e toString(). Tente alterar o saldo direto no main e copie o erro do compilador num comentário;
 */

package br.exercicios;

public class ContaBancaria {
    private String titular;
    private int numero;
    private double saldo;

    // Construtor
    public ContaBancaria(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = 0.0;
    }
        
    // Método depositar 
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.\n");
        } else {
            System.out.println("AVISO: O valor do depósito deve ser positivo.\n");
        }
    }

    // Método sacar (sem o prefixo 'set')
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.\n");
        } else {
            System.out.println("AVISO: Saldo insuficiente para realizar o saque de R$ " + valor + "\n");
        }
    }
    
    // Getters
    public String getTitular() {
        return titular;
    }
    
    public int getNumero() {
        return numero;
    }
        
    public double getSaldo() {
        return saldo;
    }
    
    // Método para exibir o extrato
    public void exibirExtrato() {
        System.out.println("--- EXTRATO ---");
        System.out.println("Titular: " + getTitular());
        System.out.println("Conta: " + getNumero());
        System.out.println("Saldo atual: R$ " + getSaldo());
        System.out.println("---------------\n");
    }
    
    // Sobrescrevendo o toString da classe Object
    @Override
    public String toString() {
        return String.format("Titular: %s | Conta: %d | Saldo: R$ %.2f", titular, numero, saldo);
    }
}