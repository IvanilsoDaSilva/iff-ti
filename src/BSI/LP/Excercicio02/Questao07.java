package BSI.LP.Excercicio02;

import java.util.Scanner;
import java.util.Random;

public class Questao07 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		float numero;

		System.out.print("Programa para informar se um numero está entre 0 e 100.");
		System.out.print("\nInsira o numero: ");
		numero = INPUT.nextFloat();
		if ((numero > 0.0) && (numero < 100.0)) {
			System.out.print("O numero está entre 0 e 100.");
		} else {
			System.out.print("O numero não está entre 0 e 100.");
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho