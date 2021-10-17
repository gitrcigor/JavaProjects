package unit4;

import java.util.Scanner;

public class CalculaMedia50Alunos {
//For
	public static void main(String[] args) {

		int i;
		double media = 0;
		double nota1, nota2, nota3, nota4;
		double media50Alunos;
		double mediaNotas;

		Scanner teclado = new Scanner(System.in);

		for (i = 1; i <= 5; i++) {

			System.out.print("\nFavor informar a nota 1: ");
			nota1 = teclado.nextDouble();
			
			System.out.print("\nFavor informar a nota 2: ");
			nota2 = teclado.nextDouble();
			
			System.out.print("\nFavor informar a nota 3: ");
			nota3 = teclado.nextDouble();
			
			System.out.print("\nFavor informar a nota 4: ");
			nota4 = teclado.nextDouble();
			
			media = nota1 + nota2 + nota3 + nota4;

		}

		mediaNotas = media / 5;
		System.out.print("\nMédia de 5 alunos é igual a " + mediaNotas);

	}

}
