package unit3;

import java.util.Scanner;

public class Equacao2Grau {

	// Estrutura de decisão
	// If/Else
	public static void main(String[] args) {

		int a, b, c;
		double delta, x1, x2;

		// Leitura

		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor de A para saber suas raizes: ");
		a = teclado.nextInt();

		System.out.print("Digite o valor de B para saber suas raizes: ");
		b = teclado.nextInt();

		System.out.print("Digite o valor de C para saber suas raizes: ");
		c = teclado.nextInt();

		// Processamento

		delta = (b * b) - (4 * a * c);

		x1 = (-b + (Math.sqrt(delta))) / (2 * a);

		x2 = (-b - (Math.sqrt(delta))) / (2 * a);

		// Resultados

		System.out.print("\nA primeira raiz vale: " + x1);

		System.out.print("\nA segunda raiz vale: " + x2);

	}

}
