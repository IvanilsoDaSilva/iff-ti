package BSI.LP.Excercicio01;

import java.util.Scanner;
import java.util.Random;

public class Questao08 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		float peso, altura, imc;

		System.out.print("Programa para calcular IMC.");
		System.out.print("\nInsira o valor do peso: ");
		peso = INPUT.nextFloat();
		System.out.print("Insira o valor da altura: ");
		altura = INPUT.nextFloat();
		imc = peso * (float) Math.pow(altura, 2);
		System.out.print("Valor do IMC: " + imc);
	}
}
// Author : Ivanilso da Silva Conceição Filho