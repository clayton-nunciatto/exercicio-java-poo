/*
 * Data.java — três construtores sobrecarregados: Data(int dia, int mes, int ano), 
 * Data(int dia, int mes) (ano atual, 2026) e Data() (01/01/2026). Use this(...) 
 * para que os dois primeiros deleguem ao completo, e valide mês de 1 a 12;
 */
package br.exercicios;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor completo (recebe dia, mes e ano)
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        
        // Validação do mês entre 1 e 12
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido (" + mes + "). Definido para 1 (Janeiro) por padrão.");
            this.mes = 1;
        }

        this.ano = ano;
    }

    // Construtor de 2 parâmetros: delega para o completo passando o ano atual (2026)
    public Data(int dia, int mes) {
        this(dia, mes, 2026);
    }

    // Construtor sem parâmetros: delega para o completo com a data padrão 01/01/2026
    public Data() {
        this(1, 1, 2026);
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d", dia, mes, ano);
    }
}