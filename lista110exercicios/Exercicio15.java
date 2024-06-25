package lista110exercicios;

/*
15. Crie um programa que leia o salário de um funcionário e calcule o novo salário com um aumento de 15%.
*/

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário atual: ");
        double salario = scanner.nextDouble();
        
        double novoSalario = salario * 1.15;
        
        System.out.println("Novo salário com aumento de 15%: R$" + novoSalario);
        
        scanner.close();
    }
}
