package exercicios_easy;

import javax.swing.JOptionPane;

public class Exercicio06_easy {// inicio classe

	public String verificaAprovacao(int nota1, int nota2) { // inicio metodo main

		int media = (nota1 + nota2) / 2;

		if (media > 5) {// inicio IF
			return "Você foi Aprovado!!!";
		} // Fim IF
		if (media < 5) {// inicio if
			return "Você foi Reprovado!!!";
		} // fim do if
		if (media == 5) {// inicio do if
			return "Você esta de exame!!!";
		} // fim do if
		return "Nota digitada é invalida";

	}// fim metodo main

}// fim da Classe

/*
 * 
 * 6-) Faça um algoritmo para ler duas notas, calcular a média. E SE - a média >
 * 5 Exibir aprovado; SE a média < que 5 exibir reprovado; Se media = 5 exibir
 * exame.
 * 
 */