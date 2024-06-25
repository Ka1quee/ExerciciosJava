package lista110exercicios;

/*
106) Escreva um programa que leia duas matrizes 2x2 de números inteiros e verifique se elas são iguais.
*/

import java.util.Scanner;

public class Exercicio106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        boolean saoIguais = true;

        // Leitura da primeira matriz
        System.out.println("Digite os elementos da primeira matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizA[i][j] = scanner.nextInt();
            }
        }

        // Leitura da segunda matriz
        System.out.println("Digite os elementos da segunda matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matrizB[i][j] = scanner.nextInt();

                // Verifica se os elementos correspondentes são iguais
                if (matrizA[i][j] != matrizB[i][j]) {
                    saoIguais = false;
                }
            }
        }

        // Exibição do resultado
        if (saoIguais) {
            System.out.println("As matrizes são iguais.");
        } else {
            System.out.println("As matrizes não são iguais.");
        }

        scanner.close();
    }
}
