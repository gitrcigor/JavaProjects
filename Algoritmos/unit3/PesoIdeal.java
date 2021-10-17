package unit3;

import javax.swing.JOptionPane;

public class PesoIdeal {

	public static void main(String[] args) {
		double altura, pesoIdeal;
		String sexo;

		// Leitura
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em cm: "));

		sexo = JOptionPane.showInputDialog("Digite M para masculino ou F para feminino: ");

		// Processamento e saida de resultado

		if (sexo.equalsIgnoreCase("M")) {

			pesoIdeal = (72.7 * altura) - 58;
			System.out.print("\nSeu peso ideal é de: " + pesoIdeal + " kilos");

		} else if (sexo.equalsIgnoreCase("F")) {

			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.print("\nSeu peso ideal é de: " + pesoIdeal + " kilos");
		}

	}

}
