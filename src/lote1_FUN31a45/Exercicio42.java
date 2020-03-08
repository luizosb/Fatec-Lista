package lote1_FUN31a45;

public class Exercicio42 {

	public static void main(String[] args) {

		Integer Lado1 = 0;
		Integer Lado2 = 0;
		Integer Soma = 0;
		Integer Possib;

		Possib = 0;

		System.out.println("São " + dado(Lado1, Lado2, Soma, Possib) + " possibilidades.");

	}
	
	public static int dado(int Lado1, int Lado2, int Soma, int Possib) {
		for (Lado1 = 1; Lado1 <= 6; Lado1++) {
			for (Lado2 = 6; Lado2 <= 1; Lado2--) {
				Soma = Lado1 + Lado2;
				if (Soma == 7) {
					Possib = Possib + 1;
				}
			}
		}
		return Possib;	
	}

}
