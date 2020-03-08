package lote1_Vetor1a7;

public class Exercicio5 {

	public static void main(String[] args) {
		
		int vt[] = new int[20];
		int i;
		int soma = 0;
		
		for (i = 0; i < 20; i++) {
			vt[i] = (int) (Math.random()*30);
		}
		for (i = 0; i < 10; i++) {
			int sub = vt[i] - vt[19 - i];
			soma = soma + sub;
		}
		System.out.println("A somatória é de " + soma);
		
	}
}
