public class Geometria {
    public static void main(String[] args) {
        Retangulo[] retangulos = new Retangulo[3];
        retangulos[0] = new Retangulo(5.0, 10.0);
        retangulos[1] = new Retangulo(4.0, 4.0);
        retangulos[2] = new Retangulo(3.0, 7.5);

        for (Retangulo r : retangulos) {
            System.out.println("Área: " + r.calcularArea() + " (É quadrado? " + r.ehQuadrado() + ")");
        }
    }
}
