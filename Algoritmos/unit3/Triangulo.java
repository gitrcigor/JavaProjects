package unit3;

import java.util.Scanner;

public class Triangulo {

//If //Else
//Ler valores, verificar se podem ser triangulo e qual tipo seria

	public static void main(String[] args) {

		int ladoA, ladoB, ladoC;

		// Leitura
		Scanner teclado = new Scanner(System.in);
		System.out.print("\nInforme o primeiro lado do triangulo: ");
		ladoA = teclado.nextInt();

		System.out.print("\nInforme o segundo lado do triangulo: ");
		ladoB = teclado.nextInt();

		System.out.print("\nInforme o terceiro lado do triangulo: ");
		ladoC = teclado.nextInt();

		// Processamento // Resultados

		if ((ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB)) {

			if ((ladoA == ladoB) && (ladoA != ladoC))  {
				System.out.print("\nTriangulo Isosceles.");
				
			} else if ((ladoA == ladoB) && (ladoB == ladoC)) {
				System.out.print("\nTriangulo Equilatero");
				
			} else {
				System.out.print("\nTriangulo Escaleno");
			}
			
		} else {
			System.out.print("\nValor invalido!");
			Triangulo.main(null);
		}

		

	}

}
