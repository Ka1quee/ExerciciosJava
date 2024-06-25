package lista110exercicios;

/*
41) Crie um programa que leia um número inteiro positivo e exiba todos os divisores desse número usando o loop "while".
*/

import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();
        int i = 1;

        System.out.println("Os divisores de " + numero + " são:");
        while (i <= numero) {
            if (numero % i == 0) {
                System.out.println(i);
            }
            i++;
        }

        scanner.close();
    }
}
