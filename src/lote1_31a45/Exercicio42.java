package lote1_31a45;

public class Exercicio42 {

	public static void main(String[] args) {

		Integer Lado1;
		Integer Lado2;
		Integer Soma;
		Integer Possib;

		Possib = 0;

		for (Lado1 = 1; Lado1 <= 6; Lado1++) {
			for (Lado2 = 6; Lado2 <= 1; Lado2--) {
				Soma = Lado1 + Lado2;
				if (Soma == 7) {
					Possib = Possib + 1;
				}
			}
		}
		System.out.println("São " + Possib + " possibilidades.");

	}

}
