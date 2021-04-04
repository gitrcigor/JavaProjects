package unit4;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonacci {
//For
//Fibonacci
	
	public static void main(String[] args) {
		
		int contadorS;
		int s1 = 1, s2 = 1;
		int posicao100 = 0;
		int posicao10000 = 0;
		int posicao9 = 0;
		
		System.out.print("\nSequência: 1,1,2,3,5,8,13,21...");
	
		
		for (int i = 3; i <= 10000; i++) {
			
			contadorS = s1 + s2;
			
			s1 = s2;
			s2 = contadorS;
			
			if (i == 9) 
				posicao9 = contadorS;
					
			if (i == 100) 
				posicao100 = contadorS;
						
			if (i == 10000) 		
				posicao10000 = contadorS;
				
		}
			
		System.out.print("\nTermo 9: " + posicao9);
		System.out.print("\nTermo 100: " + posicao100);
		System.out.print("\nTermo 10000: " + posicao10000);

	}

}
