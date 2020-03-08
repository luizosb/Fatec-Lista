package lote1_18a30;

import java.util.Scanner;

public class Exercicio18 {
	
	public static void main(String[]args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Digite um valor inteiro: ");
			int A = sc.nextInt();
			System.out.println("Digite o segundo valor inteiro: ");
			int B = sc.nextInt();
			if(A>B) {
				System.out.println("O valor da diferença é " + (A-B));
			} else {
				System.out.println("O valor da diferença é " + (B-A));
			}
			
			
		}
	}

}
