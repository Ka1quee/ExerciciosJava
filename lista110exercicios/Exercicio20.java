package lista110exercicios;

/*
20. Escreva um programa que leia um número inteiro e exiba se ele é par ou ímpar.
*/

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }
        
        scanner.close();
    }
}

