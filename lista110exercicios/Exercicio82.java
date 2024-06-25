package lista110exercicios;

/*
82) Escreva um programa que leia 10 números inteiros e exiba a soma deles.
*/

import java.util.Scanner;

public class Exercicio82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;

        // Leitura dos números e soma
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = scanner.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
}
