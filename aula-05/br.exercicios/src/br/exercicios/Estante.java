package br.exercicios;

public class Estante {
    public static void main(String[] args) {
        Livro l1 = new Livro("O Hobbit", "J.R.R. Tolkien", 310);
        Livro l2 = new Livro("1984", "George Orwell", 328);
        Livro l3 = new Livro("Dom Casmurro", "Machado de Assis", 256);

        l2.emprestar();

        l1.exibirFicha();
        l2.exibirFicha();
        l3.exibirFicha();
    }
}
