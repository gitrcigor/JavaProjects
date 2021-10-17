package unit3;

import java.util.Scanner;

public class CaixaEletronico {
		
	//If Else
	// Notas saque eletronico
	public static void main(String[] args) {

		int saque;
		double notas10, notas50, notas100;
		int resto;

		// Leitura

		Scanner teclado = new Scanner(System.in);
		System.out.print("\nDigite o valor que deseja sacar: ");
		saque = teclado.nextInt();

		// Processamento

		if (saque % 10 == 0 && saque > 0) {

			notas100 = Math.floor(saque / 100); //math.floor pega o inteiro de uma divisão ex: 180 / 100 = 1.8. O valor seria 1.
			resto = saque % 100;

			notas50 = Math.floor(resto / 50);
			resto = resto % 50;

			notas10 = Math.floor(resto / 10);

			// Resultado

			if (notas100 >= 1) {

				if (notas100 >= 1 && notas50 == 0 && notas10 == 0) {

					System.out.print("\nSeu saque será dividido entre: " + notas100 + " nota(s) de 100.");

				} else if (notas100 >= 1 && notas50 >= 1 && notas10 == 0) {

					System.out.print("\nSeu saque será dividido entre: " + notas100 + " nota(s) de 100, " + notas50
							+ " nota(s) de 50.");
				} else if (notas100 >= 1 && notas50 == 0 && notas10 >= 1) {

					System.out.print("\nSeu saque será dividido entre: " + notas100 + " nota(s) de 100, " + notas10
							+ " nota(s) de 10.");
				} else {

					System.out.print("\nSeu saque será dividido entre: " + notas100 + " nota(s) de 100, " + notas50
							+ " nota(s) de 50, " + notas10 + " nota(s) de 10.");
				}

			} else if (notas100 < 1 && notas50 >= 1) {

				System.out.print("\nSeu saque será dividido entre: " + notas50 + " nota(s) de 50, " + notas10
						+ " nota(s) de 10.");

			} else if (notas100 < 1 && notas50 < 1) {

				System.out.print("\nSeu saque será dividido entre: " + notas10 + " nota(s) de 10.");

			}

		} else {

			System.out.print("\nValor de saque incompatível.");
			CaixaEletronico.main(null);
		}

	}

}
