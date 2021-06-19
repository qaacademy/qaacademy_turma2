package exercicios_medium;

public class Exercicio09_medium {
	
	public String mesDoAno(int pos) {
		
		String [] nomeAluno = new String[5];
		int [] numeroAluno = new int [5];

		
		nomeAluno[0] = "Micheline";
		numeroAluno[0] = 1; 
		
		nomeAluno[1] = "Luiz Claudio";
		numeroAluno[1] = 2; 
		
		nomeAluno[2] = "Misrael";
		numeroAluno[2] = 3;
		
		nomeAluno[3] = "Robson";
		numeroAluno[3] = 4;
		
		nomeAluno[4] = "Rodnei";
		numeroAluno[4] = 5;

		String resultado = "Nome do Aluno: "+nomeAluno[pos] +" Numero: "
				+numeroAluno[pos];
		
		return resultado;
		
	}

}
