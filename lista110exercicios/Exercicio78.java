package lista110exercicios;

/*
78) Faça um programa que leia um número inteiro e exiba os seus dígitos separadamente.
*/

import java.util.Scanner;

public class Exercicio78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String numeroStr = Integer.toString(numero);

        for (int i = 0; i < numeroStr.length(); i++) {
            System.out.println(numeroStr.charAt(i));
        }

        scanner.close();
    }
}

