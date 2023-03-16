package LP.Excercicio02;

import java.util.Scanner;
import java.util.Random;

public class Questao08 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		float salario, imprestimo;

		System.out.print("Programa para informar se um imprestimo pode ou não ser efetuado.");
		System.out.print("\nInsira o salário: ");
		salario = INPUT.nextFloat();
		System.out.print("Insira o imprestimo: ");
		imprestimo = INPUT.nextFloat();
		if (imprestimo > salario * 1.3) {
			System.out.print("O imprestimo não pode ser efetuado.");
		} else {
			System.out.print("O imprestimo pode ser efetuado.");
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho