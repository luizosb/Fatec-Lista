package lote1_FUN31a45;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double n = sc.nextInt();
		double f = 1;
		double soma = 0;
		System.out.println("A soma da " + soma(n,f,soma));
	}

	public static double soma(double n, double f, double soma) {
		for (double ind = 1; ind <= n; ind++) {
			f = ind * f;
			soma = soma + (1 / f);
		}
		return soma;
	}
}
