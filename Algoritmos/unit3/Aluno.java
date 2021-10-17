package unit3;

import java.util.Scanner;

//Estrutura de decisão
//If/Else
public class Aluno {

	public static void main(String[] args) {
		final double numero_avaliacoes = 4;
		double nota1, nota2, nota3, nota4;
		double media;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Favor informar a nota 1: ");
		nota1 = teclado.nextDouble();

		System.out.print("Favor informar a nota 2: ");
		nota2 = teclado.nextDouble();

		System.out.print("Favor informar a nota 3: ");
		nota3 = teclado.nextDouble();

		System.out.print("Favor informar a nota 4: ");
		nota4 = teclado.nextDouble();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.print("\nA média aritmética é: " + media);

		if (media > 5) {
			System.out.println("\nAluno aprovado!");
		} else {
			System.out.println("\nAluno reprovado!");
		}

	}

}
