package unit4;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class CadastroAluno {
//While
	
	public static void main(String[] args) {
		
		String nome;
		String endereco;
		String telefone;
		int matricula;
		int cont = 0;
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("\nInsira a matricula do aluno: ");
		matricula = teclado.nextInt();
		
		
		while (matricula != 0) {
			
//			System.out.print("\nInforme o nome do aluno: ");
//			nome = teclado.next();
//			
			nome = JOptionPane.showInputDialog("Informe o nome do aluno");
				
//			System.out.print("\nInforme o endereço: ");
//			endereco = teclado.next();
			
			endereco = JOptionPane.showInputDialog("Informe o endereço: ");
		
//			System.out.print("\nInforme o telefone: ");
//			telefone = teclado.next();
					
			telefone = JOptionPane.showInputDialog("Informe o telefone: ");
					
			cont++;	
			
			System.out.print("\nInsira a matricula do próximo aluno: ");
			matricula = teclado.nextInt();
		}
		
		//System.exit(0);
	}

}
