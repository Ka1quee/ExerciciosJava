package lista110exercicios;

/*
84) Faça um programa que leia 5 números inteiros e exiba quantos deles são pares.
*/

import java.util.Scanner;

public class Exercicio84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int contadorPares = 0;

        // Leitura dos números e contagem de pares
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }

        System.out.println("Quantidade de números pares: " + contadorPares);

        scanner.close();
    }
}
