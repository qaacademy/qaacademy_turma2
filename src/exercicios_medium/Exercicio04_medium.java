package exercicios_medium;

public class Exercicio04_medium {

	public int calcularMultiplicacaoNumeroInteiro() {

		int resultadoMultiplicacao = 1, i = 1;
		
		while (i <= 1000) {// inicio enquanto
			resultadoMultiplicacao = resultadoMultiplicacao * i;
			if (resultadoMultiplicacao >= 1000000) {// inicio SE
				resultadoMultiplicacao = 1;
			} // Fim se
			i++; // i=i+1
		} // fim enquanto
		return resultadoMultiplicacao;
	}

}
