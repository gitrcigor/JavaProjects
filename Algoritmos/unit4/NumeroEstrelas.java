package unit4;
import java.util.Scanner;

public class NumeroEstrelas {
//Estrutura repetição
	public static void main(String[] args) {
		
		int i, numeroDeLinhas;
		String estrela = "*";
	
		
		Scanner in = new Scanner(System.in);
		System.out.print("\nInforme o número de linhas: ");
		numeroDeLinhas = in.nextInt();
		
		
		for (i = 1; i <= numeroDeLinhas; i++) {
			
			System.out.println(estrela);
			estrela = estrela + "*";
			
		} 
			
	}

}
