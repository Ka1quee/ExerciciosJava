package lista25exercicios;

/*
19- Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de um valor lido em dólar (US$). 
O programa deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário.
*/

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a cotação do dólar: ");
        double cotacao = scanner.nextDouble();
        
        System.out.print("Digite a quantidade de dólares: ");
        double dolares = scanner.nextDouble();
        
        double reais = dolares * cotacao;
        
        System.out.println("Valor em reais: R$" + reais);
        
        scanner.close();
    }
}
