package BSI.LP.Excercicio02;

import java.util.Scanner;
import java.util.Random;

public class Questao05 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		int numero;

		System.out.print("Programa para informar se numero inteiro é par ou impar.");
		System.out.print("\nInsira o numero: ");
		numero = INPUT.nextInt();
		if (numero % 2 == 0) {
			System.out.print("O numero é par.");
		} else {
			System.out.print("O numero é impar.");
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho