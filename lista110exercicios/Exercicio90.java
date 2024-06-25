package lista110exercicios;

/*
90) Faça um programa que leia 5 números inteiros e verifique se algum deles é igual a zero.
*/

import java.util.Scanner;

public class Exercicio90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];
        boolean temZero = false;

        // Leitura dos números e verificação de zero
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] == 0) {
                temZero = true;
            }
        }

        if (temZero) {
            System.out.println("Foi digitado o número zero.");
        } else {
            System.out.println("Não foi digitado o número zero.");
        }

        scanner.close();
    }
}
