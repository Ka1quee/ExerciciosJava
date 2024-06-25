package lista25exercicios;

/*
17- Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.
*/

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maioresIdade = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            
            if (idade >= 18) {
                maioresIdade++;
            }
        }
        
        System.out.println("Quantidade de pessoas maiores de idade: " + maioresIdade);
        
        scanner.close();
    }
}
