package exercicios_medium;

public class Exercicio06_medium {

	public int calcularFatorial(int numero) {
		int totalFatorial, i;
		totalFatorial = numero;
		i = totalFatorial;
		if (totalFatorial == 0 || totalFatorial == 1) {
			return 1;
		} else { // inicio senao
			while (i > 1) {// inicio
				totalFatorial = totalFatorial * (i - 1);
				i--;
			} // fim enquanto
		} // fim senao

		return totalFatorial;

	}

}
