package testes;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercicios_medium.Exercicio09_medium;

public class TesteExercicio09_medium2 {
	
	@Test
	public void testeRetornaMes() {
		
		Exercicio09_medium ex9 = new Exercicio09_medium();
		assertEquals("Nome do Aluno: Micheline Numero: 1"
				,ex9.mesDoAno(0));
		
	}

}
