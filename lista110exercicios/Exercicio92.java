package lista110exercicios;

/*
92) Crie um programa que leia 5 números inteiros e exiba-os em ordem decrescente.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio92 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Leitura dos números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenação dos números em ordem decrescente
        Arrays.sort(numeros);
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}

