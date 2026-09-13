package exercicios;

public class Media {

    // ┌ visível de fora
    // │      ┌ pertence à classe (não a um objeto) — por enquanto, sempre static
    // │      │      ┌ tipo do que devolve (void = não devolve nada)
    // │      │      │      ┌ nome (verbo, camelCase)     ┌ parâmetros
    public static double calcularMedia(double[] valores) {
        double soma = 0;
        for (double v : valores) {
            soma += v;
        }
        return soma / valores.length;      // devolve o resultado
    }

    public static void imprimirSituacao(double media) {
        System.out.println(media >= 7 ? "Aprovado" : "Reprovado");
    }
}
