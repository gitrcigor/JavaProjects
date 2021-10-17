package unit4;

import java.util.Scanner;

public class MostraTabuada {
//For
	
	
	public static void main(String[] args) {
		
		int i;
		int numero;
		int total;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("\nDigite um numero para saber sua tabuada: ");
		numero = teclado.nextInt();
		
		
		for (i = 0; i < 100; i++) {
			
			total = numero * i;
			System.out.print("\n");
			System.out.print(numero + "x" + i + "=" + total);
			i = i++;
			
		}
	
		teclado.close();
	}

}
