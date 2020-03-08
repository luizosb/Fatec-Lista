package lote1_Proc18a30;

import java.util.Scanner;

public class Exercicio19 {

	public static void main(String[] args) {
		decisao();
	}

	public static void decisao() {
		double n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois valores reais: ");
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		if (n1 >= n2) {
			System.out.print("O maior valor �" + n1);
		} else {
			System.out.print("O maior valor �" + n2);
		}
	}
}
