package lista110exercicios;

/*
48) Faça um programa que leia um número inteiro e exiba os seus dígitos separadamente usando o loop "while".
*/

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        String numeroStr = Integer.toString(numero);
        int i = 0;

        while (i < numeroStr.length()) {
            System.out.println(numeroStr.charAt(i));
            i++;
        }

        scanner.close();
    }
}
