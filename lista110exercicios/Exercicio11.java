package lista110exercicios;

/*
11. Escreva um programa que calcule a média aritmética entre três números reais inseridos pelo usuário.
*/

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro número: ");
        double num3 = scanner.nextDouble();
        
        double media = (num1 + num2 + num3) / 3;
        
        System.out.println("Média aritmética: " + media);
        
        scanner.close();
    }
}
