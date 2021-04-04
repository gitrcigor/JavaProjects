package unit4;

import java.util.Scanner;

public class Contas {
//Estrutura repetição
	public static void main(String[] args) {

		String nomeConta;
		double valorConta = 0;
		double cont = 0;
		int numeroDeContas = 0;
		double valorTotal = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("\nInforme o nome da conta: ");
		nomeConta = in.next();

		System.out.print("\nInforme o valor da conta: ");
		valorConta = in.nextDouble();

		while (valorConta > 0) {

			System.out.print("\nInforme o nome da conta: ");
			nomeConta = in.next();

			System.out.print("\nInforme o valor da conta: ");
			valorConta = in.nextDouble();

			numeroDeContas++;
			valorTotal = valorTotal + valorConta;

		}

		System.out.print("\nQuantidade de contas: " + numeroDeContas);
		System.out.print("\nValor total: " + valorTotal);

	}

}
