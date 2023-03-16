package LP.Excercicio02;

import java.util.Scanner;
import java.util.Random;

public class Questao03 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		char letra;
		
		System.out.print("Programa para se informar o sexo.");
		System.out.print("\nInsira a letra: ");
		letra = INPUT.next().charAt(0);
		switch (letra) {
			case 102:
			case 70:
				System.out.print("Sexo feminino.");
				break;
			case 109:
			case 77:
				System.out.print("Sexo masculino.");
				break;
			default:
				System.out.print("Sexo inválido.");
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho