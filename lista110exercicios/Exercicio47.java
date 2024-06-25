package lista110exercicios;

/*
47) Crie um programa que exiba os números ímpares de 1 a 50 usando o loop "while".
*/

public class Exercicio47 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 50) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
