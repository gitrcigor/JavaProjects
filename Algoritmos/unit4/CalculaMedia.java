package unit4;
import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		
		double somaValor = 0;
		double cont = 0;
		double valor = 0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("\nInsira um valor para saber sua média: ");
		valor = teclado.nextDouble();
		
		
		while (valor != -1) {
			
			somaValor = somaValor + valor;
			
			cont++;
					
			System.out.print("\nDigite o próximo valor: ");
			valor = teclado.nextDouble();
			
		}
		
		double media = somaValor / cont;
		
		System.out.print("\nA média é: " +  media);

	}

}
