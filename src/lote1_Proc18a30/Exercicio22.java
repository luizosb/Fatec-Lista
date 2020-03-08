package lote1_Proc18a30;

import java.util.Scanner;

public class Exercicio22 {
	
	public static void main(String[] args) {
		Inteiro();
	}
	
	public static void Inteiro(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 2 valores inteiros diferentes: ");
		int A = sc.nextInt();
		int B = sc.nextInt();
		if(A >= B) {
			System.out.println("Em ordem os valores são " + B + " e " + A);
		} else {
			System.out.println("Em ordem os valores são " + A + " e " + B);
		}
		
	}

}
