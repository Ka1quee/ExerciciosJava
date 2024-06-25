package lista110exercicios;

/*
97) Escreva um programa que leia uma matriz 2x2 de números inteiros e calcule a soma de todos os elementos.
*/

import java.util.Scanner;

public class Exercicio97 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        int soma = 0;

        // Leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        }

        // Exibição da soma dos elementos
        System.out.println("A soma dos elementos da matriz é: " + soma);

        scanner.close();
    }
}
