package lista25exercicios;

import java.util.Scanner;

public class IdadeEleitor5 {

	/*
	 * 5- Crie um programa em JAVA que leia a idade de uma pessoa e informe a sua
	 * classe eleitoral: • não eleitor (abaixo de 16 anos); • eleitor obrigatório
	 * (entre a faixa de 18 e menor de 65 anos); • eleitor facultativo (de 16 até 18
	 * anos e maior de 65 anos, inclusive).
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a idade: ");
		int idade = scanner.nextInt();

		if (idade < 16) {
			System.out.println("Não eleitor");
		} else if (idade >= 18 && idade < 65) {
			System.out.println("Eleitor obrigatório");
		} else {
			System.out.println("Eleitor facultativo");
		}

		scanner.close();
	}
}
