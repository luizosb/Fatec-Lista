package lote1_Proc18a30;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		comb();
	}

	public static void comb() {
		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Digite o número de voltas: ");
			double V = sc.nextDouble();
			System.out.println("Digite a extensão do circuito (em metros): ");
			double EC = sc.nextDouble();
			System.out.println("Digite o tempo de duração, em minutos: ");
			double Tm = sc.nextDouble();
			double VM = (V * (EC / 1000)) / (Tm / 60);
			System.out.println("A velocidade média é de " + VM + " Km/h");
		}
	}
}
