package exercicios_easy;

import javax.swing.JOptionPane;

public class Exercicio10_easy {// Inicio Classe

	public void calcularValorInvestimentoJurosSimples(double valorInvestido) {

		int ano = 1;//estou declarando uma variavel
		double juros = 0;
		while (ano <= 10) {
			juros = juros + valorInvestido * 0.05;
			ano++; // ano = ano +1
		}
		System.out.println("Valor Investido = " + valorInvestido);
		System.out.println("Valor dos juros = " + juros);
		System.out.println("Total com juros= " + (valorInvestido + juros));
	}
	
	public void calcularValorInvestimentoJurosSimples() {// SOBRECARGA

		int ano = 1;//estou declarando uma variavel
		double juros = 0;
		double valorInvestido = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor de investimento"));
		while (ano <= 10) {
			juros = juros + valorInvestido * 0.05;
			ano++; // ano = ano +1
		}
		System.out.println("Valor Investido = " + valorInvestido);
		System.out.println("Valor dos juros = " + juros);
		System.out.println("Total com juros= " + (valorInvestido + juros));
	}

}// Fim da classe
