package LP.Excercicio01;

import java.util.Scanner;
import java.util.Random;

public class Questao06 {
	public static void main(String[] args) {
		Random GERADOR = new Random();
		Scanner INPUT = new Scanner(System.in);
		int numero, antecessor, sucessor;

		System.out.print("Programa para mostrar antecessor e sucessor de um numero.");
		System.out.print("\nInsira o valor do numero: ");
		numero = INPUT.nextInt();
		antecessor = numero - 1;
		sucessor = numero + 1;
		System.out.print("Valor do antecessor: " + antecessor + "\nValor do sucessor: " + sucessor);
	}
}
// Author : Ivanilso da Silva Conceição Filho