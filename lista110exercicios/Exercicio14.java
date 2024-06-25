package lista110exercicios;

/*
14. Escreva um programa que leia a idade de uma pessoa em anos, meses e dias, e calcule quantos dias de vida ela tem.
*/

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a idade em anos: ");
        int anos = scanner.nextInt();
        
        System.out.print("Digite os meses adicionais: ");
        int meses = scanner.nextInt();
        
        System.out.print("Digite os dias adicionais: ");
        int dias = scanner.nextInt();
        
        int totalDias = (anos * 365) + (meses * 30) + dias;
        
        System.out.println("Você tem aproximadamente " + totalDias + " dias de vida.");
        
        scanner.close();
    }
}
