package lote1_31a45;

public class Exercicio39 {

	public static void main(String[] args) {
		Integer graos, casa, Indice;
		int Qtde;
		Qtde = 1;
		casa = 0;
		for (Indice = 1; Indice <= 64; Indice++) {
			casa = casa + 1;
			Qtde = Qtde * 2;
		}
		System.out.println(
				"A quantidade de grãos que cabe no tabuleiro de xadrez de " + (casa + 1) + " casas é de " + Qtde);

	}
}
