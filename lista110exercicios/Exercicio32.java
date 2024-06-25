package lista110exercicios;

/*
32) Escreva um programa que leia a nota de um aluno em uma prova e exiba a sua conceituação conforme a tabela de notas.
*/

import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        if (nota >= 9) {
            System.out.println("Conceito: A");
        } else if (nota >= 7) {
            System.out.println("Conceito: B");
        } else if (nota >= 5) {
            System.out.println("Conceito: C");
        } else if (nota >= 3) {
            System.out.println("Conceito: D");
        } else {
            System.out.println("Conceito: E");
        }

        scanner.close();
    }
}
