package lista110exercicios;

/*
68) Crie um programa que exiba os números pares de 1 a 50.
*/

public class Exercicio68 {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}

