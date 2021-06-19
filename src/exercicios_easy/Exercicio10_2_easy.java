package exercicios_easy;

public class Exercicio10_2_easy {
	
	public static void main(String[] args) {
		
		double juros,valorInvestido;
		juros= 0.05*10.00;
		valorInvestido = 1000;
		System.out.println("Valor investido: " + valorInvestido); 
		System.out.println("Valor dos juros: " + juros* valorInvestido);
		System.out.println("Total com juros: " + (valorInvestido*juros)+valorInvestido);
	}

}
