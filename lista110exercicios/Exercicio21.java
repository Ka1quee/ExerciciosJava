package lista110exercicios;

/*
21. Crie um programa que leia a idade de um grupo de pessoas e exiba quantas são menores de idade e quantas são maiores de idade.
*/

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menores = 0, maiores = 0;
        String resposta;
        
        do {
            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();
            
            if (idade < 18) {
                menores++;
            } else {
                maiores++;
            }
            
            System.out.print("Deseja inserir outra idade? (sim/não): ");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("sim"));
        
        System.out.println("Total de menores de idade: " + menores);
        System.out.println("Total de maiores de idade: " + maiores);
        
        scanner.close();
    }
}
