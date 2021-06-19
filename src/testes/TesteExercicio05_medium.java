package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercicios_medium.Exercicio05_medium;

public class TesteExercicio05_medium {
	
	@Test
	public void testeMenor() {
		Exercicio05_medium ex5 = new Exercicio05_medium();
		assertEquals(1, ex5.verificaMenorNumero());
		
	}

}
