package lote1_1a17;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[]args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Digite o valor do primeiro cateto: ");
			double A = sc.nextDouble();
			System.out.println("Digite o valor do segundo cateto: ");
			double B = sc.nextDouble();
			double C = (A*A) + (B*B);
			System.out.println("O valor da hipotenusa é de " + Math.sqrt(C));
		}
	}
}
