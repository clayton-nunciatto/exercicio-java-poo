package br.exercicios;

public class MainData {
    public static void main(String[] args) {
        Data d1 = new Data(15, 10, 2024); // Usa o construtor completo
        Data d2 = new Data(20, 5);         // Usa o construtor (dia, mes) -> ano 2026
        Data d3 = new Data();               // Usa o construtor padrão -> 01/01/2026
        Data d4 = new Data(10, 15);        // Mês inválido (15)

        System.out.println("Data 1: " + d1);
        System.out.println("Data 2: " + d2);
        System.out.println("Data 3: " + d3);
        System.out.println("Data 4: " + d4);
    }
}