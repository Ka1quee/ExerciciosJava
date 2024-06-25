package lista110exercicios;

/*
7. Faça um programa que receba o salário base de um funcionário e calcule o seu salário líquido, considerando que o funcionário recebe 5% de comissão sobre o salário base.
*/

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário base do funcionário: ");
        double salarioBase = scanner.nextDouble();
        
        double salarioLiquido = salarioBase + (salarioBase * 0.05);
        
        System.out.println("Salário líquido: R$" + salarioLiquido);
        
        scanner.close();
    }
}
