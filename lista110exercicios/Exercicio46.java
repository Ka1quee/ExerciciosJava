package lista110exercicios;

/*
46) Escreva um programa que leia um número inteiro e exiba a soma de todos os números pares entre 1 e o número lido usando o loop "while".
*/

import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int i = 1;
        int somaPares = 0;

        while (i <= numero) {
            if (i % 2 == 0) {
                somaPares += i;
            }
            i++;
        }

        System.out.println("A soma de todos os números pares entre 1 e " + numero + " é: " + somaPares);

        scanner.close();
    }
}
