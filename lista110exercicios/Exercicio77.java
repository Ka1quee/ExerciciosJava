package lista110exercicios;

/*
77) Crie um programa que exiba os números ímpares de 50 a 1.
*/

public class Exercicio77 {
    public static void main(String[] args) {
        for (int i = 50; i >= 1; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
