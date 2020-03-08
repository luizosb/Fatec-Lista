package lote1_31a45;

import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[]args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Digite um número: ");
			double n = sc.nextInt();
			double f = 1;
			double soma = 0;
			for(double ind = 1; ind <=n;ind++ ) {
				f = ind*f;
				soma = soma + (1/f);
			}
			System.out.println("A soma da "+ soma);
			
		}
		
		
	}
}
