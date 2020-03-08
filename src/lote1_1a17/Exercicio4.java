package lote1_1a17;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Digite uma temperatura em Celsius: ");
			float C = sc.nextFloat();
			System.out.printf("Essa temperatura em Fahrenheit é de %.1f .", (((C*9/5)+32)));
		}

	}

}
