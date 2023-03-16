package LP.Excercicio02;
import java.util.Scanner;
import java.util.Random;

public class Questao06 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		float numero;

		System.out.print("Programa para informar se um numero e multiplo de 3.");
		System.out.print("\nInsira o numero: ");
		numero = INPUT.nextFloat();
		if (numero % 3.0 == 0) {
			System.out.print("O numero é multiplo de 3.");
		} else {
			System.out.print("O numero não é multiplo de 3.");
		}
	}
}
// Author : Ivanilso da Silva Conceição Filho