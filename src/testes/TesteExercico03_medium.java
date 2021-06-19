package testes;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import exercicios_medium.Exercicio03_medium;

public class TesteExercico03_medium {

	@Test
	public void testeSomaNumerosAteMil() {
		Exercicio03_medium ex3 = new Exercicio03_medium();
		assertTrue("O numero esperado nao esta OK - "
		+ ex3.somaNumerosAteMil(), 
				ex3.somaNumerosAteMil() >= 1540);
	}
}
