package lista110exercicios;

/*
107) Crie um programa que leia uma matriz 3x3 de números inteiros e exiba o produto dos elementos da diagonal secundária.
*/

import java.util.Scanner;

public class Exercicio107 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int produtoDiagonalSecundaria = 1;

        // Leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Cálculo do produto dos elementos da diagonal secundária (i + j == 2)
                if (i + j == 2) {
                    produtoDiagonalSecundaria *= matriz[i][j];
                }
            }
        }

        // Exibição do produto dos elementos da diagonal secundária
        System.out.println("O produto dos elementos da diagonal secundária é: " + produtoDiagonalSecundaria);

        scanner.close();
    }
}
