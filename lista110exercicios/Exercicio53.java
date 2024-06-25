package lista110exercicios;

/*
53) Crie um programa que exiba os números pares de 1 a 50 usando o loop "do-while".
*/

public class Exercicio53 {
    public static void main(String[] args) {
        int i = 1;

        do {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 50);
    }
}

