package lote1_18a30;

import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite dois números inteiros: ");
			int N1 = sc.nextInt();
			int N2 = sc.nextInt();
			if (N1 % N2 == 0 && N1 >= N2) {
				System.out.println(N1 + " é multiplo de " + N2);
			} else if (N2 % N1 == 0 && N2 >= N1) {
				System.out.println(N2 + " é multiplo de" + N1);
			} else {
				System.out.println("Os números não são multiplos entre si.");
			}

		}
	}
}
