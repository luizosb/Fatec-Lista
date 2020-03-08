package lote1_1a17;

import java.util.Scanner;

public class Exercicio6 {
	
	public static void main (String[]args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Digite o valor de X e de Y:" );
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int Aux = X;
			Aux = X;
			X = Y;
			Y = Aux;
			System.out.println("O valor de X é " + X + ", e o valor de Y é " + Y);
						
		}
		
		
	}

}
