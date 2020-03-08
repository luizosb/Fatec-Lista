package lote1_31a45;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite um número: ");
			int n = sc.nextInt();
			double soma = 0;
			for (double ind = 1; ind <= n; ind++) {
				soma = soma + (1/ind);
			}
			System.out.println("O resultado da soma: " + soma);
		}

	}

}
