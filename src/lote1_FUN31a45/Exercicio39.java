package lote1_FUN31a45;

public class Exercicio39 {

	public static void main(String[] args) {
		Integer graos, casa;
		int Qtde;
		Qtde = 1;
		casa = 0;
		System.out.println(
				"A quantidade de grãos que cabe no tabuleiro de xadrez de " + (casa + 1) + " casas é de " + graos(casa, Qtde));

	}
	
	public static int graos(int casa, int Qtde) {
		for (int Indice = 1; Indice <= 64; Indice++) {
			casa = casa + 1;
			Qtde = Qtde * 2;
		}
		return Qtde;
		
	}
}
