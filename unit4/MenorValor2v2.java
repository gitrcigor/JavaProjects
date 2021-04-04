package unit4;

import java.util.Scanner;

public class MenorValor2v2 {
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

		do {
			if (valor < menorValor)

				menorValor = valor;

			else if (valor > maiorValor)

				maiorValor = valor;

			System.out.print("\nInsira novamente um valor");
			System.out.print("\nOu 0 para sair: ");
			valor = in.nextInt();

		} while (valor != 0);

//			if (valor == 0)
//				System.exit(0);
//				System.out.print("\nO maior valor informado é: " + valor + "\ne o menor é: " + menorValor);

		System.out.print("\nO maior valor informado é: " + maiorValor + "\ne o menor é: " + menorValor);

	}

}
