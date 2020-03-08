package lote1_FUN31a45;

public class Exercicio31 {

	
	public static void main(String[] args) {
		double ind, quadrado;
		System.out.println("---------------A lista de quadrados de 10 a 150:---------------------");
		for (ind = 10; ind <= 150; ind++) {
			Quadrado(ind);
		}
		System.out.println("---------------Fim da Lista------------------------------------------");
	}

	public static double Quadrado(double ind) {
			double quadrado;
			quadrado = Math.pow(ind, 2);
			System.out.println("O quadrado de " + ind + " � de " + quadrado);
			return quadrado;			
	}
}
