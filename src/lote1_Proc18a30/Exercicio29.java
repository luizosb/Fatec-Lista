package lote1_Proc18a30;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		invest();
	}
	
	public static void invest() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Qual vai ser o tipo de investimento?(Poupança = 1 e Renda Fixa = 2)");
			double I = sc.nextDouble();
			System.out.println("Quanto será o valor investido? ");
			double RA = sc.nextDouble();
			if (I == 1) {
				double RF = RA * 1.03;
				System.out.println("O valor corrigido é de " + RF);
			} else {
				double RF = RA * 1.05;
				System.out.println("O valor corrigido é de " + RF);
			}			
		}
	}
}
