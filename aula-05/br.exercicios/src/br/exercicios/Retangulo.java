package br.exercicios;

/*
Retangulo.java + Geometria.java — a classe recebe base e altura pelo construtor e oferece calcularArea(), 
calcularPerimetro() e ehQuadrado(). 
Crie um Retangulo[] com 3 objetos e imprima a área de todos com um for-each;
*/

public class Retangulo {
    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public boolean ehQuadrado() {
        return base == altura;
    }
}