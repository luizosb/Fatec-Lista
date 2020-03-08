package lote1_1a17;

import java.util.Scanner;

public class Exercicio8 {
	
	
	public static void main(String[]args) {
		
		try(Scanner sc = new Scanner(System.in)){
		System.out.println("Qual o valor da sua poupança?");
		float P = sc.nextFloat();
		System.out.println("Essa poupança rendeu " + (P*1.3));
		}
	}

}
