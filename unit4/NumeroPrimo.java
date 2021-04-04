package unit4;

import java.util.Scanner;

public class NumeroPrimo {
//Estrutura repetição
//Numero primo
	public static void main(String[] args) {

		int numeroInteiro;
		int quantidadeDivisores = 0;

		Scanner in = new Scanner(System.in);
		System.out.print("\nInforme um número inteiro para saber se é primo: ");
		numeroInteiro = in.nextInt();

//		if (numeroInteiro / numeroInteiro == 1 && numeroInteiro / 1 == numeroInteiro && numeroInteiro % 2 != 0) {
//
//			System.out.print("\nO número " + numeroInteiro + " é primo");
//
//		} else
//
//			System.out.print("\nO número informado não é um número primo.");
		
		
		for (int i = 1; i <= numeroInteiro; i++) {
			
			if (numeroInteiro % i == 0) {
				
				quantidadeDivisores++;
			}
			
		}
		
		if (quantidadeDivisores == 2) 
			System.out.print("\nEste é um numero primo.");
		else 
			System.out.print("\nNão é um número primo.");
		

	}

}
