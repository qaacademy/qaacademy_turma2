package exercicios_easy;

import javax.swing.JOptionPane;

/*
 * 
 * //4-)  Faça um algoritmo para ler um número inteiro,
 * armazenar em uma variável, calcular o dobro, e exibir. 
 * 
 */

public class Exercicio04_easy {

	public void calcularDobro() {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
		System.out.println("O dobro do numero "+numero + " é: "+(numero*2));

	} // fim Metodo calculaDobro

}// fim Classe
