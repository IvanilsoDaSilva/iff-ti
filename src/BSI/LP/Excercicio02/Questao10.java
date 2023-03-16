package BSI.LP.Excercicio02;

import java.util.Scanner;
import java.util.Random;

public class Questao10 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		int ano;

		System.out.print("Programa para informar se ano e bissexto ou não.");
		System.out.print("\nInsira o ano: ");
		ano = INPUT.nextInt();
		if (ano % 4 == 0) {
			System.out.print("O ano é bissexto");
		} else {
			System.out.print("O ano não é bissexto");
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho