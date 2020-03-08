package lote1_1a17;

import java.util.Scanner;

public class Exercicio13 {

	
	public static void main(String[]args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Digite a quantidade em kilos de alimento: ");
			double K = sc.nextDouble();
			double Q = K*1000;
			System.out.println("O alimento irá durar " + (Q/50) + " dias.");
			
		}
		
		
	}
}
