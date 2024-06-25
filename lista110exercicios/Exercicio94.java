package lista110exercicios;

/*
94) Escreva um programa que leia 7 números inteiros e exiba apenas os números pares.
*/

import java.util.Scanner;

public class Exercicio94 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[7];

        // Leitura dos números e exibição dos pares
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }

        scanner.close();
    }
}
