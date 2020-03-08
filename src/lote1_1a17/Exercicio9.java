package lote1_1a17;

import java.util.Scanner;

public class Exercicio9 {

	
	public static void main(String[]args) {
		
		 try(Scanner sc = new Scanner(System.in)){
	        System.out.println("Digite 2 números inteiros: ");
	        int A = sc.nextInt();
	        int B = sc.nextInt();
	        System.out.println("A soma do quadrado destes números é " + ((A*A)+(B*B)));
	        
		 }
		
		
	}
}
