package exercicios_easy;

public class Exercicio03_easy_2 {

	public void trocaPalavra() {
		String nome, sobrenome, auxiliar;
		nome = "Flavio";
		sobrenome = "Dias";
		auxiliar = nome;
		nome = sobrenome;
		sobrenome = auxiliar;
		
		
		System.out.println("Nome: " + nome);
		System.out.println("Sobrenome: " + sobrenome);
	}

}
