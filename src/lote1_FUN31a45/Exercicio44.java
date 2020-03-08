package lote1_FUN31a45;

import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {
		double NumeroBase;
		double Expoente;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da base: ");
		NumeroBase = sc.nextInt();
		System.out.println("Digite o valor do expoente: ");
		Expoente = sc.nextInt();
		System.out.println("O resultado da potência é de " + Pot(NumeroBase, Expoente));

	}

	public static double Pot(double NumeroBase, double Expoente) {
		double Potencia = 0;
		for (int Indice = 0; Indice <= Expoente; Indice++) {
			Potencia = Math.pow(NumeroBase, Expoente);
		}
		return Potencia;
	}
}
