package LP.Excercicio02;

import java.util.Scanner;
import java.util.Random;

public class Questao11_1 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		int idade;

		System.out.print("Programa para classificar nadador por idade.");
		System.out.print("\nInsira a idade: ");
		idade = INPUT.nextInt();
		if (idade >= 18) {
			System.out.print("A categoria de nadador é adulto");
		} else {
			if (idade >= 14) {
				System.out.print("A categoria de nadador é juvenil B");
			} else {
				if (idade >= 11) {
					System.out.print("A categoria de nadador é juvenil A");
				} else {
					if (idade >= 8) {
						System.out.print("A categoria de nadador é infantil B");
					} else {
						if (idade > 4) {
							System.out.print("A categoria de nadador é infantil A");
						} else {
							System.out.print("Não há categoria.");
						}
					}
				}
			}
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho