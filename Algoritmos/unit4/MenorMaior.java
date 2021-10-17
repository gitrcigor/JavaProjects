package unit4;

import java.util.Scanner;

public class MenorMaior {
	//For

	public static void main(String[] args) {
		
		int menor;
		int maior;
		int numero;
		int temp;
				
		Scanner teclado = new Scanner(System.in);
		
		menor = 0;
		maior = 0;
		
		for (int i = 0; i < 5; i++) {
			
			System.out.print("\nDigite um numero qualquer: ");
			numero = teclado.nextInt();
			

			if (numero > maior) {
				maior = numero;
			} else if (numero < maior) {

			}
																		
		}		
		System.out.print("\nO menor valor dentre os inseridos é: " + menor);
		System.out.print("\nO maior valor dentre os inseridos é: " + maior);
			
	}

}
