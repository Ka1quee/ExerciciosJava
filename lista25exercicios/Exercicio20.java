package lista25exercicios;

/*
20- Escreva um programa que leia 20 números do usuário e exiba quantos números são maiores do que 8.
*/

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = scanner.nextDouble();
            
            if (numero > 8) {
                contador++;
            }
        }
        
        System.out.println("Quantidade de números maiores que 8: " + contador);
        
        scanner.close();
    }
}
