package lista110exercicios;

/*
88) Escreva um programa que leia 5 números inteiros e calcule a média dos valores pares e a média dos valores ímpares.
*/

import java.util.Scanner;

public class Exercicio88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int somaPares = 0, somaImpares = 0;
        int contadorPares = 0, contadorImpares = 0;

        // Leitura dos números e separação entre pares e ímpares
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                somaPares += numeros[i];
                contadorPares++;
            } else {
                somaImpares += numeros[i];
                contadorImpares++;
            }
        }

        // Cálculo das médias
        double mediaPares = contadorPares > 0 ? somaPares / (double) contadorPares : 0;
        double mediaImpares = contadorImpares > 0 ? somaImpares / (double) contadorImpares : 0;

        // Exibição das médias
        System.out.println("Média dos números pares: " + mediaPares);
        System.out.println("Média dos números ímpares: " + mediaImpares);

        scanner.close();
    }
}
