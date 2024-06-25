package lista25exercicios;

/*
15- Leia a idade de 20 pessoas e exiba a soma das idades.
*/

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }
        
        System.out.println("A soma das idades é: " + somaIdades);
        
        scanner.close();
    }
}
