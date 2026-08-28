/*
Desafio 🌶️ Arte.java — imprima um desenho em ASCII (uma casa, um gato, seu nome em letras grandes) 
usando \n, \t e pelo menos um \". Um único System.out.println para o desenho inteiro.


Materil explicado:

System.out.println("Quebra\nde linha");        // \n = nova linha
System.out.println("Coluna1\tColuna2");        // \t = tabulação
System.out.println("Ele disse \"oi\"");        // \" = aspas literal
System.out.println("Barra invertida: \\");     // \\ = uma barra

*/

public class Arte {
    public static void main(String[] args) {
        // Desenho ASCII de uma casa com gato e nome, feito em um único System.out.println
        System.out.println(
            "\t   /\\\n" +
            "\t  /  \\\n" +
            "\t /    \\\n" +
            "\t/------\\\n" +
            "\t| \"__\" |\t   /\\_/\\\n" +
            "\t| |  | |\t  ( o.o )\n" +
            "\t|_|__|_|\t   > ^ <\n\n" +
            "\tClayton  \n"
        );
    }
}