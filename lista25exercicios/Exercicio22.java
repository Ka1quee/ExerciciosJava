package lista25exercicios;

/*
22- Faça um programa que leia 20 números e, ao final, escreva quantos estão entre 0 e 100.
*/

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = scanner.nextDouble();
            
            if (numero >= 0 && numero <= 100) {
                contador++;
            }
        }
        
        System.out.println("Quantidade de números entre 0 e 100: " + contador);
        
        scanner.close();
    }
}
