package lista110exercicios;

/*
101) Crie um programa que leia uma matriz 4x4 de números inteiros e exiba a média aritmética dos elementos.
*/

import java.util.Scanner;

public class Exercicio101 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        double somaElementos = 0;
        int totalElementos = 4 * 4; // Total de elementos na matriz

        // Leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
                somaElementos += matriz[i][j];
            }
        }

        // Cálculo da média aritmética
        double media = somaElementos / totalElementos;

        // Exibição da média aritmética
        System.out.println("A média aritmética dos elementos da matriz é: " + media);

        scanner.close();
    }
}
