package lista110exercicios;

/*
22. Faça um programa que receba o salário de um funcionário e exiba o valor do seu bônus. Se o salário for maior que R$ 2000, o bônus é de 10%, caso contrário, é de 5%.
*/

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário do funcionário: ");
        double salario = scanner.nextDouble();
        
        double bonus;
        if (salario > 2000) {
            bonus = salario * 0.10;
        } else {
            bonus = salario * 0.05;
        }
        
        System.out.println("O valor do bônus é: R$" + bonus);
        
        scanner.close();
    }
}

