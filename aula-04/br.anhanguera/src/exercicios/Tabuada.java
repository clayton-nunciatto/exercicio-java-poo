/*
 Tabuada.java — leia um número e imprima sua tabuada de 1 a 10 formatada com printf; 
 depois imprima as tabuadas de 1 a 10 usando for dentro de for;
 */
package exercicios;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para ver sua tabuada: ");
        int num = scanner.nextInt();
        
        System.out.println("\n--- Tabuada do " + num + " ---");
        
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d x %2d = %3d%n", num, i, num * i);
        }
        
        System.out.println("\n=== Tabuadas de 1 a 10 ===");
        for (int i = 1; i <= 10; i++) {
            System.out.println("\n--- Tabuada do " + i + " ---");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%2d x %2d = %3d%n", i, j, i * j);
            }
        }

        scanner.close();
    }
}