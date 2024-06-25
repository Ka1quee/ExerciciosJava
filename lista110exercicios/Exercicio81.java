package lista110exercicios;

/*
81) Faça um programa que leia 5 números inteiros e exiba-os na ordem inversa em que foram digitados.
*/

import java.util.Scanner;

public class Exercicio81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Leitura dos números
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Exibição na ordem inversa
        System.out.println("Números na ordem inversa:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
