package lote1_1a17;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Digite os valores de A, B e C; de uma equação de 2ºgrau: ");
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			double C = sc.nextDouble();
			double D = (B*B) - 4*A*C;
			Math.sqrt(D);
			double X1 = (-B + D)/2*A;
			double X2 = (-B - D)/2*A;
			System.out.print("As raízes desta equação são " + X1 + " e " + X2 +".");
			
		}

	}

}
