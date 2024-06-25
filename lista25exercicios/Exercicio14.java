package lista25exercicios;

/*
14- Escreva um algoritmo que leia 10 números do usuário e calcule a soma desses números.
*/

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma = 0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o " + i + "º número: ");
            double numero = scanner.nextDouble();
            soma += numero;
        }
        
        System.out.println("A soma dos 10 números é: " + soma);
        
        scanner.close();
    }
}
