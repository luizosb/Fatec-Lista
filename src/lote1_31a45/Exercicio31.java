package lote1_31a45;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			
			int n = 9;
			Double q;
			while(n < 150) {
				n = n + 1;
				q = Math.pow(n, 2);
				System.out.println("O quadrado de " + n + " é " + q + ".");
			}
		}

	}

}
