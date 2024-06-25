package lista110exercicios;

/*
33) Crie um programa que leia o nome e o turno (M ou V) de um aluno e exiba uma mensagem de saudação de acordo com o turno. Matutino: "Bom dia, aluno", Vespertino: "Boa tarde, aluno".
*/

import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o turno (M para Matutino, V para Vespertino): ");
        char turno = scanner.next().charAt(0);

        if (turno == 'M') {
            System.out.println("Bom dia, " + nome);
        } else if (turno == 'V') {
            System.out.println("Boa tarde, " + nome);
        } else {
            System.out.println("Turno inválido.");
        }

        scanner.close();
    }
}

