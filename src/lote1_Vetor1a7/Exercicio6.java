package lote1_Vetor1a7;

public class Exercicio6 {

	public static void main(String[] args) {

		int vt[] = new int[20];
		int i;
		int aux;
		int j;

		for (i = 0; i < 20; i++) {
			vt[i] = (int) (Math.random() * 50);
		}

		for (i = 0; i < 19; i++) {
			for (j = i + 1; j < 20; j++) {
				if (vt[i] > vt[j]) {
					aux = vt[i];
					vt[i] = vt[j];
					vt[j] = aux;
				}
			}
		}
		
		for (i = 0; i < 20; i++) {
			System.out.println(vt[i]);
		}
	}

}
