package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import exercicios_medium.Exercicio06_medium;

public class TesteExercicio06_medium {

	@Test
	public void testeCalcularFatorial() {

		Exercicio06_medium ex6 = new Exercicio06_medium();
		assertEquals("Calculo realizado incorretanente", 120, ex6.calcularFatorial(5));
		assertEquals("Calculo realizado incorretanente", 1, ex6.calcularFatorial(0));

	}

}
