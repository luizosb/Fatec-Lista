package lote1_31a45;

public class Exercicio43 {

	public static void main(String[] args) {

		Integer N1, N2, Serie;
		N2 = 0;
		Serie = 1;
		for (N1 = 1; N1 <= 50; N1++) {
			N2 = (N1 + N1 + 1);
			N1 = N2 - N1;
			Serie = Serie + (N1 / N2);
		}
		System.out.println("A soma da série tem um resultado de " + Serie);
	}

}
