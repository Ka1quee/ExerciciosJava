package lista25exercicios;

public class ValoresDescendentes4 {

	public static void main(String[] args) {

		/*
		 * 4- Dados três valores A, B e C, construa um programa em JAVA, que imprima os
		 * valores de forma descendente (do maior para o menor).
		 */

		int A = 15, B = 7, C = 21;

		if (A >= B && A >= C) {
			if (B >= C) {
				System.out.println(A + " " + B + " " + C);
			} else {
				System.out.println(A + " " + C + " " + B);
			}
		} else if (B >= A && B >= C) {
			if (A >= C) {
				System.out.println(B + " " + A + " " + C);
			} else {
				System.out.println(B + " " + C + " " + A);
			}
		} else {
			if (A >= B) {
				System.out.println(C + " " + A + " " + B);
			} else {
				System.out.println(C + " " + B + " " + A);
			}
		}
	}

}
