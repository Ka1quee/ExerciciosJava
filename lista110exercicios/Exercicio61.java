package lista110exercicios;

/*
61) Escreva um programa que leia um número inteiro e exiba a soma de todos os números pares entre 1 e o número lido usando o loop "do-while".
*/

import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int i = 1;
        int somaPares = 0;

        do {
            if (i % 2 == 0) {
                somaPares += i;
            }
            i++;
        } while (i <= numero);

        System.out.println("A soma de todos os números pares entre 1 e " + numero + " é: " + somaPares);

        scanner.close();
    }
}
