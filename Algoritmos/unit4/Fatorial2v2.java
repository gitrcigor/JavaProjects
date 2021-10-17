package unit4;

import java.util.Scanner;

public class Fatorial2v2 {
//For
//Fatorial
	public static void main(String[] args) {

		int i;
		int valorInformado;
		int fatorial = 1;

		Scanner in = new Scanner(System.in);
		System.out.print("\nInsira um valor inteiro para saber seu fatorial: ");
		valorInformado = in.nextInt();
		i = valorInformado;

		do {

			fatorial = fatorial * i;

			i--;

		} while (i >= 1);

		System.out.print("\nO resultado do fatorial informado é: " + fatorial);
		System.exit(0);
	}

}
