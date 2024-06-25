package lista110exercicios;

/*
69) Faça um programa que leia 5 números inteiros e exiba a média aritmética dos valores lidos.
*/

import java.util.Scanner;

public class Exercicio69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int num = scanner.nextInt();
            soma += num;
        }

        double media = soma / 5.0;
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
