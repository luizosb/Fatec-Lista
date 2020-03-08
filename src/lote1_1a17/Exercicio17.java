package lote1_1a17;

import java.util.Scanner;

public class Exercicio17 {
	
	public static void main(String[]args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Quantas horas o percurso possui ?");
			int H = sc.nextInt();
			System.out.println("Qual a velocidade média ?");
			double VM = sc.nextDouble();
			double L = (VM*H)/12;
			System.out.println("Gastou " + L + " litros.");
		}
	}

}
