package unit4;

import java.util.Scanner;

public class MenorMaiorMedia {

	public static void main(String[] args) {
		
		double numeroReal;
		double menor;
		double maior;
		double media = 0;
		double cont = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("\nInforme um numero qualquer ou 0 para sair: ");
		numeroReal = in.nextDouble();
		
		menor = numeroReal;
		maior = numeroReal;
			
		
		do {
			
			cont++;
			if (numeroReal < menor) {
				menor = numeroReal;
			} else if (numeroReal > maior ) {
				maior = numeroReal;
			}
			
			System.out.print("\nInforme um numero qualquer ou 0 para sair: ");
			numeroReal = in.nextDouble();
		
			media = media + numeroReal;
			
		} while (numeroReal != 0);
		
		media = media / cont;
		
		System.out.print("\nMenor valor = " + menor);
		System.out.print("\nMaior valor = " + maior);
		System.out.print("\nMédia = " + media);
		

	}

}
