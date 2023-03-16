package BSI.LP.Excercicio02;

import java.util.Scanner;
import java.util.Random;

public class Questao01 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		double numero;

		System.out.print("Programa para ver se um valor numerico é positivo, negativo ou nulo.");
		System.out.print("\nInsira o numero: ");
		numero = INPUT.nextFloat();
		if (numero == 0) {
			System.out.print("O valor é nulo.");
		} else {
			if (numero > 0) {
				System.out.print("O valor é positivo.");
			} else {
				System.out.print("O valor é negativo.");
			}
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho