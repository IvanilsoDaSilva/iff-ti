package LP.Excercicio01;

import java.util.Scanner;
import java.util.Random;

public class Questao07 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		float valor1, valor2, valor3, media;

		System.out.print("Programa para calcular média ponderada pelos pesos 1,2 e 3.");
		System.out.print("\nInsira o primeiro valor: ");
		valor1 = INPUT.nextFloat();
		System.out.print("Insira o segundo valor: ");
		valor2 = INPUT.nextFloat();
		System.out.print("Insira o terceiro valor: ");
		valor3 = INPUT.nextFloat();
		media = (valor1 + valor2 * 2 + valor3 * 3) / 6;
		System.out.print("Valor da média ponderada: " + media);
	}
}
// Author : Ivanilso da Silva Conceição Filho