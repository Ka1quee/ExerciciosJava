package lista110exercicios;

/*
26) Escreva um programa que leia o código de um produto e a quantidade comprada, e exiba o valor total a ser pago. Considere que cada produto tem um preço diferente.
*/

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definindo preços de exemplo para os produtos
        double[] precos = {0, 10.0, 20.0, 30.0}; // Produtos de código 1, 2 e 3

        System.out.print("Digite o código do produto (1, 2 ou 3): ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();

        if (codigo > 0 && codigo < precos.length) {
            double total = precos[codigo] * quantidade;
            System.out.println("O valor total a ser pago é: R$ " + total);
        } else {
            System.out.println("Código do produto inválido.");
        }

        scanner.close();
    }
}
