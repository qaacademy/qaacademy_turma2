package exercicios_easy;

import javax.swing.JOptionPane;

/*
 * 5-) Faça um algoritmo para ler três números inteiros,
	armazenar em variáveis, e exibir a soma, a subtração,
	multiplicação e a média dos três números digitados.
 */
public class Exercicio05_easy {// Abre a classe

	public void calculaOperacoesMatematica(int numero1, int numero2, int numero3) {//abertura metodo main/principal

		int resultadoSoma, resultadoSubtracao, resultadoMultiplacao,
				media;//declaração das variaveis

		resultadoSoma = numero1 + numero2 + numero3;//calculando a soma dos tres numeros
		resultadoSubtracao = numero1 - numero2 - numero3;;//calculando a subtração
		resultadoMultiplacao = numero1 * numero2 * numero3;;//multiplicação dos tres numeros
		media = (numero1 + numero2 + numero3) / 3;//calculando a media dos tres numeros

		System.out.println("Resultado da soma é: " + resultadoSoma);//exibindo o resultado da soma
		System.out.println("Resultado da subtração é: " + resultadoSubtracao);//exibindo resultado da subtração
		System.out.println("Resultado da multiplicação é: " + resultadoMultiplacao);//exibindo resultado da multiplicação
		System.out.println("A media dos tres é : " + media);//exibindo media

	}

}// Fecha a classe


