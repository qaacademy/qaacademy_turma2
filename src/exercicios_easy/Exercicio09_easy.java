package exercicios_easy;

import javax.swing.JOptionPane;

public class Exercicio09_easy {//inicio do algoritmo

	public void calcularTabuada() {
		
		int i=1, numero;
		
		numero = Integer.parseInt(
		JOptionPane.showInputDialog("Digite um numero inteiro!")); 
		
		while(i<=10) { //inicio enquanto
		System.out.println(numero + " * " + i + " = "+(numero*i));
		i++; // i=i+1
		} //fim enquanto
	}
}//fim algoritmo
