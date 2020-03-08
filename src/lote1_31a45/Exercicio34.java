package lote1_31a45;

import java.util.Scanner;

public class Exercicio34 {
	
	public static void main (String[]args) {
		
		try(Scanner sc = new Scanner(System.in)){
			
			System.out.println("Digite um número: ");
			int n = sc.nextInt();
			for(int ind = 1; ind <= 10; ind++) {
				int tab = n*ind;
				System.out.println("O " + n + " multiplicado por " + ind+ " da " + tab);
			}
		}
	}
}
