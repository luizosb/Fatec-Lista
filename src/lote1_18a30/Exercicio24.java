package lote1_18a30;

import java.util.Scanner;

public class Exercicio24 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			int A = sc.nextInt();
			if ( A % 2 == 0 && A % 3 == 0) {
				System.out.println("O valor é divisível por 2 e 3.");
			} else if ( A % 3 == 0) {
				System.out.println("O valor é apenas divisível por 3.");
			} else {
				System.out.println("O valor é apenas divisível por 2.");
			}
		}
	}

}
