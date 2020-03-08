package lote1_18a30;

import java.util.Scanner;

public class Exercicio20 {

	public static void main(String[]args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Digite 3 valores reais para a equação de 2ºgrau: ");
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			double D = (B*B) - 4*A*C;
			Math.sqrt(D);
			if (D < 0) {
				System.out.println("Não existe raízes reais.");
			} else if (D ==0) {
				double X1 = (-B + D)/2*A;
				System.out.println("Existe apenas uma raíz real com o valor de " + X1);
			} else {
				double X1 = (-B + D)/2*A;
				double X2 = (-B - D)/2*A;
				System.out.println("Existe 2 raízes reais sendo elas " + X1 + " e " + X2);
			}
		}
	}
}
