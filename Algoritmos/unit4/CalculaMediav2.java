package unit4;

import java.util.Scanner;

public class CalculaMediav2 {
//Do-While

	public static void main(String[] args) {

		double somaValor = 0;
		double cont = 0;
		double valor = 0;

		Scanner teclado = new Scanner(System.in);
		System.out.print("\nInsira um valor para saber sua média: ");
		valor = teclado.nextDouble();

		do {

			if (valor != -1) {
				somaValor = somaValor + valor;
				cont++;
			}

			System.out.print("\nDigite o próximo valor ou -1 para sair: ");
			valor = teclado.nextDouble();

		} while (valor != -1);

		double media = somaValor / cont;

		System.out.print("\nA média é: " + media);

	}

}
