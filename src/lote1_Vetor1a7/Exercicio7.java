package lote1_Vetor1a7;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {

		int vt[] = new int[20];
		int i;
		int aux;
		int j;

		for (i = 0; i < 20; i++) {
			vt[i] = (int) (Math.random() * 50);
		}

		for (i = 0; i < 19; i++) {
			for (j = i + 1; j < 20; j++) {
				if (vt[i] > vt[j]) {
					aux = vt[j];
					vt[j] = vt[i];
					vt[i] = aux;
				}
			}
		}
		for (i = 0; i < 20; i++) {
			System.out.print(vt[i]);
			if ( i < 19) {
				System.out.print(" --> ");
			}
		}
		System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor a qual está a procura: ");
		int x = sc.nextInt();
		int meio = 0;
		int inicio = 0;
		int fim = vt.length-1;
		while (inicio <= fim) {
		         meio = (inicio + fim)/2;
		         if (x == vt[meio]) {
		        	 System.out.println("O valor existe.");
		         }
		         if (x < vt[meio]) {
		             fim = meio - 1;
		         }
		         else {
		             inicio = meio + 1;
		         }
		}
		if ( x != vt[meio]){
			System.out.println("O valor não existe.");
		}
		
	}

}
