package exercicios_medium;

import javax.swing.JOptionPane;

public class Exercicio05_medium {

	public int verificaMenorNumero() {
		int numDigitado, menorDigitado = 0, i = 1;
		while (i <= 5) {// inicio enquanto
			numDigitado = Integer.parseInt(JOptionPane.
					showInputDialog("Digite um numero"));

			if (numDigitado < menorDigitado || i == 1) {// inicio se
				menorDigitado = numDigitado;
			} // fim se
			i++;
		} // fim enquanto

		return menorDigitado;

	}

}
