package lote1_FUN31a45;

import java.util.Scanner;

public class Exercicio33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double n = sc.nextInt();
		System.out.println("O resultado da soma: " + soma(n));
	}

	public static double soma(double n) {
		double soma = 0;
		for (double ind = 1; ind <= n; ind++) {
			soma = soma + (1 / ind);
		}
		return soma;
	}

}
