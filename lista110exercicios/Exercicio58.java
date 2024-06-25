package lista110exercicios;

/*
58) Escreva um programa que leia um número inteiro e exiba a sequência de Fibonacci até o número lido usando o loop "do-while".
*/

import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int a = 0;
        int b = 1;

        System.out.print("Sequência de Fibonacci: ");
        do {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        } while (a <= numero);

        scanner.close();
    }
}

