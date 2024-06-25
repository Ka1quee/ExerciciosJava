package lista110exercicios;

/*
85) Escreva um programa que leia 5 números inteiros e exiba o maior e o menor valor digitado.
*/

import java.util.Scanner;

public class Exercicio85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        int maior, menor;

        // Leitura dos números e identificação do maior e menor
        System.out.println("Digite 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializar maior e menor com o primeiro elemento do array
        maior = menor = numeros[0];

        // Verificar maior e menor
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

        scanner.close();
    }
}
