package exercicios_easy;

import javax.swing.JOptionPane;

public class Exercicio03_easy {

	public static void main(String[] args) {
		String nome, sobrenome; 
		nome = JOptionPane.showInputDialog("Digite seu nome: ");
		sobrenome = JOptionPane.showInputDialog("Digite seu sobrenome: ");

		System.out.println("Nome "+                      sobrenome); 
		System.out.println( "Sobrenome "+ nome);
	}

}
