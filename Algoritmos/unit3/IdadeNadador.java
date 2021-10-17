package unit3;

import java.util.Scanner;

public class IdadeNadador {

	//IF //Else
	//Categoria nadador
	public static void main(String[] args) {

		int idade;

		// Leitura
		Scanner teclado = new Scanner(System.in);
		System.out.print("\nInforme qual sua idade para saber sua categoria: ");
		idade = teclado.nextInt();

		// Processamento //Resultados

		if (idade <= 110) {

			if (idade <= 5) {
				System.out.print("\nCategoria Infantil A!");
			} else if (idade == 6 || idade <= 8) {
				System.out.print("\nCategoria Infantil B!");
			} else if (idade == 9 || idade <= 11) {
				System.out.print("\nCategoria Infantil C!");
			} else if (idade == 12 || idade <= 13) {
				System.out.print("\nCategoria Juvenil A!");
			} else if (idade == 14 || idade <= 17) {
				System.out.print("\nCategoria Juvenil B!");
			} else if (idade >= 18) {
				System.out.print("\nCategoria Adulto!");
			}
			 
		} else {
			System.out.print("\nIdade inválida!");
			AvaliacaoNota.main(null);
		}

	}

}
