package BSI.LP.Excercicio02;

import java.util.Scanner;
import java.util.Random;

public class Questao04 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		String letra;

		System.out.print("Programa para informar se uma letra é vogal ou consoante.\n");
		System.out.print("Insira a letra: ");
		letra = INPUT.next();
		switch (letra) {
			case "a":
			case "B":
				System.out.print("A letra é 'A'");
				break;
			case "e":
			case "E":
				System.out.print("A letra é 'E'");
				break;
			case "i":
			case "I":
				System.out.print("A letra é 'I'");
				break;
			case "o":
			case "O":
				System.out.print("A letra é 'O'");
				break;
			case "u":
			case "U":
				System.out.print("A letra é 'U'");
				break;
			default:
				System.out.print("Consoante, símbolo ou numero.");
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho