package lista25exercicios;

/*
16- Leia a idade de 20 pessoas e exiba a média das idades.
*/

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            somaIdades += idade;
        }
        
        double mediaIdades = somaIdades / 20.0;
        
        System.out.println("A média das idades é: " + mediaIdades);
        
        scanner.close();
    }
}
