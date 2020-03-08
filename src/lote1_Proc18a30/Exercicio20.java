package lote1_Proc18a30;

import java.util.Scanner;

public class Exercicio20 {


	public static void main(String[] args) {
		equacao();
	}

	public static void equacao() {
		double A, B, C;
		double D;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 3 n�meros reais para a equa��o.");
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		D = Math.pow(B, B) - 4 * A * C;
		double x1, x2;
		if (D > 0) {
			x1 = (-B + Math.sqrt(D)) / 2 * A;
			x2 = (-B - Math.sqrt(D)) / 2 * A;
			System.out.println("As ra�zes s�o" + x1 + " e" + x2);
		} else if (D == 0) {
			x1 = (-B + Math.sqrt(D)) / 2 * A;
			System.out.println("A raiz �" + x1);
		} else {
			System.out.print("A equa��o n�o possui valores reais.");
		}
	}
}
