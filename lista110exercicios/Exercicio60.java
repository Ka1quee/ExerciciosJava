package lista110exercicios;

/*
60) Faça um programa que exiba os primeiros 20 números da sequência de Fibonacci usando o loop "do-while".
*/

public class Exercicio60 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count = 0;

        System.out.print("Os primeiros 20 números da sequência de Fibonacci: ");
        do {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
            count++;
        } while (count < 20);
    }
}
