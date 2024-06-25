package lista110exercicios;

/*
75) Faça um programa que exiba os primeiros 20 números da sequência de Fibonacci.
*/

public class Exercicio75 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        System.out.print("Os primeiros 20 números da sequência de Fibonacci: ");
        for (int i = 0; i < 20; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
