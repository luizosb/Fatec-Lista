package lote1_31a45;

import java.util.Scanner;

public class Exercicio35 {
	
	public static void main (String[] args) {
	
		try(Scanner sc = new Scanner(System.in)){
			
			int maior = 0;
			int menor = 0;
			int soma = 0;
			
			System.out.println("Digite um numero: ");
			int n1 = sc.nextInt();
			System.out.println("Digite outro numero: ");
			int n2 = sc.nextInt();
			if(n1 > n2) {
				maior = n1;
				menor = n2;
			} else {
				maior = n2;
				menor = n1;
			}
			for (int ind = menor; ind <= maior; ind++) {
				if(ind % 2 != 0) {
					soma = soma + ind;
				}
			}
			System.out.println("A soma da " + soma);
		}
		
		
	}
}
