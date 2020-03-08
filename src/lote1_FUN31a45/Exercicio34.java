package lote1_FUN31a45;

import java.util.Scanner;

public class Exercicio34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int n = sc.nextInt();
		for (int ind = 1; ind <= 10; ind++) {
			System.out.println("O " + n + " multiplicado por " + ind + " da " + mult(n, ind));
		}
	}
	
	public static int mult(int n, int ind) {
		int tab = n * ind;
		return tab;
	}
}
