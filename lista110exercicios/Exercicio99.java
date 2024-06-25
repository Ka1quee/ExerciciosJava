package lista110exercicios;

/*
99) Faça um programa que leia duas matrizes 2x2 de números inteiros e exiba a soma das duas matrizes.
*/

import java.util.Scanner;

public class Exercicio99 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        int[][] matrizSoma = new int[2][2];

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

                // Soma das matrizes
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        // Exibição da matriz soma
        System.out.println("Matriz soma:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizSoma[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}

