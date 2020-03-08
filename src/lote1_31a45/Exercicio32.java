package lote1_31a45;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite um número inteiro: ");
			int n = sc.nextInt();
			int f = 1;
			for (int Ind = 1; Ind <= n; Ind++) {
				f = f * Ind;
			}
			System.out.println("O fatorial de " + n + " é " + f);

		}
	}
}
