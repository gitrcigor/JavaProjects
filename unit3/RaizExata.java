package unit3;

import java.util.Scanner;

public class RaizExata {

	public static void main(String[] args) {
		int numero;
		double raizExata, maiorValor;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Leia numero: ");
		numero = teclado.nextInt();
		raizExata = Math.sqrt(numero);
		maiorValor = Math.round(raizExata);

		if (raizExata == maiorValor) {
			System.out.print("\nExiste raiz exata para o numero " + numero);

		} else {
			System.out.println("\nNao existe raiz exata para o numero informado");
		}
		
		
		System.out.print("teste");

	}

}
