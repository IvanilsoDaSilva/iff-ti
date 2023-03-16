package BSI.LP.Excercicio02;

import java.util.Scanner;
import java.util.Random;

public class Questao11_2 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		int idade;

		System.out.print("Programa para classificar nadador por idade.");
		System.out.print("\nInsira a idade: ");
		idade = INPUT.nextInt();
		switch (idade) {
			case 1, 2, 3, 4:
				System.out.print("Não há categoria.");
				break;
			case 5, 6, 7:
				System.out.print("A categoria de nadador é infantil A.");
				break;
			case 8, 9, 10:
				System.out.print("A categoria de nadador é infantil B.");
				break;
			case 11, 12, 13:
				System.out.print("A categoria de nadador é juvenil A.");
				break;
			case 14, 15, 16, 17:
				System.out.print("A categoria de nadador é juvenil B.");
				break;
			default:
				System.out.print("A categoria de nadador é Adulto.");
				break;
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho