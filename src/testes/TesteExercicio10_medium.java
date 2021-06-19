package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import exercicios_medium.Exercicio10_medium;

public class TesteExercicio10_medium {
	
	@Test
	public void calculaTermoFibonacci() {
		
		Exercicio10_medium ex10 = new Exercicio10_medium();
		assertEquals("Valor do termo Fibonacci incorreto", 34, 
				ex10.calcularTermoSequenciaFibonacci(10));
		
	}

}
