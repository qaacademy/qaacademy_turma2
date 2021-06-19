package exercicios_medium;

public class Exercicio02_medium {

	double  juros = 0.05, ano = 1;

	public Double calcularInvestimentoJurosCompostos(double valorAtualizado) {
		while (ano <= 10) {// Inicio enquanto
			valorAtualizado = valorAtualizado + (valorAtualizado * juros);
			ano++; // ano=ano+1;
		} // Fim enquanto

		return valorAtualizado;

	}

}
