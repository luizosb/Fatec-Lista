package lote1_18a30;

import java.util.Scanner;

public class Exercicio21 {
	
	public static void main (String []args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Digite 4 notas dos alunos: ");
			double N1 = sc.nextDouble();
			double N2 = sc.nextDouble();
			double N3 = sc.nextDouble();
			double N4 = sc.nextDouble();
			double MD = (N1 + N2+N3+N4)/4;
			if(MD >= 6) {
				System.out.println("APROVADO!");
			} else if (MD >= 3) {
				System.out.println("EXAME!");
			} else {
				System.out.println("RETIDO!");
			}
		}
	}
}
