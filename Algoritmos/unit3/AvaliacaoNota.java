package unit3;

import java.util.Scanner;

public class AvaliacaoNota {

	// Conceito nota
	public static void main(String[] args) {
		
		double nota;
		
		//Leitura
		Scanner teclado = new Scanner(System.in);
		System.out.print("\nInsira sua nota de 0 a 100 para saber o conceito: ");
		nota = teclado.nextDouble(); 
		
		//Processamento //Resultados
		
		if ((nota >= 0) && (nota <= 100)) {

			if (nota >= 90) {
				System.out.print("\nConceito Excelente!");
			}else if (nota >= 70) {
				System.out.print("\nConceito Bom!");
			}else if (nota >= 50) {
				System.out.print("\nConceito Regular!");
			}else if (nota >= 0) {
				System.out.print("\nInsulficiente!");
			}	
			
		}else {
			System.out.print("\nNota inválida!");
			AvaliacaoNota.main(null);
		}		

	}

}
