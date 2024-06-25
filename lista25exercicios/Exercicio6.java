package lista25exercicios;

/*
6- Desenvolva um programa em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor.
*/

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        System.out.println("Antecessor: " + (numero - 1));
        System.out.println("Sucessor: " + (numero + 1));
        
        scanner.close();
    }
}
