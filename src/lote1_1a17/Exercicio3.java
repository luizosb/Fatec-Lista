package lote1_1a17;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Digite a base do triângulo e sua altura(nesta ordem): ");
			int B = sc.nextInt();
			int H = sc.nextInt();
			int A = ((B*H)/2);
			System.out.print("A área deste triângulo é de "  +  A );
		}

	}

}
