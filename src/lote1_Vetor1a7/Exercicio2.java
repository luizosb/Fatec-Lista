package lote1_Vetor1a7;

public class Exercicio2 {

	public static void main(String[] args) {

		int vt[] = new int[100];
		int i;
		int maior = 0;
		double MD = 0;
		
		for (i = 0; i < 100; i++) {
			vt[i] = (int) Math.round(Math.random()*100);
		}
		
		int menor = vt[0];
		
		for(i =0; i < 100;i++) {
			if (vt[i] < menor) {
				menor = vt[i];
			}
			if (vt[i] > maior) {
				maior = vt[i];
			}
			MD = MD + vt[i];
		}
		MD = MD/100;
		System.out.println("O maior valor é " + maior);
		System.out.println("O menor valor é " + menor);
		System.out.println("A média é de " + MD);
	}

}
