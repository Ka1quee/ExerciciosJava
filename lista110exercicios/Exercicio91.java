package lista110exercicios;
/*
91) Escreva um programa que leia 10 números inteiros e exiba a soma dos valores positivos e a soma dos valores negativos.
*/

import java.util.Scanner;

public class Exercicio91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int somaPositivos = 0, somaNegativos = 0;

        // Leitura dos números e soma de positivos e negativos
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] > 0) {
                somaPositivos += numeros[i];
            } else {
                somaNegativos += numeros[i];
            }
        }

        // Exibição das somas
        System.out.println("Soma dos valores positivos: " + somaPositivos);
        System.out.println("Soma dos valores negativos: " + somaNegativos);

        scanner.close();
    }
}

