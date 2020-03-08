package lote1_FUN31a45;

import java.util.Scanner;

public class Exercicio37 {

	static int SomaFibonacci;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Integer Numero;
		Integer X, Y, Z;
		System.out.println("Digite um número inteiro: ");
		Numero = sc.nextInt();
		X = Numero - 1;
		Y = Numero - 2;
		System.out.println(Y);
		System.out.println(X);
		System.out.println("A série da " + fibonna(X, Y, Numero));

	}

	public static int fibonna(int X, int Y, int Numero) {
		if (Numero < 0) {
			Numero = Numero;
		} else {
			if (Numero == 1) {
				Numero = 1;
			} else {
			}
		}
		for (int Indice = 1; Indice <= 5; Indice++) {
			SomaFibonacci = X + Y;
			Y = X;
			X = SomaFibonacci;			
		}
		return SomaFibonacci;
	}

}
