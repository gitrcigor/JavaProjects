package unit4;

import java.util.Scanner;

public class SequenciaS1 {
	//For

	public static void main(String[] args) {

		double contadorS = 1;
		double posicao9 = 0, posicao10 = 0, posicao100 = 0, posicao10000 = 0;

		System.out.print("\nSequência: 1,4,7,10,13,16,19,22, ...");

		for (double i = 2; i <= 10000; i++) {

			contadorS = contadorS + 3;

			if (i == 9)
				posicao9 = contadorS;

			else if (i == 10)
				posicao10 = contadorS;

			else if (i == 100)
				posicao100 = contadorS;

			else if (i == 10000)
				posicao10000 = contadorS;

		}

		System.out.print("\ntermo 09: " + posicao9);
		System.out.print("\ntermo 10: " + posicao10);
		System.out.print("\ntermo 100: " + posicao100);
		System.out.print("\ntermo 10000: " + posicao10000);

	}

}
