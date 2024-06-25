package lista110exercicios;

/*
93) Faça um programa que leia 10 números inteiros e exiba quantos deles estão no intervalo de 10 a 50.
*/

import java.util.Scanner;

public class Exercicio93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int contadorIntervalo = 0;

        // Leitura dos números e verificação do intervalo
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] >= 10 && numeros[i] <= 50) {
                contadorIntervalo++;
            }
        }

        // Exibição da quantidade no intervalo
        System.out.println("Quantidade de números no intervalo de 10 a 50: " + contadorIntervalo);

        scanner.close();
    }
}
