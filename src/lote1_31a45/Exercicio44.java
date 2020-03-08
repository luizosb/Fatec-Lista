package lote1_31a45;

import java.util.Scanner;

public class Exercicio44 {

	public static void main(String[] args) {
		double NumeroBase;
		double Expoente;
		double Potencia = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor da base: ");
		NumeroBase = sc.nextInt();
		System.out.println("Digite o valor do expoente: ");
		Expoente = sc.nextInt();
		for (int Indice = 0; Indice <= Expoente; Indice++) {
			Potencia = Math.pow(NumeroBase, Expoente);
		}

		System.out.println("O resultado da potência é de " + Potencia);

	}

}
