package lista110exercicios;

/*
31) Faça um programa que leia o valor do salário-mínimo e o salário de um funcionário, e exiba quantos salários-mínimos ele recebe.
*/

import java.util.Scanner;

public class Exercicio31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do salário-mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        System.out.print("Digite o valor do salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();

        double quantidadeSalarios = salarioFuncionario / salarioMinimo;

        System.out.printf("O funcionário recebe %.2f salários-mínimos.\n", quantidadeSalarios);

        scanner.close();
    }
}
