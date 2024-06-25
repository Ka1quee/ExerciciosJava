package lista110exercicios;

import java.util.Scanner;

/*65) Crie um programa que leia o nome e a idade de várias pessoas usando o loop "do-while" até que o nome "fim" seja informado. Ao final, exiba a média das idades*/

public class Exercicio65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        int somaIdades = 0;
        int contador = 0;
        double mediaIdades;

        // Loop do-while para ler nomes e idades até que seja informado "fim"
        do {
            System.out.print("Digite o nome (ou 'fim' para encerrar): ");
            nome = scanner.nextLine();

            if (!nome.equalsIgnoreCase("fim")) {
                System.out.print("Digite a idade: ");
                idade = scanner.nextInt();
                scanner.nextLine(); // Consumir a quebra de linha após o próximo inteiro

                somaIdades += idade;
                contador++;
            }
        } while (!nome.equalsIgnoreCase("fim"));

        // Calcular a média das idades
        if (contador > 0) {
            mediaIdades = (double) somaIdades / contador;
            System.out.printf("A média das idades das pessoas é %.2f%n", mediaIdades);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }

        scanner.close();
    }
}

