package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import exercicios_medium.Exercicio07_medium;

public class TesteExercicio07_medium {
	
	@Test
	public void testeRetornaMes() {
		
		Exercicio07_medium ex7 = new Exercicio07_medium();
		assertEquals("Janeiro",ex7.mesDoAno(0));
		
	}

}
