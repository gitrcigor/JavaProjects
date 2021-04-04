package unit3;

import java.text.Normalizer.Form;
import java.util.Scanner;

public class FormaPagamento {

//Switch Case

	public static void main(String[] args) {

		int opcaoPagamento;
		double valorPagar;
		double resultado;

		Scanner teclado = new Scanner(System.in);
		System.out.print("\nInsira o valor a ser pago: ");
		valorPagar = teclado.nextDouble();

		if (valorPagar > 0) {

			do {
				System.out.print("\n");
				System.out.print("\nOpção 1 - à vista em dinheiro ou cheque, recebe 10% de desconto");
				System.out.print("\nOpção 2 - à vista no cartão de crédito, recebe 5% de desconto");
				System.out.print("\nOpção 3 - em 2 vezes sem juros");
				System.out.print("\nOpção 4 - em 3 vezes com juros de 10%");
				System.out.print("\nOpção 0 - sair");
				System.out.print("\nEscolha uma opção: ");
				opcaoPagamento = teclado.nextInt();

				switch (opcaoPagamento) {
				case 1:
					resultado = valorPagar * 0.9;
					System.out.print("\nO valor com desconto de 10% ficará em R$" + resultado);
					System.exit(0);				
					break;

				case 2:
					resultado = valorPagar * 0.95;
					System.out.print("\nO valor com desconto de 5% ficará em R$" + resultado);
					System.exit(0);
					break;

				case 3:
					resultado = valorPagar / 2;
					System.out.print("\nO valor em 2x sem juros ficará em R$" + resultado);
					System.exit(0);
					break;

				case 4:
					resultado = (valorPagar * 1.1) / 3;
					System.out.print("\nO valor em 3x com juros de 10% ficará em R$" + resultado);
					System.exit(0);
					break;
					
				case 0:
					System.exit(0);
					break;

				}
			} while (opcaoPagamento != 0);

		} else {

			System.out.print("\nO valor a pagar deve ser maior do que R$0");
			FormaPagamento.main(null);
		}

	}

}
