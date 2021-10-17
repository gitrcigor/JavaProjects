package unit4;

import java.util.Scanner;

public class ImpostoRenda {
//While
//Imposto de renda
	public static void main(String[] args) {

		String nome;
		String cpf;
		int dependentes = 0;
		double rendaMensal = 1;
		double baseCalculoIR;
		double rendaLiquida;

		Scanner in = new Scanner(System.in);

		while (rendaMensal != 0) {

			System.out.print("\nInforme seu nome: ");
			nome = in.next();

			System.out.print("\nInforme seu CPF: ");
			cpf = in.next();

			System.out.print("\nInforme quantidade de dependentes: ");
			dependentes = in.nextInt();

			System.out.print("\nInforme a renda mensal: ");
			rendaMensal = in.nextDouble();

			if (rendaMensal == 0)
				System.exit(0);

			baseCalculoIR = (rendaMensal - (dependentes * 189.59)) - (0.11 * rendaMensal);

			// temp
			System.out.print("\nBase IR: " + baseCalculoIR);

			if (rendaMensal <= 1903.98) {
				System.out.print("\nIsento de imposto de renda.");
				System.out.print("\n");
			}

			else if (rendaMensal >= 1903.99 && rendaMensal <= 2826.65) {
				System.out.print("\nAlíquota de 7.5% com dedução de R$142,80");

				rendaLiquida = baseCalculoIR - 142.80;
				System.out.print("\nRenda líquida igual a R$" + rendaLiquida);
				System.out.print("\n");
			}

			else if (rendaMensal >= 2826.66 && rendaMensal <= 3751.05) {
				System.out.print("\nAlíquta de 15% com dedução de R$354,80");

				rendaLiquida = baseCalculoIR - 354.80;
				System.out.print("\nRenda líquida igual a R$" + rendaLiquida);
				System.out.print("\n");
			}

			else if (rendaMensal >= 3751.06 && rendaMensal <= 4664.68) {
				System.out.print("\nAlíquota de 22.5% com dedução de R$636,13");

				rendaLiquida = baseCalculoIR - 636.13;
				System.out.print("\nRenda líquida igual a R$" + rendaLiquida);
				System.out.print("\n");
			}

			else if (rendaMensal >= 4664.69) {
				System.out.print("\nAlíquota de 27.5% com dedução de R$869,36");

				rendaLiquida = baseCalculoIR - 869.36;
				System.out.print("\nRenda líquida igual a R$" + rendaLiquida);
				System.out.print("\n");
			}

		}

	}

}
