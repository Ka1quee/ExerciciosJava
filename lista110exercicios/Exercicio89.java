package lista110exercicios;

/*
89) Crie um programa que leia 10 números inteiros e exiba a quantidade de números positivos e a quantidade de números negativos.
*/

import java.util.Scanner;

public class Exercicio89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contadorPositivos = 0, contadorNegativos = 0;

        // Leitura dos números e contagem de positivos e negativos
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] > 0) {
                contadorPositivos++;
            } else if (numeros[i] < 0) {
                contadorNegativos++;
            }
        }

        // Exibição das quantidades
        System.out.println("Quantidade de números positivos: " + contadorPositivos);
        System.out.println("Quantidade de números negativos: " + contadorNegativos);

        scanner.close();
    }
}
