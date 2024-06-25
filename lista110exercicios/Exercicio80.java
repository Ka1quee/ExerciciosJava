package lista110exercicios;

/*
80) Crie um programa que leia o nome e a idade de várias pessoas até que o nome "fim" seja informado. 
Ao final, exiba a média das idades.
*/

import java.util.Scanner;

public class Exercicio80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade, somaIdades = 0, contador = 0;

        do {
            System.out.print("Digite o nome da pessoa (ou 'fim' para encerrar): ");
            nome = scanner.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Digite a idade de " + nome + ": ");
                idade = scanner.nextInt();
                scanner.nextLine(); // Limpar o buffer

                somaIdades += idade;
                contador++;
            }
        } while (!nome.equalsIgnoreCase("fim"));

        if (contador > 0) {
            double mediaIdades = somaIdades / (double) contador;
            System.out.println("A média das idades das pessoas digitadas é: " + mediaIdades);
        } else {
            System.out.println("Nenhuma pessoa foi registrada.");
        }

        scanner.close();
    }
}

