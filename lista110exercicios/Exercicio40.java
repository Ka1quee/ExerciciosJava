package lista110exercicios;

/*
40) Escreva um programa que leia um número inteiro e exiba a tabuada desse número até o décimo valor usando o loop "while".
*/

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        int i = 1;

        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }

        scanner.close();
    }
}
