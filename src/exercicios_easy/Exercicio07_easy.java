package exercicios_easy;

import javax.swing.JOptionPane;

public class Exercicio07_easy {

	public double calcularInss(double salario) {
	
		if (salario <= 1045.00) {// abertura if
			return salario * 0.075; // 7,5%
		}

		if (salario >= 1045.01 && salario <= 2089.60) {
			return salario * 0.09; // 9%
		}
		if (salario >= 2089.61 && salario <= 3134.40) {
			return salario * 0.12; // 12%

		}
		if (salario >= 3134.41 && salario < 6101.06) {
			return salario * 0.14; // 14%
		} 
			
		return (6101.06 * 0.14); // 14%;

	}// fim do main

}// fim da classe
