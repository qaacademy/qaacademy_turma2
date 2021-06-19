package exercicios_medium;

public class Exercicio01_medium {

	public String verificaParImpar(int numero) {

		if (numero % 2 == 0) {
			System.out.println("O numero" +(numero) + " é par");
			return "O numero " + (numero) + " é par";
		} // fim se
		else {
			return "O numero " + numero + " é impar";
		} // Fim senão
	}

}
