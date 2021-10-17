package unit4;
import java.util.Scanner;

public class Fatorial {
//For
//Fatorial
	public static void main(String[] args) {
		
		int i;
		int valorInformado;
		int fatorial = 1;
		
		Scanner in = new Scanner(System.in);
		System.out.print("\nInsira um valor inteiro para saber seu fatorial: ");
		valorInformado = in.nextInt();
		i = valorInformado;
						
		while (i >= 1) {
			
			fatorial = fatorial * i;
			
			i--;
		}
					
		System.out.print("\nO resultado do fatorial informado é igual a: " + fatorial);
		System.exit(0);
	}

}
