package lista110exercicios;

/*
83) Crie um programa que leia 7 números inteiros e exiba a média aritmética dos valores lidos.
*/

import java.util.Scanner;

public class Exercicio83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        // Leitura dos números e cálculo da soma
        for (int i = 1; i <= 7; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        double media = soma / 7.0;
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}

