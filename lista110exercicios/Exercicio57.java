package lista110exercicios;

/*
57) Faça um programa que leia um número inteiro e exiba se ele é um número primo usando o loop "do-while".
*/

import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int i = 2;
        boolean isPrime = true;

        do {
            if (numero % i == 0) {
                isPrime = false;
                break;
            }
            i++;
        } while (i <= numero / 2);

        if (isPrime && numero > 1) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }

        scanner.close();
    }
}
