package lista110exercicios;

/*
73) Escreva um programa que leia um número inteiro e exiba a sequência de Fibonacci até o número lido.
*/

import java.util.Scanner;

public class Exercicio73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Sequência de Fibonacci até " + numero + ": ");
        while (a <= numero) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }

        scanner.close();
    }
}

