package lista110exercicios;

/*
3. Crie um programa que leia a base e a altura de um triângulo e calcule sua área.
*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();
        
        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();
        
        double area = (base * altura) / 2;
        
        System.out.println("Área do triângulo: " + area);
        
        scanner.close();
    }
}
