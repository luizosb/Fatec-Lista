package lote1_Proc18a30;

import java.util.Scanner;

public class Exercicio23 {

	public static void main(String[] args) {
		ordem();
	}
	
	public static void ordem() {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Digite 3 primeiros valores em ordem e o um quarto valor qualquer: ");
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = sc.nextInt();
			int D = sc.nextInt();
			if ( D < A ) {
				System.out.println("Em ordem seria " + D + ", " + A + ", " + B + " e " + C);
			} else if(D<B) {
				System.out.println("Em ordem seria " + A + ", " + D + ", " + B + " e " + C);
			} else if (D<C) {
				System.out.println("Em ordem seria " + A + ", " + B + ", " + D + " e " + C);
			} else {
				System.out.println("Em ordem seria " + A + ", " + B + ", " + C + " e " + D);
			}
		}
	}
}
