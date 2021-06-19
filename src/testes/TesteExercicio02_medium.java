package testes;


import exercicios_medium.Exercicio02_medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TesteExercicio02_medium {
	
	@Test
	public void calcularValorInvestimento() {
		Exercicio02_medium ex2 = new Exercicio02_medium();
		assertEquals("81444.73133887208", ex2.calcularInvestimentoJurosCompostos(50000).toString());      ;
	}

}
