package lote1_18a30;

import java.util.Scanner;

public class Exercicio25 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite o horário que começou o jogo	(Horas e depois minutos): ");
			int HI = sc.nextInt();
			int MI = sc.nextInt();
			System.out.println("Digite o horário que terminou o jogo	(Horas e depois minutos): ");
			int HF = sc.nextInt();
			int MF = sc.nextInt();
			if (HF >= HI && MF >= MI) {
				int TH = HF - HI;
				int TM = MF - MI;
				System.out.println("O tempo de jogo foi de" + TH + ":" + TM);
			} else if (HI >= HF && MF >= MI) {
				int TH = (HF + 24) - HI;
				int TM = MF - MI;
				System.out.println("O tempo de jogo foi de" + TH + ":" + TM);
			} else if (HI >= HF && MI >= MF) {
				int TH = (HF + 23) - HI;
				int TM = (MF + 60) - MI;
				System.out.println("O tempo de jogo foi de" + TH + ":" + TM);
			} else {
				int TH = (HF - HI) - 1;
				int TM = (MF + 60) - MI;
				System.out.println("O tempo de jogo foi de" + TH + ":" + TM);
			}

		}
	}
}
