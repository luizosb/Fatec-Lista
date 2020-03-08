package lote1_Proc18a30;

import java.util.Scanner;

public class Exercicio16 {

	static double salario, valor;
	static int horas, dependentes, percentual;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o valor recebido por hora: ");
		valor = sc.nextDouble();
		System.out.print("Digite o percentual de desconto: ");
		percentual = sc.nextInt();
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		horas = sc.nextInt();
		System.out.print("Digite a quantidade de dependentes: ");
		dependentes = sc.nextInt();
		ProcSalario();
		System.out.print("O sal�rio liquido � de " + salario);

	}

	public static void ProcSalario() {
		salario = ((horas * valor) - ((horas * valor * percentual) / 100)) + (100 * dependentes);
	}
}
