package lote1_Vetor1a7;

public class Exercicio3 {

	public static void main(String[] args) {
		int vt1[] = new int[3];
		int vt2[] = new int[3];
		int vt3[] = new int[6];
		int i;
		int j;
		int ind;
		
		for (i = 0; i < 3;i ++) {
			vt1[i] = i + 1;  
		}
		for (j = 0; j < 3 ;j++) {
			vt2[j] = j + 4;
		}
		for (ind = 0; ind < 6; ind++) {
			if ( ind < 3 ) {
				vt3[ind] = vt1[ind];
			}
			if ( ind < 6 ) {
				vt3[ind] = vt2[ind - 3];
			}
			System.out.println(vt3[ind]);
		}
	}
}
