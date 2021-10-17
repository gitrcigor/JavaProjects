package unit5;

import java.util.Scanner;

public class Matematica {

	// FUNÇÕES

	public static void tabuada(int numero) {

		int total;

		for (int i = 0; i < 10; i++) {

			total = numero * i;
			System.out.print("\n");
			System.out.print(numero + "x" + i + "=" + total);
			i = i++;

		}
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int numero = 0;

		System.out.print("Insira um numero qualquer: ");
		numero = in.nextInt();

		tabuada(numero);

		in.close();

	}

}
