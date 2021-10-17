package unit3;

import java.util.Scanner;

//Estrutura de decisão
//If/Else
public class Numero {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = teclado.nextInt();

		if (numero % 2 == 0) {
			System.out.println("\nO resto da divisão deste numero é PAR!");
		} else {
			System.out.println("\nO resto da divisão deste numero nao é PAR");
		}

	}

}
