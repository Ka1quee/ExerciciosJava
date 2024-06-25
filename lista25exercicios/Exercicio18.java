package lista25exercicios;

/*
18- Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova.
*/

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeMaisNova = "";
        int idadeMaisNova = Integer.MAX_VALUE;
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = scanner.nextLine();
            
            System.out.print("Digite a idade de " + nome + ": ");
            int idade = scanner.nextInt();
            
            // Verifica se a pessoa é mais nova que a atual mais nova registrada
            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNova = nome;
            }
            
            // Limpa o buffer do scanner
            scanner.nextLine();
        }
        
        System.out.println("A pessoa mais nova é: " + nomeMaisNova + ", com " + idadeMaisNova + " anos.");
        
        scanner.close();
    }
}

