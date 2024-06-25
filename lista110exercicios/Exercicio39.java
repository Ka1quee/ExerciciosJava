package lista110exercicios;

/*
39) Faça um programa que leia 5 números inteiros usando o loop "while" e exiba a média aritmética dos valores lidos.
*/

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int count = 0;

        while (count < 5) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            soma += num;
            count++;
        }

        double media = soma / 5.0;
        System.out.println("A média dos números é: " + media);

        scanner.close();
    }
}
