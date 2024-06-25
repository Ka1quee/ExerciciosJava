package lista110exercicios;

/*
70) Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor.
*/

import java.util.Scanner;

public class Exercicio70 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close();
    }
}

