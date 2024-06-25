package lista110exercicios;

/*
8. Escreva um programa que leia dois números inteiros e troque os seus valores, ou seja, o primeiro deve ficar com o valor do segundo e vice-versa.
*/

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        // Troca de valores
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println("Após a troca:");
        System.out.println("Primeiro número: " + num1);
        System.out.println("Segundo número: " + num2);
        
        scanner.close();
    }
}
