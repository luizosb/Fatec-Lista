package lote1_FUN31a45;

import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		Integer N1, N2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		N1 = sc.nextInt();
		System.out.println("Digite um número mai|| que o anteri||: ");
		N2 = sc.nextInt();
		dec(N1, N2);
	}
	
	public static void dec(int N1, int N2) {
		for (int Indice = N1; Indice <= N2; Indice++) {
			if (Indice == 1 || Indice == 2 || Indice == 3 || Indice == 5 || Indice == 7) {
				System.out.println("Os números primos existentes entre eles são " + Indice);
			} else {
				if (Indice / Indice == 1 && Indice / 1 == Indice && Indice % 2 != 0 && Indice % 3 != 0
						&& Indice % 4 != 0 && Indice % 5 != 0 && Indice % 6 != 0 && Indice % 7 != 0 && Indice % 8 != 0
						&& Indice % 9 != 0 && Indice % 10 != 0) {
					System.out.println("Os números primos existentes entre eles são " + Indice);
				} else if (Indice % 2 == 0 || Indice % 3 == 0 || Indice % 4 == 0 || Indice % 5 == 0 || Indice % 6 == 0
						|| Indice % 7 == 0 || Indice % 8 == 0 || Indice % 9 == 0 || Indice % 10 == 0) {
					System.out.println("O número " + Indice + " não é primo.");
				}
			}
		}
		
	}

}
