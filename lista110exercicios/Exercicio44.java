package lista110exercicios;

/*
44) Crie um programa que leia o nome e a idade de 5 pessoas usando o loop "while" e exiba a média das idades.
*/

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0;
        int count = 0;

        while (count < 5) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.next();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();

            somaIdades += idade;
            count++;
        }

        double mediaIdades = somaIdades / 5.0;
        System.out.println("A média das idades é: " + mediaIdades);

        scanner.close();
    }
}

