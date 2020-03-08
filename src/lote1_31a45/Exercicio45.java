package lote1_31a45;

public class Exercicio45 {

	public static void main(String[] args) {
		Double NumeroAcima;
		Double Serie = 0.0;

		System.out.println("Calcule e mostre a série 1 - 2/4 + 3/9 - 4/16 + 5/25 + ... + 15/225");

		for (NumeroAcima = 1.0; NumeroAcima <= 15; NumeroAcima++) {
			if (NumeroAcima == 1) {
				Serie = 1.0;
			} else if (NumeroAcima % 2 == 0) {
				Serie = Serie + (NumeroAcima / Math.pow(NumeroAcima, 2));
				System.out.println(Serie);
			}
			Serie = Serie - (NumeroAcima / Math.pow(NumeroAcima, 2));
			System.out.println(Serie);
		}
		System.out.println("A soma da série da " + Serie);
	}

}
