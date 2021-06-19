package testes;


import static org.junit.Assert.assertEquals;
import org.junit.Test;
import exercicios_medium.Exercicio01_medium;

public class TesteExercicio01_medium {

	@Test
	public void testaParOuImpar() {

		Exercicio01_medium ex1 = new Exercicio01_medium();
		assertEquals("O texto esta diferente", "O numero 1 é impar", ex1.verificaParImpar(1));
	}
}
