package unit3;

import java.util.Scanner;


public class Moeda {
//Switch Case	

	public static void main(String[] args) {

		double valor;
		int tipoMoeda;

		Scanner teclado = new Scanner(System.in);
		System.out.print("\nFavor informar o valor a ser convertido: ");
		valor = teclado.nextDouble();
		
		System.out.print("\nInforme o tipo de moeda: 1-Libra, 2-Dolar, 3-Euro: ");
		tipoMoeda = teclado.nextInt();
		
		switch (tipoMoeda) {
		case 1:
			System.out.print("\nO valor a ser convertido em Libras é igual a: " + valor / 5 + " Libras.");
			break;
			
		case 2:
			System.out.print("\nO valor a ser convertido em Dólar é igual a: " + valor / 4 + " Dolares.");
			break;
			
		case 3:
			System.out.print("\nO valor a ser convertido em Euro é igual a: " + valor / 4.4 + " Euros.");
			break;

		default:
			System.out.print("\nOpção digitada incorreta!");
			break;
		}

	}

}
