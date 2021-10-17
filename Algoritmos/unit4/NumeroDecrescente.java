package unit4;

import java.util.Scanner;

public class NumeroDecrescente {
//For
	public static void main(String[] args) {
		
		int i;
		int numero;
		int total;
		
	
		Scanner teclado = new Scanner(System.in);
		System.out.print("\nDigite um numero qualquer para ver decrescente: ");
		numero = teclado.nextInt();
		
		
		for (i = numero; i >= 1; i = i - 1) {
					
			System.out.print("\n");
			System.out.print(i);
				
		}

	}

}
