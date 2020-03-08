package lote1_Proc18a30;

import java.util.Scanner;

public class Exercicio18 {

	
	public static void main(String[] args) {
		 dif();
	}
	
	public static void dif() {
		int n1, n2, r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois n�meros inteiros: "); 
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		if(n1 >= n2) {
	  	r = n1 - n2; 
	  	System.out.print("O resultado da "+ r);
		} else {
	  	r = n2 - n1; 
	  	System.out.print("O resultado da "+ r); 
		}

	}

}
