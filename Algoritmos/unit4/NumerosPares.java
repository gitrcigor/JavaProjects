package unit4;

import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {

		int inteiroA;
		int inteiroB;

		Scanner in = new Scanner(System.in);
		System.out.print("\nInforme o valor do primeiro número: ");
		inteiroA = in.nextInt();
		System.out.print("\nInforme o valor do segundo número: ");
		inteiroB = in.nextInt();

		for (int i = inteiroA; i < inteiroB; i++) {

			if (i % 2 == 0) {
				System.out.print("\nNúmeros pares no intervalo: " + i);
				
				continue;
			}

		}

	}

}
