package lote1_1a17;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Digite o raio da circuferência: ");
			double R = sc.nextDouble();
			double C = (2*Math.PI*R);
			System.out.println("A área do circuferência é de " + C);			
		}

	}

}
