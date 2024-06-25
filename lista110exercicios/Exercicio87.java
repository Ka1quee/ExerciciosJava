package lista110exercicios;
/*
87) Faça um programa que leia 10 números inteiros e exiba quantos deles são positivos.
*/

import java.util.Scanner;

public class Exercicio87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contadorPositivos = 0;

        // Leitura dos números e contagem de positivos
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                contadorPositivos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + contadorPositivos);

        scanner.close();
    }
}

