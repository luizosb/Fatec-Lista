package lote1_Vetor1a7;

public class Exercicio1 {

	public static void main(String[] args) {

		int vt[] = new int [50];
		int i;
		double MD = 0;
		int cont = 0;
		int somaimpares = 0;
		for  (i = 0; i <50;i ++) {
			vt[i] = (int) Math.round(Math.random()*250);
			if (vt[i] >=10 && vt[i] <= 200) {
				MD = MD + vt[i];
				cont = cont + 1;
			}
			if (vt[i] % 2 != 0) {
				somaimpares = somaimpares + vt[i];
			}
		}
		MD = MD/cont;
		System.out.println("A média dos valores entre 10 e 200 é de " + MD);
		System.out.println("A soma dos números ímpares é de " + somaimpares);
	}

}
