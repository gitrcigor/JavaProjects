package unit5;

import java.util.Scanner;

public class Alunos {
//Vetor
//Algoritmo para ler nome de aluno inserido e listá-lo em seguida
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		int i;
		String nome;
		String listaAlunos [] = new String[5];
		
		for (i = 0; i < 5; i++) {
			
			System.out.print("\nDigite o nome do aluno: ");
			nome = in.next();
				
			listaAlunos[i] = nome;
			
		}
		
		for (i = 0; i < 5; i++) {
			
			System.out.print("\nAluno " + i + ": "  + listaAlunos[i]);
			
		}
		
	}

}
