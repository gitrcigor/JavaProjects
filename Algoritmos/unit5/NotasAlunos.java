package unit5;

import java.util.Scanner;

public class NotasAlunos {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int i, j;
		int nota;
		int aprovados = 0, reprovados = 0;
		double media = 0;
		double soma = 0;
		String nomeAlunos;

		boolean situacaoAlunos[] = new boolean[5];
		String vetNomeAluno[] = new String[5];
		double notaVetAluno[][] = new double[5][4];
		
		//L E I T U R A
		for (i = 0; i < 5; i++) {
			
			System.out.print("\nInforme o nome do aluno: ");
			nomeAlunos = in.next();
			vetNomeAluno[i] = nomeAlunos;
			
			
			for (j = 0; j < 4; j++) {
				
				System.out.print("\nInsira sua nota: ");
				notaVetAluno[i][j] = in.nextDouble();
				soma = soma + notaVetAluno[i][j];
				
			}
			
			media = soma / 4;
			
			if (media < 5)
				situacaoAlunos[i] = false;
			else
				situacaoAlunos[i] = true;
			
			soma = 0;
		
		}
			
		//E S C R I T A
		for (i = 0; i < 5; i++) {
			
			if (situacaoAlunos[i]) 
				aprovados++;
			else
				reprovados++;
			
		}
		System.out.print("\nAprovados: " + aprovados);
		System.out.print("\nReprovados: " + reprovados);
			
						
		/*	
				
		
		// Inserção de dados no array mult
		for (i = 0; i < 5; i++) {

			System.out.print("\nNome do aluno: ");
			nomeAlunos = in.next();
			
			vetNomeAluno[i] = nomeAlunos;

			
			for (j = 0; j < 4; j++) {

				System.out.print("\nInforme a " + (j + 1) + "° nota: ");
				nota = in.nextInt();				
				notaVetAluno[j] = nota;
				
				//soma = soma + notaVetAluno[j];				
			}

			System.out.print("\n");
		}
		
		
		// Exibição do array mult
		for (i = 0; i < 5; i++) {

			System.out.print("\nAluno: " + vetNomeAluno[i]);
			System.out.print("\n");

			for (j = 0; j < 4; j++) {

				System.out.print("\nNotas: " + notaVetAluno[j]);
				System.out.print("\n");				
				
			}
			media = media + notaVetAluno[j];
			media = soma / 4;
			System.out.print("\nMédia do aluno " + vetNomeAluno[i] + " igual a: " + media);
			System.out.print("\n");
			
		}
		
		
		*/

		in.close();
	}

}
