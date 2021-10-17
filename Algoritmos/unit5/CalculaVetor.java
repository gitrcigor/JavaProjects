package unit5;

import java.beans.VetoableChangeListenerProxy;
import java.util.Scanner;

public class CalculaVetor {
// Vetor
// Algoritmo para informar multiplos de valor inserido e a metade dele

	public static void main(String[] args) {

		int elementos;

		Scanner in = new Scanner(System.in);

		double vetElementosA[] = new double[10];
		double vetElementosB[] = new double[10];

		for (int i = 0; i < 10; i++) {

			// System.out.print("\nInforme os elementos do vetor: ");
			// elementos = in.nextInt();

			System.out.print("\nInforme os elementos do vetor: ");
			vetElementosA[i] = in.nextDouble();

			// vetElementosA[i] = elementos;

			if (i % 2 == 0)
				vetElementosB[i] = 2 * vetElementosA[i];
			else
				vetElementosB[i] = vetElementosA[i] / 2;

		}
		System.out.print("\n");

		for (double valor : vetElementosA)
			System.out.print("|A = " + valor);

		System.out.println("\n***********");

		for (double valor : vetElementosB)
			System.out.print("|B = " + valor);

//		for (int i = 0; i < 10; i++) {
//
//			if (vetElementosB[i] % 2 == 0) {
//
//				System.out.print("\nElementos pares (2 x a): " + vetElementosB[i] * 2);
//
//			} else {
//
//				System.out.print("\nElementos ímpares (a / 2): " + vetElementosB[i] / 2);
//			}

	}

}
