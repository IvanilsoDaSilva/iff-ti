package LP.Excercicio02;

import java.util.Scanner;
import java.util.Random;

public class Questao09 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		double salario, valorDaVenda, salarioTotal;

		System.out.print("Programa para informar o total do salário de um vendedor.");
		System.out.print("\nInsira o salário: ");
		salario = INPUT.nextFloat();
		System.out.print("Insira o valor em vendas: ");
		valorDaVenda = INPUT.nextFloat();
		salarioTotal = salario + valorDaVenda * 1.03;
		if (valorDaVenda > 1500.0) {
			salarioTotal = salarioTotal + (valorDaVenda - 1500.0) * 1.05;
		}
		System.out.print("O valor total do salário é: " + salarioTotal + ".");
	}
}
// Author : Ivanilso da Silva Conceição Filho