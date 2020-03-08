package lote1_1a17;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[]args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Digite 2 valores reais: ");
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			System.out.println("A diferença dos quadrados desses valores é " + ((A*A)-(B*B)));
		}
	}

}
