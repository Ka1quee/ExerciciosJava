package lista110exercicios;

/*
95) Crie um programa que leia 5 nomes e exiba-os em ordem alfabética.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio95 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];

        // Leitura dos nomes
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º nome: ");
            nomes[i] = scanner.nextLine();
        }

        // Ordenação dos nomes em ordem alfabética
        Arrays.sort(nomes);

        // Exibição dos nomes ordenados
        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
