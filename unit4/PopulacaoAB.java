package unit4;

import javafx.beans.binding.When;

public class PopulacaoAB {

	public static void main(String[] args) {

		final double habitantesA = 5000000;
		final double habitantesB = 7000000;

		final double taxaNatalidadeA = 0.03;
		final double taxaNatalidadeB = 0.02;

		int tempo = 0;

		double populacaoA = habitantesA;
		double populacaoB = habitantesB;

		do {

			populacaoA = (populacaoA + populacaoA * taxaNatalidadeA);
			populacaoB = (populacaoB + populacaoB * taxaNatalidadeB);

			System.out.print("\nPopulacao A = " + populacaoA);
			System.out.print("\nPopulacao B = " + populacaoB);
			
			tempo++;

		} while (populacaoA < populacaoB);

		System.out.print("\nA população A ultrapassará B em " + tempo + " anos." );

	}

	private static void When(boolean b) {
		// TODO Auto-generated method stub

	}

}
