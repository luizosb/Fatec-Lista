package lote1_18a30;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Digite dois valores reais: ");
			double A = sc.nextDouble();
			double B = sc.nextDouble();
			if(A>B) {
				System.out.println(A + " é maior que " + B + ".");
			} else {
				System.out.println(B + " é maior que " + A + ".");
			}
		}
		
		
	}

}
