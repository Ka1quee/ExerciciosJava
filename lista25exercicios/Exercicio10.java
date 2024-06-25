package lista25exercicios;

/*
10- Informar um saldo e imprimir o saldo com reajuste de 1.5%.
*/

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o saldo atual: ");
        double saldo = scanner.nextDouble();
        
        double saldoReajustado = saldo * 1.015; // reajuste de 1.5%
        
        System.out.println("Saldo com reajuste: " + saldoReajustado);
        
        scanner.close();
    }
}
