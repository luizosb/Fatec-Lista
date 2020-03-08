package lote1_FUN31a45;

import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
		double num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro:");
		num = sc.nextDouble();
		System.out.println("O fatorial deste n�mero � " + fatorial(num));
	}

	public static double fatorial(double num) {
		double fat;
		fat = 1;
		for (double ind = 1; ind <= num; ind++) {
			fat = fat * ind;
		}
		return fat;
	}

}
