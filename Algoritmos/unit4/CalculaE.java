package unit4;
import java.util.Scanner;

public class CalculaE {
//For
	
	public static void main(String[] args) {
		
		double x, e;
		int i;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("\nFavor informar o valor de x: ");
		x = teclado.nextInt();
		
		e = 0;
		
		for ( i = 1; i <= 50; i++) 
			
			e = e + Math.pow(x, i) / i;
						
			
		System.out.print("\nO resultado da equação é: " + e);
	}

}
