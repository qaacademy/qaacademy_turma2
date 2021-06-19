package exercicios_medium;

public class Exercicio10_medium {

	public int calcularTermoSequenciaFibonacci(int termo) {
		int i = 2;
		int[] vetFibonacci = new int[termo];
		vetFibonacci[0] = 0;
		vetFibonacci[1] = 1;

		while (i < termo) {// inicio algoritmo
			vetFibonacci[i] = vetFibonacci[i - 2] + vetFibonacci[i - 1];
			i++; // i=i+1
		} // fim algoritmo

		return vetFibonacci[termo-1];

	}

}
