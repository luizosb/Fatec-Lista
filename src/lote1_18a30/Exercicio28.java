package lote1_18a30;

import java.util.Scanner;

public class Exercicio28 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Qual o preço atual do produto? ");
			double PA = sc.nextDouble();
			System.out.println("Qual a venda média mensal dele? ");
			double MA = sc.nextDouble();
			if (MA < 500 && PA < 30) {
				double PN = PA * 1.10;
				System.out.println("O novo preço do produto é de" + PN);
			} else if (MA >= 500 && MA < 1000 && PA >= 30 & PA < 80) {
				double PN = PA * 1.15;
				System.out.println("O novo preço do produto é de" + PN);
			}
			if (MA >= 1000 && PA < 80) {
				double PN = PA * 0.95;
				System.out.println("O novo preço do produto é de" + PN);
			} else {
				System.out.println("O preço do produto permanecerá o mesmo, de" + PA + " reais");
			}
		}
	}

}
