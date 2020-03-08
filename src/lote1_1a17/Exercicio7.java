package lote1_1a17;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[]args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Digite o comprimento do paralelepípedo: ");
			float C = sc.nextFloat();
			System.out.println("Digite a largura do paralelepípedo: ");
			float L = sc.nextFloat();
			System.out.println("Digite a altura do paralelepípedo: ");
			float H = sc.nextFloat();
			System.out.println("O volume do paralelepípedo é de " + (L*H*C));
		}
		
		
		
	}
}
