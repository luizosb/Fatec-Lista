package lote1_1a17;

import java.util.Scanner;

public class Exercicio14 {

	public static void main (String[]args) {

		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Digite o valor do primeiro ângulo: ");
			double A = sc.nextDouble();
			System.out.println("Digite o valor do segundo ângulo");
			double B = sc.nextDouble();
			System.out.println("O valor do terceiro ângulo é de " + (180-A-B));			
		}
		
	}
}
