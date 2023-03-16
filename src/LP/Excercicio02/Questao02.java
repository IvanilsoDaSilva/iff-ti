package LP.Excercicio02;

import java.util.Scanner;
import java.util.Random;

public class Questao02 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		float numero1, numero2;
		
		System.out.print("Programa para se dois numeros sao iguais ou maior que um a outro.");
		System.out.print("\nInsira do primeiro numero: ");
		numero1 = INPUT.nextFloat();
		System.out.print("Insira do segundo numero: ");
		numero2 = INPUT.nextFloat();
		if (numero1 == numero2) {
			System.out.print("Os numeros são iguais.");
		} else {
			if (numero1 > numero2) {
				System.out.print("O primeiro numero é maior que o segundo.");
			} else {
				System.out.print("O primeiro numero é menor que o segundo.");
			}
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho