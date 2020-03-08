package lote1_FUN31a45;

import java.util.Scanner;

public class Exercicio38 {

	static Integer N1, N2;
	static Integer Indice;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		N1 = sc.nextInt();
		N2 = N1 + 99;
		pos();
	}
	
	public static void pos() {
		for (Indice = N1; Indice <= N2; Indice++) {
			if (Indice > 0 && Indice <= 1) {
				System.out.println("O menor valor é " + Indice);
				System.out.println("O maior valor é " + N2);
			} else if (N1 < 0 && N2 > 0) {
				System.out.println("O menor valor é " + 1);
				System.out.println("O maior valor é " + N2);
			} else if (N1 > 0) {
				System.out.println("O menor valor é " + N1);
				System.out.println("O maior valor é " + N2);
			} else if (N2 < 0) {
				System.out.println(" Não existe valores positivos para a série.");
			}
			
		}
	}
}