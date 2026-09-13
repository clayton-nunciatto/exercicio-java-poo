/*
Livro.java + Estante.java — a classe Livro tem titulo, autor, p
aginas e disponivel, mais os métodos emprestar(), devolver() e exibirFicha(). 
No main de Estante, crie 3 livros, empreste um e exiba as três fichas;
*/

public class Livro {
    String titulo;
    String autor;
    int paginas;
    boolean disponivel;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.disponivel = true;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("O livro \"" + titulo + "\" foi emprestado.");
        } else {
            System.out.println("O livro \"" + titulo + "\" já está emprestado.");
        }
    }

    public void devolver() {
        disponivel = true;
        System.out.println("O livro \"" + titulo + "\" foi devolvido.");
    }

    public void exibirFicha() {
        System.out.println("--- FICHA DO LIVRO ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Páginas: " + paginas);
        System.out.println("Status: " + (disponivel ? "Disponível" : "Emprestado"));
        System.out.println("----------------------");
    }
}