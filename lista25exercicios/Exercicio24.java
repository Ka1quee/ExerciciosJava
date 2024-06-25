package lista25exercicios;

/*
24- Escreva um programa que leia uma sequência de números do usuário e realize a soma desses números. Encerre a execução quando um número negativo for digitado.
*/

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        
        while (true) {
            System.out.print("Digite um número (ou um número negativo para sair): ");
            int numero = scanner.nextInt();
            
            if (numero < 0) {
                break;
            }
            
            soma += numero;
        }
        
        System.out.println("A soma dos números é: " + soma);
        
        scanner.close();
    }
}
