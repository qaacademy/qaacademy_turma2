package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercicios_medium.Exercicio04_medium;

public class TesteExercicio04_medium {
	@Test
	public void testeMultiplicacaoAteMil() {
		Exercicio04_medium ex4 = new Exercicio04_medium();
		assertEquals("A multiplicacao foi diferente do esperado", 1000, ex4.calcularMultiplicacaoNumeroInteiro());
	}
}
