package lista110exercicios;

/*
98) Crie um programa que leia uma matriz 3x3 de números inteiros e exiba a soma dos elementos da diagonal principal.
*/

import java.util.Scanner;

public class Exercicio98 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaDiagonalPrincipal = 0;

        // Leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Soma dos elementos da diagonal principal (i == j)
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }
            }
        }

        // Exibição da soma dos elementos da diagonal principal
        System.out.println("A soma dos elementos da diagonal principal é: " + somaDiagonalPrincipal);

        scanner.close();
    }
}
