package lista110exercicios;

/*
72) Faça um programa que leia um número inteiro e exiba se ele é um número primo.
*/

import java.util.Scanner;

public class Exercicio72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        boolean isPrime = true;
        if (numero <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime && numero > 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}

