package exercicios_medium;

public class Exercicio03_medium {

	public int somaNumerosAteMil() {
		int i = 0, soma = 0;
		while (i <= 1000) {// inicio enquanto
			soma = soma + i;
			if (soma >= 1500) {
				return soma;
			}
			i++;// i=i+1
		} // fim enquanto

		return soma;
	}

}
