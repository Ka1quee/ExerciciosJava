package lista110exercicios;

/*
86) Crie um programa que leia 10 números inteiros e exiba-os em ordem crescente.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Leitura dos números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenação dos números
        Arrays.sort(numeros);

        // Exibição dos números ordenados
        System.out.println("Números em ordem crescente:");
        for (int numero : numeros) {
            System.out.println(numero);
        }

        scanner.close();
    }
}
