package lista110exercicios;

/*
30) Crie um programa que leia o número de maçãs compradas e exiba o valor total a ser pago. O preço das maçãs é de R$ 0,50 cada se a quantidade for menor que 12 e R$ 0,40 cada se a quantidade for igual ou maior que 12.
*/

import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o número de maçãs compradas: ");
		int quantidade = scanner.nextInt();

		double precoPorMaca = (quantidade < 12) ? 0.50 : 0.40;
		double total = quantidade * precoPorMaca;

		System.out.println("O valor total a ser pago é: R$ " + total);

		scanner.close();
	}
}
