package lote1_1a17;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Digite a quantidade de horas trabalhadas: ");
			int H = sc.nextInt();
			System.out.println("O valor por hora trabalhada: ");
			double V = sc.nextDouble();
			System.out.println("Percentual de desconto: ");
			double P = sc.nextDouble();
			System.out.println("Quantidade de descendentes: ");
			double D = sc.nextDouble();
			double Sal = H*V;
			double SalLiquido = (Sal - (Sal*P)) + (100*D) ;
			System.out.println("O salário é de " + SalLiquido);
		}

	}

}
