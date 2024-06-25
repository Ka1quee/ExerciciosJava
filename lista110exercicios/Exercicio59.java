package lista110exercicios;

/*
59) Crie um programa que leia o nome e a idade de 5 pessoas usando o loop "do-while" e exiba a média das idades.
*/

import java.util.Scanner;

public class Exercicio59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0;
        int count = 0;

        do {
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.next();

            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();

            somaIdades += idade;
            count++;
        } while (count < 5);

        double mediaIdades = somaIdades / 5.0;
        System.out.println("A média das idades é: " + mediaIdades);

        scanner.close();
    }
}
