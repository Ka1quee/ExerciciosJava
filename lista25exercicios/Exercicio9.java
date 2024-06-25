package lista25exercicios;

/*
9- Crie um programa que leia o valor do salário mínimo e o valor do salário de um usuário, calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado. (Salário mínimo = R$1.212,00).
*/

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        final double salarioMinimo = 1212.00;
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o salário do usuário: ");
        double salarioUsuario = scanner.nextDouble();
        
        double quantidadeSalariosMinimos = salarioUsuario / salarioMinimo;
        
        System.out.println("O usuário ganha " + quantidadeSalariosMinimos + " salários mínimos.");
        
        scanner.close();
    }
}
