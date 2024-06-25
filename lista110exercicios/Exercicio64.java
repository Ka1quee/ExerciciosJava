package lista110exercicios;

/*
64) Escreva um programa que calcule o fatorial de um número inteiro inserido pelo usuário usando o loop "do-while".
*/

import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int fatorial = 1;
        int i = 1;

        do {
            fatorial *= i;
            i++;
        } while (i <= numero);

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        scanner.close();
    }
}
