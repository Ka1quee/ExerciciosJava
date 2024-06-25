package lista110exercicios;

/*
67) Escreva um programa que calcule a soma dos números de 1 a 100.
*/

public class Exercicio67 {
    public static void main(String[] args) {
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
