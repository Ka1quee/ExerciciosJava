package lista110exercicios;

/*
108) Faça um programa que leia uma matriz 4x4 de números inteiros e exiba o maior valor presente em cada linha.
*/

import java.util.Scanner;

public class Exercicio108 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        // Leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Cálculo do maior valor de cada linha
        int[] maiorValorPorLinha = new int[4];
        for (int i = 0; i < 4; i++) {
            maiorValorPorLinha[i] = matriz[i][0]; // Inicializa com o primeiro elemento da linha
            for (int j = 1; j < 4; j++) {
                if (matriz[i][j] > maiorValorPorLinha[i]) {
                    maiorValorPorLinha[i] = matriz[i][j];
                }
            }
        }

        // Exibição do maior valor de cada linha
        System.out.println("Maior valor presente em cada linha:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Linha " + i + ": " + maiorValorPorLinha[i]);
        }

        scanner.close();
    }
}
