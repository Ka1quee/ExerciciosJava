package lista110exercicios;

/*
102) Faça um programa que leia duas matrizes 2x2 de números inteiros e exiba o produto entre elas.
*/

import java.util.Scanner;

public class Exercicio102 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[2][2];
        int[][] matrizB = new int[2][2];
        int[][] matrizProduto = new int[2][2];

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

                // Cálculo do produto das matrizes
                matrizProduto[i][j] = matrizA[i][j] * matrizB[i][j];
            }
        }

        // Exibição da matriz produto
        System.out.println("Matriz produto:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrizProduto[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}

