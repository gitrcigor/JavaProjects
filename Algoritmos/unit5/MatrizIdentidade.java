package unit5;

import java.io.FileWriter;
import java.io.PrintWriter;

public class MatrizIdentidade {

	public static void main(String[] args) throws Exception {

		int i;
		int j;

		int matrizI[][] = new int[3][3];

		// Guardar dados num txt
		FileWriter arq = new FileWriter("matriz.txt");
		PrintWriter gravaarq = new PrintWriter(arq);

		// Leitura
		for (i = 0; i < 3; i++) {

			for (j = 0; j < 3; j++) {

				if (i == j) {
					matrizI[i][j] = 1;
				} else
					matrizI[i][j] = 0;

			} // j

		} // i

		// Escrita
		for (i = 0; i < matrizI.length; i++) {

			for (j = 0; j < matrizI.length; j++) {

				System.out.print("\t" + matrizI[i][j] + " ");

			} // j
			System.out.println("\n");
		} // i

		arq.close();
		gravaarq.close();

	}

}
