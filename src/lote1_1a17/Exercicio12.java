package lote1_1a17;

import java.util.Scanner;

public class Exercicio12 {

	
	public static void main(String[]args) {
		
		try(Scanner sc = new Scanner(System.in)){
		System.out.println("Qual o ano atual ?");
		int AA = sc.nextInt();
		System.out.println("Qual seu ano de nascimento ?");
		int AN = sc.nextInt();
		System.out.println("A sua idade é de " + (AA-AN) + ", e sua idade daqui 17 anos será de "
				+ ((AA-AN)+17));
		}
	}
}
