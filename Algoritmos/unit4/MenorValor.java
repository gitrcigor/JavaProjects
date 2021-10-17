package unit4;

import java.util.Scanner;

public class MenorValor {
//While

	public static void main(String[] args) {

		int valor;
		int menorValor;
		int maiorValor;

		Scanner in = new Scanner(System.in);
		System.out.print("\nInsira um valor: ");
		valor = in.nextInt();

		menorValor = valor;
		maiorValor = valor;

		while (valor != 0) {

			if (valor < menorValor)

				menorValor = valor;

			else if (valor > maiorValor)

				maiorValor = valor;

			System.out.print("\nInsira novamente um valor: ");
			valor = in.nextInt();

		}
		System.out.print("\nO maior valor informado é: " + maiorValor + "\ne o menor é: " + menorValor);

	}

}
