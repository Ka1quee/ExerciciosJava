package lista110exercicios;

/*
37) Escreva um programa que calcule a soma dos números de 1 a 100 usando o loop "while".
*/

public class Exercicio37 {
    public static void main(String[] args) {
        int soma = 0;
        int i = 1;

        while (i <= 100) {
            soma += i;
            i++;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
