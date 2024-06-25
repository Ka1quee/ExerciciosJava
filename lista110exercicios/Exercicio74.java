package lista110exercicios;

/*
74) Crie um programa que leia o nome e a idade de 5 pessoas e exiba a média das idades.
*/

import java.util.Scanner;

public class Exercicio74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = scanner.next();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();

            somaIdades += idade;
        }

        double mediaIdades = somaIdades / 5.0;
        System.out.println("A média das idades é: " + mediaIdades);

        scanner.close();
    }
}
