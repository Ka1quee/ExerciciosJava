package lista25exercicios;

/*
21- A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. 
Faça um programa que receba um valor de uma compra e mostre o valor das prestações.
*/

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();
        
        double valorPrestacao = valorCompra / 5;
        
        System.out.println("Valor de cada prestação: R$" + valorPrestacao);
        
        scanner.close();
    }
}

