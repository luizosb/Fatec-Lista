package lote1_Vetor1a7;

public class Exercicio4 {
	
	public static void main(String[] args) {
		
		double vt[] = new double[30];
		int i;
		double MD = 0;
		int AcimaMedia = 0;
		
		for(i=0; i < 30; i++) {
			vt[i] = (double)Math.random()*100;
			MD = MD + vt[i];
		}
		MD = MD/30;
		for(i=0; i < 30; i++) {
			if(vt[i] > MD) {
				AcimaMedia = AcimaMedia + 1;
			} else if (vt[i] < MD) {
				System.out.println("As posições que estão na média são " + i);
			}
		}
		System.out.println("Quantidade acima da média: " + AcimaMedia);
		System.out.println("A média dos valores é de " + MD);
	}

}
