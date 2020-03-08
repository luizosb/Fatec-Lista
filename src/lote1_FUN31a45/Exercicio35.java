package lote1_FUN31a45;

import java.util.Scanner;

public class Exercicio35 {
	
	static int soma = 0;
	public static void main (String[] args) {
	
		Scanner sc = new Scanner(System.in);
			
			int maior = 0;
			int menor = 0;
			
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
			System.out.println("A soma da " + num(menor, maior));
		}
	
	public static int num(int maior, int menor) {
		for (int ind = menor; ind <= maior; ind++) {
			if(ind % 2 != 0) {
				soma = soma + ind;
			}
		}
		return soma;
		
	}
		
	
}
