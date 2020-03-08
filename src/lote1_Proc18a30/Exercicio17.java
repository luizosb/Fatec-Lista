package lote1_Proc18a30;

import java.util.Scanner;

public class Exercicio17 {

	public static void main(String[] args) {
		Litros();
	}

	public static void Litros() {
		int horas, vel;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas horas foi de percurso?");
		horas = sc.nextInt();
		System.out.println("De quanto foi a velocidade m�dia?");
		vel = sc.nextInt();
		double litros;
		litros = (vel * horas) / 12;
		System.out.println("Gastou " + litros + " litros de gasolina.");
	}

}
