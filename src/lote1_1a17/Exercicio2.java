package lote1_1a17;

import java.util.Scanner;

public class Exercicio2 {
	
	public static void main (String[]args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Digite o salário atual: ");
			double S = sc.nextDouble();
			System.out.print("O salário com reajuste é de " + (S*1.15));
		}
		
	}

}
