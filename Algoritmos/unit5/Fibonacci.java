package unit5;

import java.util.Scanner;

public class Fibonacci {
	
	//FUNÇÕES

	public static void fibo(int numero) {

		int s1 = 1;
		int s2 = 1;
		int contadorS = 0;

		for (int i = 3; i <= numero; i++) {

			contadorS = s1 + s2;

			s1 = s2;
			s2 = contadorS;

			System.out.print(contadorS + ",");

		}

	}

	public static void main(String[] args) {

		int numero;

		Scanner in = new Scanner(System.in);

		System.out.print("Informe o número: ");
		numero = in.nextInt();

		fibo(numero);

		in.close();
	}

}
