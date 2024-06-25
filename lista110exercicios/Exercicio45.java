package lista110exercicios;

/*
45) Faça um programa que exiba os primeiros 20 números da sequência de Fibonacci usando o loop "while".
*/

public class Exercicio45 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count = 0;

        System.out.print("Os primeiros 20 números da sequência de Fibonacci: ");
        while (count < 20) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
            count++;
        }
    }
}

