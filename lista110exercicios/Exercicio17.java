package lista110exercicios;

/*
17. Escreva um programa que leia a idade de uma pessoa e exiba uma mensagem indicando se ela é criança, adolescente, adulto ou idoso.
*/

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
        
        if (idade < 12) {
            System.out.println("Você é uma criança.");
        } else if (idade >= 12 && idade < 18) {
            System.out.println("Você é um adolescente.");
        } else if (idade >= 18 && idade < 60) {
            System.out.println("Você é um adulto.");
        } else {
            System.out.println("Você é um idoso.");
        }
        
        scanner.close();
    }
}

