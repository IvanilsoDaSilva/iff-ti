package LP.Excercicio01;

import java.util.Scanner;
import java.util.Random;

public class Questao09 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		float salarioAtual, reajuste, salarioNovo;

		System.out.print("Programa para calcular reajuste de salário.");
		System.out.print("\nInsira o valor do salário: ");
		salarioAtual = INPUT.nextFloat();
		System.out.print("Insira o valor do reajuste(porcentagem em cima do valor do salário antigo): ");
		reajuste = INPUT.nextFloat();
		salarioNovo = salarioAtual * (reajuste / 100 + 1);
		System.out.print("Valor do salário reajustado: " + salarioNovo);
	}
}
// Author : Ivanilso da Silva Conceição Filho