package lista25exercicios;

/*
11- Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês.
*/

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nome do vendedor: ");
        String nome = scanner.nextLine();
        
        System.out.print("Salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.print("Total de vendas do vendedor: ");
        double totalVendas = scanner.nextDouble();
        
        double comissao = totalVendas * 0.15;
        double salarioFinal = salarioFixo + comissao;
        
        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Salário fixo: R$" + salarioFixo);
        System.out.println("Salário final do mês: R$" + salarioFinal);
        
        scanner.close();
    }
}
