package lista110exercicios;

/*
103) Escreva um programa que leia uma matriz 3x3 de números inteiros e exiba o menor valor presente na matriz.
*/

import java.util.Scanner;

public class Exercicio103 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int menorValor = Integer.MAX_VALUE; // Inicializa com o maior valor possível para int

        // Leitura dos elementos da matriz
        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();

                // Verifica se o elemento é o menor encontrado até agora
                if (matriz[i][j] < menorValor) {
                    menorValor = matriz[i][j];
                }
            }
        }

        // Exibição do menor valor da matriz
        System.out.println("O menor valor presente na matriz é: " + menorValor);

        scanner.close();
    }
}
