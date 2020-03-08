package lote1_1a17;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Digite o lado do quadrado: ");
			int L = sc.nextInt();
			System.out.print("A área do quadrado é de " + (L*L));
		}

	}

}
