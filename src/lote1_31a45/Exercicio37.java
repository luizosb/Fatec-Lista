package lote1_31a45;

import java.util.Scanner;

public class Exercicio37 {
	
	public static void main (String []args) {
		Scanner sc = new Scanner(System.in);
		Integer Numero, Indice, SomaFibonacci = null; 
		Integer X, Y, Z; 
		System.out.println("Digite um número inteiro: ");
		Numero = sc.nextInt(); 
		X = Numero - 1;
		Y = Numero - 2;
		System.out.println(Y);
		System.out.println(X);
		  if (Numero < 0) {
		    Numero = Numero;
		  } else {
		      if (Numero == 1) {
		        Numero = 1;
		      }else {
		      }
		  }
		for (Indice = 1; Indice <= 5; Indice++) {
			SomaFibonacci = X + Y;
					Y = X;
					X = SomaFibonacci; 
			
		}
		System.out.println("A série da " + SomaFibonacci);

	}

}
